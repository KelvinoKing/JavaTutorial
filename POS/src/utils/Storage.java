package utils;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Date;

import model.Order;

public class Storage {

    private Order order;

    // Save the order to a csv file
    public void saveOrder(Order order) {
        // Create a new file

        File file = new File("order.csv");

        FileWriter fileWriter = null;
        // Append the order details to the file
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(
                order.getOrderNumber() + "," + order.getCustomerFirstName() + "," + order.getCustomerLastName() + "," +
                order.getCustomerEmail() + "," + order.getCustomerPhoneNumber() + "," + order.getCustomerLocation() + "," +
                order.getCustomerCity() + "," + order.getCustomerCountry() + "," + order.getProductName() + "," +
                order.getProductProfile() + "," + order.getProductColor() + "," + order.getProductTexture() + "," +
                order.getProductGauge() + "," + order.getProductQuantity() + "," + order.getProductPerMeter() + "," +
                order.getOrderDate() + "," + order.getOrderStatus() + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Load the order from a csv file
    public Order loadOrder() {
        // Load the order details from the file
        File file = new File("order.csv");
        BufferedReader bufferedReader = null;
        this.order = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                order = new Order(
                    data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8],
                    data[9], data[10], data[11], Integer.parseInt(data[12]), Integer.parseInt(data[13]),
                    Double.parseDouble(data[14]));

                //  Convert the order date to a Date object
                Date date = Date.valueOf(data[15]);
                order.setOrderDate(date);
                order.setOrderNumber(data[0]);
                order.setOrderStatus(data[16]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return order;
    }
}
