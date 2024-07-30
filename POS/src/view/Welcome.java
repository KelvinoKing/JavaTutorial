package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;


public class Welcome extends VBox {
  private Button button;
  private Text text;
  private ImageView imageView;
  private Image image;

    public Welcome() {
        super();
        //Display welcome message
        image = new Image("file:images/royal.png");
        imageView = new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        text = new Text("Welcome to the Sales Order Management System");
        text.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-fill: #333333;");

        button = new Button("Get Started");
        button.setStyle(
          "-fx-background-color: #333333; -fx-text-fill: #ffffff; -fx-font-size: 16px; -fx-font-weight: bold;");

        getChildren().addAll(imageView, text, button);
        setAlignment(Pos.CENTER);
    }

    public Button getButton() {
        return button;
    }
}
