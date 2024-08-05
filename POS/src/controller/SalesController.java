package controller;

import main.App;
import model.Order;
import utils.Storage;


public class SalesController {
  private Order order;

  public SalesController() {
    App.addCenterSales();
  }  

  public void createOrder(
    String firstName, String lastName, String email, String phoneNumber,
    String city, String country, String location, Boolean roofsheets, Boolean rollTops,
    Boolean valleys, Boolean gutters, String profile, String colors, String texture,
    int gauge, int quantity, double perMeter) {

    if (roofsheets) {
      order = new Order(
        firstName, lastName, email, phoneNumber, city, country, location, "Roof Sheets",
        profile, colors, texture, gauge, quantity, perMeter);
    }
    if (rollTops) {
      order = new Order(firstName, lastName, email, phoneNumber, city, country, location, "Roll Tops",
      profile, colors, texture, gauge, quantity, perMeter);
    }
    if (valleys) {
      order = new Order(firstName, lastName, email, phoneNumber, city, country, location, "Valleys",
      profile, colors, texture, gauge, quantity, perMeter);
    }
    if (gutters) {
      order = new Order(firstName, lastName, email, phoneNumber, city, country, location, "Gutters",
      profile, colors, texture, gauge, quantity, perMeter);
    }

    Storage storage = new Storage();
    storage.saveObject(order);
  }

  public void updateOrders() {
  }
}
