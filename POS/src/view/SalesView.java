package view;

import javafx.scene.layout.BorderPane;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.geometry.Pos;
import controller.SalesController;


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
  private final MenuItem addProduct = new MenuItem("Add Product");
  private final MenuItem viewProducts = new MenuItem("View Products");
  private final MenuItem productReport = new MenuItem("Product Report");

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
    inventory.getItems().addAll(addProduct, viewProducts, productReport);
    payments.getItems().addAll(viewPayments, paymentReport);
    records.getItems().addAll(orderRecords, customerRecords, productRecords, paymentRecords);
    reports.getItems().addAll(salesReport, salesSummary, salesByCustomer, salesByProduct);
    promoAndDisc.getItems().addAll(addPromo, viewPromo, addDiscount, viewDiscount);
    help.getItems().addAll(about, contact);

    setTop(menuBar);
    BorderPane.setAlignment(menuBar, Pos.TOP_CENTER);

    createOrder.setOnAction(e -> new SalesController().createOrder());
  }
}