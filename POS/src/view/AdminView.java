package view;

import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;


public  class AdminView extends StackPane {
  public AdminView() {
    super();
    SplitPane adminContent = new SplitPane();
    adminContent.setOrientation(Orientation.HORIZONTAL);

    StackPane left = new StackPane();
    left.setStyle("-fx-background-color: cyan;");
    left.getChildren().add(new Label("Admin"));

    StackPane right = new StackPane();
    right.setStyle("-fx-background-color: lightblue;");
    right.getChildren().add(new Label("Admin"));

    adminContent.getItems().addAll(left, right);
    adminContent.setDividerPositions(0.2);
    this.getChildren().add(adminContent);
  }
}
