package view;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import main.App;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;

import java.util.Observable;

import controller.SalesController;
import model.Order;


public class SalesView extends BorderPane {
  private final MenuBar menuBar = new MenuBar();

  private final Menu orders = new Menu("Orders");
  private final MenuItem createOrder = new MenuItem("Create Order");
  private final MenuItem pendingOrder = new MenuItem("Pending Orders");
  private final MenuItem completedOrder = new MenuItem("Completed Orders");

  private final Menu customers = new Menu("Customers");
  private final MenuItem addCustomer = new MenuItem("Add Customer");
  private final MenuItem viewCustomers = new MenuItem("View Customers");
  private final MenuItem customerReport = new MenuItem("Customer Report");

  private final Menu inventory = new Menu("Inventory");
  private final MenuItem viewProducts = new MenuItem("View Products");

  private final Menu payments = new Menu("Payments");
  private final MenuItem viewPayments = new MenuItem("View Payments");
  private final MenuItem paymentReport = new MenuItem("Payment Report");

  private final Menu records = new Menu("Records");
  private final MenuItem orderRecords = new MenuItem("Order Records");
  private final MenuItem customerRecords = new MenuItem("Customer Records");
  private final MenuItem productRecords = new MenuItem("Product Records");
  private final MenuItem paymentRecords = new MenuItem("Payment Records");

  private final Menu reports = new Menu("Reports");
  private final MenuItem salesReport = new MenuItem("Sales Report");
  private final MenuItem salesSummary = new MenuItem("Sales Summary");
  private final MenuItem salesByCustomer = new MenuItem("Sales By Customer");
  private final MenuItem salesByProduct = new MenuItem("Sales By Product");

  private final Menu promoAndDisc = new Menu("Promotions & Discounts");
  private final MenuItem addPromo = new MenuItem("Add Promotion");
  private final MenuItem viewPromo = new MenuItem("View Promotions");
  private final MenuItem addDiscount = new MenuItem("Add Discount");
  private final MenuItem viewDiscount = new MenuItem("View Discounts");

  private final Menu help = new Menu("Help");
  private final MenuItem about = new MenuItem("About");
  private final MenuItem contact = new MenuItem("Contact");

  public SalesView() {
    super();
    menuBar.getMenus().addAll(
      orders, customers, inventory, payments, records, reports, promoAndDisc, help
    );

    orders.getItems().addAll(createOrder, pendingOrder, completedOrder);
    customers.getItems().addAll(addCustomer, viewCustomers, customerReport);
    inventory.getItems().addAll(viewProducts);
    payments.getItems().addAll(viewPayments, paymentReport);
    records.getItems().addAll(orderRecords, customerRecords, productRecords, paymentRecords);
    reports.getItems().addAll(salesReport, salesSummary, salesByCustomer, salesByProduct);
    promoAndDisc.getItems().addAll(addPromo, viewPromo, addDiscount, viewDiscount);
    help.getItems().addAll(about, contact);

    setTop(menuBar);
    BorderPane.setAlignment(menuBar, Pos.TOP_CENTER);

    createOrder.setOnAction(e -> createOrderPane());
    pendingOrder.setOnAction(e -> pendingOrderPane());
    completedOrder.setOnAction(e -> completedOrderPane());
  }

