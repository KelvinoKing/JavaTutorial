package view;

import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;


public class HumanResourceView extends StackPane {
  public HumanResourceView() {
    super();
    SplitPane humanResourceContent = new SplitPane();
    humanResourceContent.setOrientation(Orientation.HORIZONTAL);
    humanResourceContent.setDividerPositions(0.2);

    StackPane left = new StackPane();
    left.setStyle("-fx-background-color: cyan;");
    left.getChildren().add(new Label("Human Resource"));

    StackPane right = new StackPane();
    right.setStyle("-fx-background-color: lightblue;");
    right.getChildren().add(new Label("Human Resource"));

    humanResourceContent.getItems().addAll(left, right);
    getChildren().add(humanResourceContent);
  }
}
