package view;

import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;


public class WarehouseView extends StackPane {
  public WarehouseView() {
    super();
    SplitPane warehouseContent = new SplitPane();
    warehouseContent.setOrientation(Orientation.HORIZONTAL);

    StackPane left = new StackPane();
    left.setStyle("-fx-background-color: cyan;");
    left.getChildren().add(new Label("Warehouse"));

    StackPane right = new StackPane();
    right.setStyle("-fx-background-color: lightblue;");
    right.getChildren().add(new Label("Warehouse"));

    warehouseContent.getItems().addAll(left, right);
    warehouseContent.setDividerPositions(0.2);
    this.getChildren().add(warehouseContent);
  }
  
}
