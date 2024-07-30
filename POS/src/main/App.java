package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import view.Welcome;
import view.MainDashboardLeftView;
import view.SalesView;
import controller.WelcomeController;

public class App extends Application {
    private static BorderPane pane = new BorderPane();
    private Welcome welcome = new Welcome();

    @Override
    public void start(Stage stage) {

        // Welcome page
        new WelcomeController(welcome);
        pane.setCenter(welcome);

        // Set the scene to occupy the entire screen
        Scene scene = new Scene(
            pane, Screen.getPrimary().getVisualBounds().getWidth(),
            Screen.getPrimary().getVisualBounds().getHeight());
        scene.getStylesheets().add("file:src/styles/styles.css");
        stage.setScene(scene);
        stage.setTitle("Sales Order Management System");
        stage.show();
    }

    // Clear the app window
    public static void clear() {
        pane.setCenter(null);
    }

    // Add a node to the left app window
    public static void addLeft() {
        Pane left = new Pane();
        // Use javafx to set background color to cyan
        left.setStyle("-fx-background-color: cyan;");
        left.getChildren().add(new MainDashboardLeftView());
        pane.setLeft(left);
    }

    // Add a node at the center of the app window
    public static void addCenterSales() {
        pane.setCenter(null);
        pane.setCenter(new SalesView());
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
