package controller;

import main.App;
import model.Order;


public class SalesController {
  private Order order;

  public SalesController() {
    App.addCenterSales();
  }  

  public void createOrder(
    String firstName, String lastName, String email, String phoneNumber,
    String country, String city, String location, Boolean roofsheets, Boolean rollTops,
    Boolean valleys, Boolean gutters, String profile, String colors, String texture,
    int gauge, int quantity, double perMeter) {

    if (roofsheets) {
      order = new Order(
        firstName, lastName, email, phoneNumber, country, city, location, "Roof Sheets",
        profile, colors, texture, gauge, quantity, perMeter);
    }
    if (rollTops) {
      order = new Order(firstName, lastName, email, phoneNumber, country, city, location, "Roll Tops",
      profile, colors, texture, gauge, quantity, perMeter);
    }
    if (valleys) {
      order = new Order(firstName, lastName, email, phoneNumber, country, city, location, "Valleys",
      profile, colors, texture, gauge, quantity, perMeter);
    }
    if (gutters) {
      order = new Order(firstName, lastName, email, phoneNumber, country, city, location, "Gutters",
      profile, colors, texture, gauge, quantity, perMeter);
    }

    // Print the order details
    System.out.println(order.toString());
  }

  public void updateOrders() {
    System.out.println(order.toString());
  }
}
