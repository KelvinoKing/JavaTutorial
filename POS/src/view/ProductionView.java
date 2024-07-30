package view;

import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;


public class ProductionView extends StackPane{
  public ProductionView() {
    super();
    SplitPane salesContent = new SplitPane();
    salesContent.setOrientation(Orientation.HORIZONTAL);
    salesContent.setDividerPositions(0.2);

    StackPane left = new StackPane();
    left.setStyle("-fx-background-color: cyan;");
    left.getChildren().add(new Label("Production"));

    StackPane right = new StackPane();
    right.setStyle("-fx-background-color: lightblue;");
    right.getChildren().add(new Label("Production"));

    salesContent.getItems().addAll(left, right);
    getChildren().add(salesContent);
  }
}