  public void createOrderPane(){

    GridPane  gridPane = new GridPane();
    HBox hBox = new HBox();
    Button btnCreateOrder = new Button("Create Order");
    btnCreateOrder.setStyle("-fx-background-color: green; -fx-text-fill: white;");
    Button btnCancel = new Button("Cancel");
    btnCancel.setStyle("-fx-background-color: red; -fx-text-fill: white;");

    hBox.getChildren().addAll(btnCreateOrder, btnCancel);
    hBox.setAlignment(Pos.BOTTOM_RIGHT);
    hBox.setSpacing(10);

    ScrollPane  scrollPane = new ScrollPane();
    gridPane.setAlignment(Pos.CENTER);
    gridPane.setHgap(5);
    gridPane.setVgap(5);

    Label lbFirstName = new Label("First Name");
    Label lbLastName = new Label("Last Name");
    Label lbEmail = new Label("Email");
    Label lbPhoneNumber = new Label("Phone Number");
    Label lbCountry = new Label("Country");
    Label lbCity = new Label("City");
    Label lbLocation = new Label("Location");
    Label lbProductName = new Label("Product");
    Label lbProfile = new Label("Profile");
    Label lbColor = new Label("Color");
    Label lbTexture = new Label("Texture");
    Label lbGauge = new Label("Gauge");
    Label lbQuantity = new Label("Quantity");
    Label lbPerMeter = new Label("Per Meter");

    // Add all labels in an array and give them a color
    Label[] labels = {
      lbFirstName, lbLastName, lbEmail, lbPhoneNumber, lbCountry, lbCity, lbLocation,
      lbProductName, lbProfile, lbColor, lbTexture, lbGauge, lbQuantity, lbPerMeter
    };

    for (Label label : labels) {
      label.setStyle("-fx-text-fill: red;");
    }
  
    TextField  txtFirstName = new TextField();
    TextField  txtLastName = new TextField();
    TextField  txtEmail = new TextField();
    TextField  txtPhoneNumber = new TextField();
    TextField  txtCountry = new TextField();
    TextField  txtCity = new TextField();
    TextField  txtLocation = new TextField();
    TextField tfGauge = new TextField();
    TextField tfQuantity = new TextField();
    TextField tfPerMeter = new TextField();
    
  
    CheckBox cbRoofsheets = new CheckBox("Roof Sheets");
    CheckBox cbRollTops = new CheckBox("Rool Top Gutters");
    CheckBox cbValleys = new CheckBox("Valleys");
    CheckBox cbGutters = new CheckBox("Gutters");
  
      //  Profile
    RadioButton rbBoxProfile = new RadioButton("Box Profile");
    RadioButton rbCorrugated = new RadioButton("Corrugated");
    RadioButton rbEuroTileProfile = new RadioButton("Euro Tile Profile");
    RadioButton rbRomanTileProfile = new RadioButton("Roman Tile Profile");
    RadioButton rbZeeTileProfile = new RadioButton("Zee Tile Profile");
    ToggleGroup tgProfile = new ToggleGroup();
    rbBoxProfile.setToggleGroup(tgProfile);
    rbCorrugated.setToggleGroup(tgProfile);
    rbEuroTileProfile.setToggleGroup(tgProfile);
    rbRomanTileProfile.setToggleGroup(tgProfile);
    rbZeeTileProfile.setToggleGroup(tgProfile);
  
    //  Color
    RadioButton rbBlack = new RadioButton("Black");
    RadioButton rbBlue = new RadioButton("Blue");
    RadioButton rbBrown = new RadioButton("Brown");
    RadioButton rbGreen = new RadioButton("Green");
    RadioButton rbRed = new RadioButton("Red");
    ToggleGroup tgColor = new ToggleGroup();
    rbBlack.setToggleGroup(tgColor);
    rbBlue.setToggleGroup(tgColor);
    rbBrown.setToggleGroup(tgColor);
    rbGreen.setToggleGroup(tgColor);
    rbRed.setToggleGroup(tgColor);
  
    //  Texture
    RadioButton rbGlosy = new RadioButton("Glosy");
    RadioButton rbMatt = new RadioButton("Matt");
    ToggleGroup tgTexture = new ToggleGroup();
    rbGlosy.setToggleGroup(tgTexture);
    rbMatt.setToggleGroup(tgTexture);

    gridPane.add(lbFirstName, 0, 0);
    gridPane.add(txtFirstName, 1, 0);

    gridPane.add(lbLastName, 2, 0);
    gridPane.add(txtLastName, 3, 0);

    gridPane.add(lbEmail, 0, 2);
    gridPane.add(txtEmail, 1, 2);

    gridPane.add(lbPhoneNumber, 2, 2);
    gridPane.add(txtPhoneNumber, 3, 2);

    gridPane.add(lbCountry, 0, 3);
    gridPane.add(txtCountry, 1, 3);

    gridPane.add(lbCity, 2, 3);
    gridPane.add(txtCity, 3, 3);

    gridPane.add(lbLocation, 0, 4);
    gridPane.add(txtLocation, 1, 4);

    gridPane.add(lbProductName, 0, 6);
    gridPane.add(cbRoofsheets, 0, 7);
    gridPane.add(cbRollTops, 1, 7);
    gridPane.add(cbValleys, 0, 8);
    gridPane.add(cbGutters, 1, 8);

    gridPane.add(lbProfile, 0, 9);
    gridPane.add(rbBoxProfile, 0, 10);
    gridPane.add(rbCorrugated, 1, 10);
    gridPane.add(rbEuroTileProfile, 0, 11);
    gridPane.add(rbRomanTileProfile, 1, 11);
    gridPane.add(rbZeeTileProfile, 0, 12);

    gridPane.add(lbColor, 0, 13);
    gridPane.add(rbBlack, 0, 14);
    gridPane.add(rbBlue, 1, 14);
    gridPane.add(rbBrown, 0, 15);
    gridPane.add(rbGreen, 1, 15);
    gridPane.add(rbRed, 0, 16);

    gridPane.add(lbTexture, 0, 17);
    gridPane.add(rbGlosy, 0, 18);
    gridPane.add(rbMatt, 1, 18);

    gridPane.add(lbGauge, 0, 19);
    gridPane.add(tfGauge, 1, 19);

    gridPane.add(lbQuantity, 2, 19);
    gridPane.add(tfQuantity, 3, 19);

    gridPane.add(lbPerMeter, 0, 20);
    gridPane.add(tfPerMeter, 1, 20);

    gridPane.add(hBox, 0, 21, 5, 5);

    scrollPane.setContent(gridPane);
    scrollPane.setFitToWidth(true);
    scrollPane.setFitToHeight(true);

    Stage popupStage = new Stage();
    Scene popupScene = new Scene(scrollPane, 800, 600);
    popupStage.setTitle("Create Order");
    popupStage.setScene(popupScene);
    popupStage.show();

    btnCancel.setOnAction(e -> popupStage.close());
    btnCreateOrder.setOnAction(e -> {
      SalesController salesController = new SalesController();

      // Check all data before creating an order
      if(txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtEmail.getText().isEmpty() ||
      txtPhoneNumber.getText().isEmpty() || txtCountry.getText().isEmpty() || txtCity.getText().isEmpty() ||
      txtLocation.getText().isEmpty() || tfGauge.getText().isEmpty() || tfQuantity.getText().isEmpty() ||
      tfPerMeter.getText().isEmpty()) {
        showAlert("All fields are required");
        return;
      }

      // Pass only the selected value of the toggle group
      String profile = "";
      String color = "";
      String texture = "";
      int gauge = 0;
      int quantity = 0;
      double perMeter = 0;

      if(rbBoxProfile.isSelected()) {
        profile = rbBoxProfile.getText();
      }
      if(rbCorrugated.isSelected()) {
        profile = rbCorrugated.getText();
      }
      if(rbEuroTileProfile.isSelected()) {
        profile = rbEuroTileProfile.getText();
      }
      if(rbRomanTileProfile.isSelected()) {
        profile = rbRomanTileProfile.getText();
      }
      if(rbZeeTileProfile.isSelected()) {
        profile = rbZeeTileProfile.getText();
      }

      if(rbBlack.isSelected()) {
        color = rbBlack.getText();
      }
      if(rbBlue.isSelected()) {
        color = rbBlue.getText();
      }
      if(rbBrown.isSelected()) {
        color = rbBrown.getText();
      }
      if(rbGreen.isSelected()) {
        color = rbGreen.getText();
      }
      if(rbRed.isSelected()) {
        color = rbRed.getText();
      }

      if(rbGlosy.isSelected()) {
        texture = rbGlosy.getText();
      }
      if(rbMatt.isSelected()) {
        texture = rbMatt.getText();
      }

      try {
        gauge = Integer.parseInt(tfGauge.getText());
        quantity = Integer.parseInt(tfQuantity.getText());
        perMeter = Double.parseDouble(tfPerMeter.getText());
      } catch (NumberFormatException ex) {
        showAlert("Gauge, Quantity and Per Meter must be numbers");
        return;
      }

      salesController.createOrder(
        txtFirstName.getText(), txtLastName.getText(), txtEmail.getText(), txtPhoneNumber.getText(),
        txtCountry.getText(), txtCity.getText(), txtLocation.getText(),
        cbRoofsheets.isSelected(), cbRollTops.isSelected(), cbValleys.isSelected(), cbGutters.isSelected(),
        profile, color, texture, gauge, quantity, perMeter
      );

      popupStage.close();
    });
  }

