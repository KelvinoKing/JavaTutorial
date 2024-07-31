package view;

import javafx.scene.layout.BorderPane;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.geometry.Pos;
import controller.WarehouseController;


public class WarehouseView extends BorderPane {
  private final MenuBar menuBar = new MenuBar();

  private final Menu orders = new Menu("Orders");
  private final MenuItem incomingOrders = new MenuItem("Orders");
  private final MenuItem waitingCollection = new MenuItem("Waiting Collection");
  private final MenuItem dispatchedOrder = new MenuItem("Dispatched Orders");

  private final Menu inventory = new Menu("Inventory");
  private final MenuItem addProduct = new MenuItem("Add Product");
  private final MenuItem viewProducts = new MenuItem("View Products");
  private final MenuItem productRecords = new MenuItem("Product Records");

  private final Menu reports = new Menu("Reports");
  private final MenuItem inventoryReport = new MenuItem("Inventory Report");

  private final Menu help = new Menu("Help");
  private final MenuItem about = new MenuItem("About");
  private final MenuItem contact = new MenuItem("Contact");

  public WarehouseView() {
    super();
    menuBar.getMenus().addAll(
      orders, inventory, reports, help
    );

    orders.getItems().addAll(
      incomingOrders, waitingCollection, dispatchedOrder
    );

    inventory.getItems().addAll(
      addProduct, viewProducts, productRecords
    );

    reports.getItems().addAll(
      inventoryReport
    );

    help.getItems().addAll(
      about, contact
    );

    this.setTop(menuBar);
    BorderPane.setAlignment(menuBar, Pos.TOP_CENTER);

    addProduct.setOnAction(e -> {
      WarehouseController.addProduct();
    });
  }
}
