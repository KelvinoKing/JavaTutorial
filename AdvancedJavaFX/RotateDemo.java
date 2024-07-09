import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RotateDemo extends Application {
  @Override
  public void start(Stage primaryStage) {
    Pane pane = new Pane();

    java.util.Random random = new java.util.Random();
    
    //The radius of the circle for anchoring the rectangle
    double radius = 90;
    double height = 40;
    double width = 20;

    for (int i = 0; i < 8; i++){
      //Center of rectangle
      double x = 150 + radius * Math.cos(i * 2 * Math.PI / 8);
      double y = 150 + radius * Math.sin(i * 2 * Math.PI / 8);
      Rectangle rectangle = new Rectangle(x - width / 2, y - height / 2, width, height);
      rectangle.setFill(Color.WHITE);
      rectangle.setStroke(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
      rectangle.setRotate(i * 360 / 8);
      pane.getChildren().add(rectangle);
    }

    Scene scene = new Scene(pane, 300, 300);
    primaryStage.setTitle("RotateDemo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