  public static void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

  @SuppressWarnings("unchecked")
  public void pendingOrderPane(){
    // Use table view to display pending orders
    TableView<Order> orderTable = new TableView<>();
    ObservableList<Order> orderList = FXCollections.observableArrayList(
      new Order(
        "John", "Doe", "knjoroge@gmail.com",
        "0712345678", "Nairobi", "Kenya", "Kasarani", "Roof Sheets", "Box Profile", "Black", "Glosy", 30, 10, 100.0),
      new Order("Jane", "Doe", "janedoe@outlook.com",
        "0712345678", "Nairobi", "Kenya", "Kasarani", "Roll Tops", "Corrugated", "Blue", "Matt", 32, 20, 150.0)
    );

    orderTable.setItems(orderList);
    orderTable.setEditable(false);
    orderTable.setPlaceholder(new Label("No data to show yet"));

    // Make rows to listen for double click
    orderTable.setRowFactory(tv -> {
      TableRow<Order> row = new TableRow<>();
      row.setOnMouseClicked(event -> {
        if (event.getClickCount() == 2 && (!row.isEmpty())) {
          Order rowData = row.getItem();
          System.out.println(rowData.toString());
        }
      });
      return row;
    });

    // Add columns to the table
    TableView.TableViewSelectionModel<Order> selectionModel = orderTable.getSelectionModel();
    selectionModel.setSelectionMode(SelectionMode.MULTIPLE);

    TableColumn<Order, String> colFirstName = new TableColumn<>("First Name");
    colFirstName.setCellValueFactory(new PropertyValueFactory<>("customerFirstName"));

    TableColumn<Order, String> colLastName = new TableColumn<>("Last Name");
    colLastName.setCellValueFactory(new PropertyValueFactory<>("customerLastName"));

    TableColumn<Order, String> colEmail = new TableColumn<>("Email");
    colEmail.setCellValueFactory(new PropertyValueFactory<>("customerEmail"));

    TableColumn<Order, String> colPhoneNumber = new TableColumn<>("Phone Number");
    colPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("customerPhoneNumber"));

