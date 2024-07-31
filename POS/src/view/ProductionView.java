package view;

import javafx.scene.layout.BorderPane;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.geometry.Pos;
import controller.ProductionController;


public class ProductionView extends BorderPane{
  private final MenuBar menuBar = new MenuBar();

  private final Menu production = new Menu("Production");
  private final MenuItem addProduction = new MenuItem("Add Production");
  private final MenuItem pendingProduction = new MenuItem("Pending Production");
  private final MenuItem completedProduction = new MenuItem("Completed Production");
  private final MenuItem viewProduction = new MenuItem("View Production");

  private final Menu records = new Menu("Records");
  private final MenuItem productionRecords = new MenuItem("Production Records");

  private final Menu reports = new Menu("Reports");
  private final MenuItem productionReport = new MenuItem("Production Report");

  private final Menu help = new Menu("Help");
  private final MenuItem about = new MenuItem("About");
  private final MenuItem contact = new MenuItem("Contact");

  public ProductionView() {
    super();
    menuBar.getMenus().addAll(
      production, records, reports, help
    );

    production.getItems().addAll(
      addProduction, pendingProduction, completedProduction, viewProduction
    );

    records.getItems().addAll(
      productionRecords
    );

    reports.getItems().addAll(
      productionReport
    );

    help.getItems().addAll(
      about, contact
    );

    this.setTop(menuBar);
    BorderPane.setAlignment(menuBar, Pos.TOP_CENTER);

    addProduction.setOnAction(e -> {
      ProductionController.addProduction();
    });
  }
}
