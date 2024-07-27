import java.util.Stack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class TabPaneDemo extends Application {
  @Override
  public void start(Stage primaryStage) {
    TabPane tabPane = new TabPane();
    Tab tab1 = new Tab("Line");
    StackPane pane1 = new StackPane();
    pane1.getChildren().add(new Line(10, 10, 80, 80));
    tab1.setContent(pane1);
    Tab tab2 = new Tab("Rectangle");
    StackPane pane2 = new StackPane();
    pane2.getChildren().add(new Rectangle(30, 20, 40, 20));
    tab2.setContent(pane2);
    Tab tab3 = new Tab("Circle");
    StackPane pane3 = new StackPane();
    pane3.getChildren().add(new Circle(50, 50, 30));
    tab3.setContent(pane3);
    Tab tab4 = new Tab("Ellipse");
    StackPane pane4 = new StackPane();
    pane4.getChildren().add(new Ellipse(50, 50, 30, 20));
    tab4.setContent(pane4);
    tabPane.getTabs().addAll(tab1, tab2, tab3, tab4);

    Scene scene = new Scene(tabPane, 200, 200);
    primaryStage.setTitle("TabPaneDemo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
