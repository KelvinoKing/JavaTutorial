package utils;


import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

import model.Order;

public class Storage {
    private static final String FILE_PATH = "src/data/objects.json";

    @SuppressWarnings("unchecked")
    public void saveObject(Object object) {
        // Save all objects to a JSON file
        JSONObject jsonObject = new JSONObject();
        String objectType = object.getClass().getSimpleName();
        switch (objectType) {
            case "Order":
                Order order = (Order) object;
                String objectKey = "order." + order.getOrderNumber();
                jsonObject.put(objectKey, order.toString());
                break;
            default:
                break;
        }

        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                file.createNewFile();
            }
            // reload the file to append the new object
            JSONObject jsonObjectReloaded = (JSONObject) reloadObjects();
            jsonObjectReloaded.putAll(jsonObject);
            // Write the file
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            fileWriter.write(jsonObjectReloaded.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Load all objects from the JSON file
     * return a dictionary of objects
     * @return
     */
    public HashMap<String, Object> loadObjects() {
        HashMap<String, Object> objectsMap = new HashMap<>();
        JSONParser jsonParser = new JSONParser();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            for (Object key : jsonObject.keySet()) {
                String objectKey = (String) key;
                String objectData = (String) jsonObject.get(objectKey);

                // Parse the object data based on its type
                if (objectKey.startsWith("order.")) {
                    Order order = parseOrder(objectData);
                    objectsMap.put(objectKey, order);
                }
                // Add more types here if needed
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return objectsMap;
    }

    /**
     * Parses the JSON string back to an Order object.
     *
     * @param data The JSON string representing the Order object.
     * @return The Order object.
     */
    private Order parseOrder(String data) {
        // Implement the parsing logic to convert data back to Order object
        // Assuming the Order class has a fromString method to handle this
        return Order.fromString(data);
    }

    /**
     * Reload the JSON data from the file 
     * return the data 
     */
    public JSONObject reloadObjects() {
        JSONObject jsonObject = new JSONObject();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            JSONParser jsonParser = new JSONParser();
            jsonObject = (JSONObject) jsonParser.parse(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
