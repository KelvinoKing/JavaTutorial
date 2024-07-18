import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class ContextMenuDemo extends Application {
  @Override
  public void start(Stage primaryStage) {
    ContextMenu contextMenu = new ContextMenu();
    MenuItem menuItemNew = new MenuItem("New", new ImageView("images/new.gif"));
    MenuItem menuItemOpen = new MenuItem("Open", new ImageView("images/open.gif"));
    MenuItem menuItemPrint = new MenuItem("Print", new ImageView("images/print.gif"));
    MenuItem menuItemExit = new MenuItem("Exit");
    contextMenu.getItems().addAll(menuItemNew, menuItemOpen, menuItemPrint, menuItemExit);

    Alert alert = new Alert(AlertType.CONFIRMATION);
   // alert.setWidth(5);
   // alert.setHeight(5);

    Pane pane = new Pane();
    Scene scene = new Scene(pane, 300, 250);
    primaryStage.setTitle("ContextMenuDemo");
    primaryStage.setScene(scene);
    primaryStage.show();

    //Handle event
    pane.setOnMousePressed(
      e -> contextMenu.show(pane, e.getScreenX(), e.getScreenY())
    );

    menuItemNew.setOnAction(
      e -> { 
        alert.setContentText("Do you want to create a file?");
        alert.showAndWait();
      });
    menuItemOpen.setOnAction(
      e -> {
        alert.setContentText("Do you want to open a file?");
        alert.showAndWait();
      }
      );
    menuItemPrint.setOnAction(
      e -> {
        alert.setContentText("Do you want to print file?");
        alert.showAndWait();
      });
    menuItemExit.setOnAction(e -> Platform.exit());

  }

  public static void main(String[] args) {
    launch(args);
  }
}
