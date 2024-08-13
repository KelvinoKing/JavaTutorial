package utils;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

import model.Order;
import model.Products;

public class Storage {
    private static final String FILE_PATH = "src/data/objects.json";
    private String[] objectTypes = {"order"};

    @SuppressWarnings("unchecked")
    public void saveObject(Object object) {
        // Save all objects to a JSON file
        JSONObject jsonObject = new JSONObject();
        String objectType = object.getClass().getSimpleName();
        switch (objectType) {
            case "Order":
                Order order = (Order) object;
                String objectKey = "Order." + order.getId();
                jsonObject.put(objectKey, order.toString());
                break;
            case "Products":
                Products products = (Products) object;
                objectKey = "Products." + products.getId();
                jsonObject.put(objectKey, products.toString());
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

        // Check if the file exists
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return objectsMap;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            for (Object key : jsonObject.keySet()) {
                String objectKey = (String) key;
                String objectData = (String) jsonObject.get(objectKey);
                String[] objectKeyParts = objectKey.split("\\.");
                String objectType = objectKeyParts[0];
                switch (objectType) {
                    case "Order":
                        Order order = parseOrder(objectData);
                        objectsMap.put(objectKey, order);
                        break;
                    case "Products":
                        Products products = parseProducts(objectData);
                        objectsMap.put(objectKey, products);
                        break;
                    default:
                        break;
                }
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
     * Parses the JSON string back to a Products object.
     *
     * @param data The JSON string representing the Products object.
     * @return The Products object.
     */
    private Products parseProducts(String data) {
        // Implement the parsing logic to convert data back to Products object
        // Assuming the Products class has a fromString method to handle this
        return Products.fromString(data);
    }

    /**
     * Reload the JSON data from the file 
     * return the data 
     */
    public JSONObject reloadObjects() {
        JSONObject jsonObject = new JSONObject();

        // Check if the file exists
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return jsonObject;
        }
        if (file.length() == 0) {
            try (FileWriter fileWriter = new FileWriter(FILE_PATH)) {
                fileWriter.write("{}");
                fileWriter.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            JSONParser jsonParser = new JSONParser();
            jsonObject = (JSONObject) jsonParser.parse(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     * Update the object in the JSON file
     * 
     * @param object
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public void updateObject(Object object) {
        String passedObjectType = object.getClass().getSimpleName();
        String objectKey = "";
        JSONObject jsonObject = new JSONObject();

            for (String objectType : objectTypes) {
                if (objectType.equals(passedObjectType)) {
                    switch (objectType) {
                        case "Order":
                            Order order = (Order) object;
                            objectKey = "Order." + order.getId();
                            jsonObject.put(objectKey, order.toString());
                            System.out.println(objectKey);
                            break;
                        case "Products":
                            Products products = (Products) object;
                            objectKey = "Products." + products.getId();
                            jsonObject.put(objectKey, products.toString());
                            break;
                        default:
                            break;
                    }
                }
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
     * Delete the object from the JSON file
     * 
     * @param object
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public void deleteObject(String objectId) {
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObjectReloaded = (JSONObject) reloadObjects();
        for (Object key : jsonObjectReloaded.keySet()) {
            String objectKey = (String) key;
            // Separate the object key to have the object id
            String[] objectKeyParts = objectKey.split("\\.");
            String newObjectId = objectKeyParts[1];
            if (newObjectId.equals(objectId)) {
                continue;
            } else {
                jsonObject.put(objectKey, jsonObjectReloaded.get(objectKey));
            }
        }

        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                file.createNewFile();
            }
            // Write the file
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
