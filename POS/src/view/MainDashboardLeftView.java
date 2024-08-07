package view;

import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import controller.SalesController;
import controller.AccountsController;
import controller.ProductionController;
import controller.WarehouseController;
import controller.HumanResourceController;
import controller.AdminController;


public class MainDashboardLeftView extends VBox {

  private Button btSales;
  private Button btAccounts;
  private Button btProduction;
  private Button btWarehouse;
  private Button btAdmin;
  private Button btHR;

  public MainDashboardLeftView() {
    super();

    btSales = new Button();
    ImageView ivSales = new ImageView("file:images/SalesDept.png");
    ivSales.setFitHeight(50);
    ivSales.setFitWidth(50);
    ivSales.setPreserveRatio(true);
    ivSales.setSmooth(true);
    btSales.setGraphic(ivSales);
    btSales.getStyleClass().add("file-button");
    btSales.setTooltip(new Tooltip("Sales"));

    btAccounts = new Button();
    ImageView ivAccounts = new ImageView("file:images/Accounts.png");
    ivAccounts.setFitHeight(50);
    ivAccounts.setFitWidth(50);
    ivAccounts.setPreserveRatio(true);
    ivAccounts.setSmooth(true);
    btAccounts.setGraphic(ivAccounts);
    btAccounts.getStyleClass().add("file-button");
    btAccounts.setTooltip(new Tooltip("Accounts"));

    btProduction = new Button();
    ImageView ivProduction = new ImageView("file:images/ProductionDept.png");
    ivProduction.setFitHeight(50);
    ivProduction.setFitWidth(50);
    ivProduction.setPreserveRatio(true);
    ivProduction.setSmooth(true);
    btProduction.setGraphic(ivProduction);
    btProduction.getStyleClass().add("file-button");
    btProduction.setTooltip(new Tooltip("Production"));

    btWarehouse = new Button();
    ImageView ivWarehouse = new ImageView("file:images/WarehouseDept.png");
    ivWarehouse.setFitHeight(50);
    ivWarehouse.setFitWidth(50);
    ivWarehouse.setPreserveRatio(true);
    ivWarehouse.setSmooth(true);
    btWarehouse.setGraphic(ivWarehouse);
    btWarehouse.getStyleClass().add("file-button");
    btWarehouse.setTooltip(new Tooltip("Warehouse"));

    btAdmin = new Button();
    ImageView ivAdmin = new ImageView("file:images/admin.png");
    ivAdmin.setFitHeight(50);
    ivAdmin.setFitWidth(50);
    ivAdmin.setPreserveRatio(true);
    ivAdmin.setSmooth(true);
    btAdmin.setGraphic(ivAdmin);
    btAdmin.getStyleClass().add("file-button");
    btAdmin.setTooltip(new Tooltip("Admin"));

    btHR = new Button();
    ImageView ivHR = new ImageView("file:images/human-resource.png");
    ivHR.setFitHeight(50);
    ivHR.setFitWidth(50);
    ivHR.setPreserveRatio(true);
    ivHR.setSmooth(true);
    btHR.setGraphic(ivHR);
    btHR.getStyleClass().add("file-button");
    btHR.setTooltip(new Tooltip("Human Resource"));

    this.getChildren().addAll(btSales, btAccounts, btProduction, btWarehouse, btHR, btAdmin);

    btSales.setOnAction(e -> {
      new SalesController();
      // Set left border color to white 4px
      btSales.setStyle("-fx-border-color: white; -fx-border-width: 0.8px;");
      btAccounts.setStyle("-fx-border-color: none;");
      btProduction.setStyle("-fx-border-color: none;");
      btWarehouse.setStyle("-fx-border-color: none;");
      btHR.setStyle("-fx-border-color: none;");
      btAdmin.setStyle("-fx-border-color: none;");
    });

    btAccounts.setOnAction(e -> {
      new AccountsController();
      // Reset the btSales border color
      btAccounts.setStyle("-fx-border-color: white; -fx-border-width: 0.8px;");
      btSales.setStyle("-fx-border-color: none;");
      btProduction.setStyle("-fx-border-color: none;");
      btWarehouse.setStyle("-fx-border-color: none;");
      btHR.setStyle("-fx-border-color: none;");
      btAdmin.setStyle("-fx-border-color: none;");
    });

    btProduction.setOnAction(e -> {
      new ProductionController();
      btProduction.setStyle("-fx-border-color: white; -fx-border-width: 0.8px;");
      btSales.setStyle("-fx-border-color: none;");
      btAccounts.setStyle("-fx-border-color: none;");
      btWarehouse.setStyle("-fx-border-color: none;");
      btHR.setStyle("-fx-border-color: none;");
      btAdmin.setStyle("-fx-border-color: none;");
    });

    btWarehouse.setOnAction(e -> {
      new WarehouseController();
      btWarehouse.setStyle("-fx-border-color: white; -fx-border-width: 0.8px;");
      btSales.setStyle("-fx-border-color: none;");
      btAccounts.setStyle("-fx-border-color: none;");
      btProduction.setStyle("-fx-border-color: none;");
      btHR.setStyle("-fx-border-color: none;");
      btAdmin.setStyle("-fx-border-color: none;");
    });

    btHR.setOnAction(e -> {
      new HumanResourceController();
      btHR.setStyle("-fx-border-color: white; -fx-border-width: 0.8px;");
      btSales.setStyle("-fx-border-color: none;");
      btAccounts.setStyle("-fx-border-color: none;");
      btProduction.setStyle("-fx-border-color: none;");
      btWarehouse.setStyle("-fx-border-color: none;");
      btAdmin.setStyle("-fx-border-color: none;");
    });

    btAdmin.setOnAction(e -> {
      new AdminController();
      btAdmin.setStyle("-fx-border-color: white; -fx-border-width: 0.8px;");
      btSales.setStyle("-fx-border-color: none;");
      btAccounts.setStyle("-fx-border-color: none;");
      btProduction.setStyle("-fx-border-color: none;");
      btWarehouse.setStyle("-fx-border-color: none;");
      btHR.setStyle("-fx-border-color: none;");
    });
  }
}
