package view;

import javafx.scene.layout.BorderPane;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.geometry.Pos;
import controller.HumanResourceController;


public class HumanResourceView extends BorderPane {
  private final MenuBar menuBar = new MenuBar();

  private final Menu employees = new Menu("Employees");
  private final MenuItem addEmployee = new MenuItem("Add Employee");
  private final MenuItem viewEmployees = new MenuItem("View Employees");
  private final MenuItem employeeReport = new MenuItem("Employee Report");

  private final Menu records = new Menu("Records");
  private final MenuItem employeeRecords = new MenuItem("Employee Records");

  private final Menu help = new Menu("Help");
  private final MenuItem about = new MenuItem("About");
  private final MenuItem contact = new MenuItem("Contact");

  public HumanResourceView() {
    super();
    menuBar.getMenus().addAll(
      employees, records, help
    );

    employees.getItems().addAll(
      addEmployee, viewEmployees, employeeReport
    );

    records.getItems().addAll(
      employeeRecords
    );

    help.getItems().addAll(
      about, contact
    );

    this.setTop(menuBar);
    BorderPane.setAlignment(menuBar, Pos.TOP_CENTER);

    addEmployee.setOnAction(e -> {
      HumanResourceController.addEmployee();
    });
  }
}
