package controller;

import main.App;
import model.Products;
import utils.Storage;


public class WarehouseController {
  private Products product;

  public WarehouseController() {
    // Add the Warehouse view to the center of the app window
    App.addCenterWarehouse();
  }

  public void addProduct(
    String coilNumber, double meters, double weight, int gauge, double width, String color, String texture
    ) {
    // Create a new product
    product = new Products(meters, weight, gauge, width, color, texture, coilNumber);

    // Save the product to the storage
    Storage storage = new Storage();
    storage.saveObject(product);
  }
}
