package view;

import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;

public class AccountsView extends StackPane {
  public AccountsView() {
    super();
    SplitPane accountsContent = new SplitPane();
    accountsContent.setOrientation(Orientation.HORIZONTAL);

    StackPane left = new StackPane();
    left.setStyle("-fx-background-color: cyan;");
    left.getChildren().add(new Label("Accounts"));

    StackPane right = new StackPane();
    right.setStyle("-fx-background-color: lightblue;");
    right.getChildren().add(new Label("Accounts"));

    accountsContent.getItems().addAll(left, right);
    accountsContent.setDividerPositions(0.2);
    this.getChildren().add(accountsContent);
  }
}