    TableColumn<Order, String> colCountry = new TableColumn<>("Country");
    colCountry.setCellValueFactory(new PropertyValueFactory<>("customerCountry"));

    TableColumn<Order, String> colCity = new TableColumn<>("City");
    colCity.setCellValueFactory(new PropertyValueFactory<>("customerCity"));

    TableColumn<Order, String> colLocation = new TableColumn<>("Location");
    colLocation.setCellValueFactory(new PropertyValueFactory<>("customerLocation"));

    TableColumn<Order, String> colProductName = new TableColumn<>("Product Name");
    colProductName.setCellValueFactory(new PropertyValueFactory<>("productName"));

    TableColumn<Order, String> colProductProfile = new TableColumn<>("Product Profile");
    colProductProfile.setCellValueFactory(new PropertyValueFactory<>("productProfile"));

    TableColumn<Order, String> colProductColor = new TableColumn<>("Product Color");
    colProductColor.setCellValueFactory(new PropertyValueFactory<>("productColor"));

    TableColumn<Order, String> colProductTexture = new TableColumn<>("Product Texture");
    colProductTexture.setCellValueFactory(new PropertyValueFactory<>("productTexture"));

    TableColumn<Order, Integer> colProductGauge = new TableColumn<>("Product Gauge");
    colProductGauge.setCellValueFactory(new PropertyValueFactory<>("productGauge"));

    TableColumn<Order, Integer> colProductQuantity = new TableColumn<>("Product Quantity");
    colProductQuantity.setCellValueFactory(new PropertyValueFactory<>("productQuantity"));

    TableColumn<Order, Double> colProductPerMeter = new TableColumn<>("Product Per Meter");
    colProductPerMeter.setCellValueFactory(new PropertyValueFactory<>("productPerMeter"));

    orderTable.getColumns().addAll(
      colFirstName, colLastName, colEmail, colPhoneNumber, colCountry, colCity, colLocation,
      colProductName, colProductProfile, colProductColor, colProductTexture, colProductGauge,
      colProductQuantity, colProductPerMeter
    );

