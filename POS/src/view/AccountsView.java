package view;

import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;

public class AccountsView extends StackPane {
  public AccountsView() {
    super();
    SplitPane salesContent = new SplitPane();
    salesContent.setOrientation(Orientation.HORIZONTAL);
    salesContent.setDividerPositions(0.5);

    StackPane left = new StackPane();
    left.setStyle("-fx-background-color: cyan;");
    left.getChildren().add(new Label("Accounts"));

    StackPane right = new StackPane();
    right.setStyle("-fx-background-color: lightblue;");
    right.getChildren().add(new Label("Accounts"));

    salesContent.getItems().addAll(left, right);
    getChildren().add(salesContent);
  }
}
