package view;

import javafx.scene.layout.BorderPane;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.geometry.Pos;
import controller.AdminController;


public  class AdminView extends BorderPane {
  private final MenuBar menuBar = new MenuBar();

  private final Menu users = new Menu("Users");
  private final MenuItem addUser = new MenuItem("Add User");
  private final MenuItem viewUsers = new MenuItem("View Users");
  private final MenuItem userReport = new MenuItem("User Report");

  private final Menu records = new Menu("Records");
  private final MenuItem userRecords = new MenuItem("User Records");

  private final Menu help = new Menu("Help");
  private final MenuItem about = new MenuItem("About");
  private final MenuItem contact = new MenuItem("Contact");

  public AdminView() {
    super();
    menuBar.getMenus().addAll(
      users, records, help
    );

    users.getItems().addAll(
      addUser, viewUsers, userReport
    );

    records.getItems().addAll(
      userRecords
    );

    help.getItems().addAll(
      about, contact
    );

    this.setTop(menuBar);
    BorderPane.setAlignment(menuBar, Pos.TOP_CENTER);

    addUser.setOnAction(e -> {
      AdminController.addUser();
    });
  }
}