    // Add the table to the center of the border pane
    this.setCenter(orderTable);
  }

  @SuppressWarnings("unchecked")
  public void completedOrderPane(){
    // Use table view to display pending orders
    TableView<Order> orderTable = new TableView<>();
    ObservableList<Order> orderList = FXCollections.observableArrayList(
      new Order(
        "Kelvin", "Doe", "knjoroge@gmail.com",
        "0712345678", "Nairobi", "Kenya", "Kasarani", "Roof Sheets", "Box Profile", "Black", "Glosy", 30, 10, 100.0),
      new Order("Tracy", "Doe", "janedoe@outlook.com",
        "0712345678", "Nairobi", "Kenya", "Kasarani", "Roll Tops", "Corrugated", "Blue", "Matt", 32, 20, 150.0)
    );

    orderTable.setItems(orderList);
    orderTable.setEditable(false);
    orderTable.setPlaceholder(new Label("No data to show yet"));

    // Make rows to listen for double click
    orderTable.setRowFactory(tv -> {
      TableRow<Order> row = new TableRow<>();
      row.setOnMouseClicked(event -> {
        if (event.getClickCount() == 2 && (!row.isEmpty())) {
          Order rowData = row.getItem();
          System.out.println(rowData.toString());
        }
      });
      return row;
    });

    // Add columns to the table
    TableView.TableViewSelectionModel<Order> selectionModel = orderTable.getSelectionModel();
    selectionModel.setSelectionMode(SelectionMode.MULTIPLE);

    TableColumn<Order, String> colFirstName = new TableColumn<>("First Name");
    colFirstName.setCellValueFactory(new PropertyValueFactory<>("customerFirstName"));

    TableColumn<Order, String> colLastName = new TableColumn<>("Last Name");
    colLastName.setCellValueFactory(new PropertyValueFactory<>("customerLastName"));

    TableColumn<Order, String> colEmail = new TableColumn<>("Email");
    colEmail.setCellValueFactory(new PropertyValueFactory<>("customerEmail"));

    TableColumn<Order, String> colPhoneNumber = new TableColumn<>("Phone Number");
    colPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("customerPhoneNumber"));

    TableColumn<Order, String> colCountry = new TableColumn<>("Country");
    colCountry.setCellValueFactory(new PropertyValueFactory<>("customerCountry"));

    TableColumn<Order, String> colCity = new TableColumn<>("City");
    colCity.setCellValueFactory(new PropertyValueFactory<>("customerCity"));

    TableColumn<Order, String> colLocation = new TableColumn<>("Location");
    colLocation.setCellValueFactory(new PropertyValueFactory<>("customerLocation"));

    TableColumn<Order, String> colProductName = new TableColumn<>("Product Name");
    colProductName.setCellValueFactory(new PropertyValueFactory<>("productName"));

    TableColumn<Order, String> colProductProfile = new TableColumn<>("Product Profile");
    colProductProfile.setCellValueFactory(new PropertyValueFactory<>("productProfile"));

    TableColumn<Order, String> colProductColor = new TableColumn<>("Product Color");
    colProductColor.setCellValueFactory(new PropertyValueFactory<>("productColor"));

    TableColumn<Order, String> colProductTexture = new TableColumn<>("Product Texture");
    colProductTexture.setCellValueFactory(new PropertyValueFactory<>("productTexture"));

    TableColumn<Order, Integer> colProductGauge = new TableColumn<>("Product Gauge");
    colProductGauge.setCellValueFactory(new PropertyValueFactory<>("productGauge"));

    TableColumn<Order, Integer> colProductQuantity = new TableColumn<>("Product Quantity");
    colProductQuantity.setCellValueFactory(new PropertyValueFactory<>("productQuantity"));

    TableColumn<Order, Double> colProductPerMeter = new TableColumn<>("Product Per Meter");
    colProductPerMeter.setCellValueFactory(new PropertyValueFactory<>("productPerMeter"));

    orderTable.getColumns().addAll(
      colFirstName, colLastName, colEmail, colPhoneNumber, colCountry, colCity, colLocation,
      colProductName, colProductProfile, colProductColor, colProductTexture, colProductGauge,
      colProductQuantity, colProductPerMeter
    );
    
    this.setCenter(orderTable);
  }
}