package view;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.MenuBar;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
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

    addProduct.setOnAction(e -> addProductPane());
  }

  public void addProductPane() {
    GridPane addProductPane = new GridPane();
    HBox addProductBox = new HBox();
    addProductBox.setAlignment(Pos.CENTER);
    addProductBox.setSpacing(10);
    addProductBox.setPadding(new Insets(10, 10, 10, 10));

    addProductPane.setAlignment(Pos.CENTER);
    addProductPane.setHgap(10);
    addProductPane.setVgap(10);

    Label coilNumberLabel = new Label("Coil Number");
    addProductPane.add(coilNumberLabel, 0, 0);
    TextField coilNumberText = new TextField();
    addProductPane.add(coilNumberText, 1, 0);
    Label metersLabel = new Label("Meters");
    addProductPane.add(metersLabel, 2, 0);
    TextField metersText = new TextField();
    addProductPane.add(metersText, 3, 0);
    Label weightLabel = new Label("Weight");
    addProductPane.add(weightLabel, 0, 1);
    TextField weightText = new TextField();
    addProductPane.add(weightText, 1, 1);
    Label gaugeLabel = new Label("Gauge");
    addProductPane.add(gaugeLabel, 2, 1);
    TextField gaugeText = new TextField();
    addProductPane.add(gaugeText, 3, 1);
    Label widthLabel = new Label("Width");
    addProductPane.add(widthLabel, 0, 2);
    TextField widthText = new TextField();
    addProductPane.add(widthText, 1, 2);
    Label colorLabel = new Label("Color");
    addProductPane.add(colorLabel, 2, 2);
    TextField colorText = new TextField();
    addProductPane.add(colorText, 3, 2);
    Label textureLabel = new Label("Texture");
    addProductPane.add(textureLabel, 0, 3);
    TextField textureText = new TextField();
    addProductPane.add(textureText, 1, 3);

    Button addProductButton = new Button("Add Product");
    Button cancelAddProductButton = new Button("Cancel");
    addProductBox.getChildren().addAll(addProductButton, cancelAddProductButton);
    addProductPane.add(addProductBox, 0, 4, 4, 1);

    Stage popUpStage = new Stage();
    Scene popUpScene = new Scene(addProductPane, 600, 400);
    popUpStage.setScene(popUpScene);
    popUpStage.show();


    addProductButton.setOnAction(e -> {
      // Check all the fields are filled
      if (
        coilNumberText.getText().isEmpty() || metersText.getText().isEmpty() ||
        weightText.getText().isEmpty() || gaugeText.getText().isEmpty() ||
        widthText.getText().isEmpty() || colorText.getText().isEmpty() || textureText.getText().isEmpty()) {
          showAllert("All fields are required");
          return;
        } else {
          try {
            double meters = Double.parseDouble(metersText.getText());
            double weight = Double.parseDouble(weightText.getText());
            int gauge = Integer.parseInt(gaugeText.getText());
            double width = Double.parseDouble(widthText.getText());

            WarehouseController warehouseController = new WarehouseController();

            warehouseController.addProduct(
              coilNumberText.getText(), meters, weight, gauge, width, colorText.getText(), textureText.getText());
              popUpStage.close();
          } catch (NumberFormatException ex) {
            showAllert("Invalid input");
            return;
          }
        }
      });

    cancelAddProductButton.setOnAction(e -> {
      popUpStage.close();
    });
  }

  private void viewProductsPane() {
    
  }

  private void showAllert(String message) {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Error");
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
  }
}
