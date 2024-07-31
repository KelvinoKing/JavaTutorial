package view;

import javafx.scene.layout.BorderPane;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.geometry.Pos;
import controller.AccountsController;

public class AccountsView extends BorderPane {
  private final MenuBar menuBar = new MenuBar();

  private final Menu transactions = new Menu("Transactions");
  private final MenuItem addTransaction = new MenuItem("Add Transaction");
  private final MenuItem viewTransactions = new MenuItem("View Transactions");

  private final Menu records = new Menu("Records");
  private final MenuItem transactionRecords = new MenuItem("Transaction Records");

  private final Menu reports = new Menu("Reports");
  private final MenuItem transactionReport = new MenuItem("Transaction Report");

  private final Menu help = new Menu("Help");
  private final MenuItem about = new MenuItem("About");
  private final MenuItem contact = new MenuItem("Contact");

  public AccountsView() {
    super();
    menuBar.getMenus().addAll(
      transactions, records, reports, help
    );

    transactions.getItems().addAll(
      addTransaction, viewTransactions
    );

    records.getItems().addAll(
      transactionRecords
    );

    reports.getItems().addAll(
      transactionReport
    );

    help.getItems().addAll(
      about, contact
    );

    this.setTop(menuBar);
    BorderPane.setAlignment(menuBar, Pos.TOP_CENTER);

    addTransaction.setOnAction(e -> {
      AccountsController.addTransaction();
    });
  }
}
