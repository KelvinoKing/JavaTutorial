import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.SplitPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.geometry.Orientation;

public class SplitPaneDemo extends Application {

  private Image usImg = new Image("images/us.gif");
  private Image ukImg = new Image("images/uk.gif");
  private Image caImg = new Image("images/ca.gif");
  private String usDescription = "Description for US ...";
  private String ukDescription = "Description for UK ...";
  private String caDescription = "Description for CA ...";

  @Override
  public void start(Stage primaryStage) {
    VBox vBox = new VBox(10);
    RadioButton rbUS = new RadioButton("US");
    RadioButton rbUK = new RadioButton("UK");
    RadioButton rbCA = new RadioButton("CA");
    vBox.getChildren().addAll(rbUS, rbUK, rbCA);

    SplitPane content = new SplitPane();
    content.setOrientation(Orientation.VERTICAL);
    ImageView imageView = new ImageView(usImg);
    StackPane imagePane = new StackPane();
    imagePane.getChildren().add(imageView);
    TextArea taDescription = new TextArea(usDescription);
    content.getItems().addAll(imagePane, new ScrollPane(taDescription));

    SplitPane sp = new SplitPane();
    sp.getItems().addAll(vBox, content);

    Scene scene = new Scene(sp, 350, 250);
    primaryStage.setTitle("SplitPaneDemo");
    primaryStage.setScene(scene);
    primaryStage.show();

    ToggleGroup group = new ToggleGroup();
    rbUS.setToggleGroup(group);
    rbUK.setToggleGroup(group);
    rbCA.setToggleGroup(group);

    rbUS.setSelected(true);
    rbUS.setOnAction(e -> {
      imageView.setImage(usImg);
      taDescription.setText(usDescription);
    });

    rbUK.setOnAction(e -> {
      imageView.setImage(ukImg);
      taDescription.setText(ukDescription);
    });

    rbCA.setOnAction(e -> {
      imageView.setImage(caImg);
      taDescription.setText(caDescription);
    });

  }

  public static void main(String[] args) {
    launch(args);
  }
}
