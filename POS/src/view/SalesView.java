package view;

import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.util.Stack;

import javafx.geometry.Orientation;
import javafx.scene.control.Label;


public class SalesView extends StackPane {
  public SalesView() {
    super();
    SplitPane salesContent = new SplitPane();
    salesContent.setOrientation(Orientation.HORIZONTAL);
    salesContent.setDividerPositions(0.5);

    StackPane left = new StackPane();
    left.setStyle("-fx-background-color: cyan;");
    left.getChildren().add(new Label("Sales"));

    StackPane right = new StackPane();
    right.setStyle("-fx-background-color: lightblue;");
    right.getChildren().add(new Label("Sales"));

    salesContent.getItems().addAll(left, right);
    getChildren().add(salesContent);
  }
}