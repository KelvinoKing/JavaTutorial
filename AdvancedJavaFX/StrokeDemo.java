import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StrokeDemo extends Application {
  @Override
  public void start(Stage primaryStage) {
    Pane pane = new Pane();

    Rectangle rectangle1 = new Rectangle(20, 20, 70, 120);
    rectangle1.setFill(Color.WHITE);
    rectangle1.setStroke(Color.ORANGE);
    rectangle1.setStrokeWidth(15);

    Rectangle rectangle2 = new Rectangle(20, 20, 70, 120);
    rectangle2.setFill(Color.WHITE);
    rectangle2.setStroke(Color.ORANGE);
    rectangle2.setStrokeWidth(15);
    rectangle2.setStrokeLineJoin(StrokeLineJoin.BEVEL);
    rectangle2.setTranslateX(100);

    Rectangle rectangle3 = new Rectangle(20, 20, 70, 120);
    rectangle3.setFill(Color.WHITE);
    rectangle3.setStroke(Color.ORANGE);
    rectangle3.setStrokeWidth(15);
    rectangle3.setStrokeLineJoin(StrokeLineJoin.ROUND);
    rectangle3.setTranslateX(200);

    Line line1 = new Line(320, 20, 420, 20);
    line1.setStrokeLineCap(StrokeLineCap.BUTT);
    line1.setStrokeWidth(20);

    Line line2 = new Line(320, 70, 420, 70);
    line2.setStrokeLineCap(StrokeLineCap.ROUND);
    line2.setStrokeWidth(20);

    Line line3 = new Line(320, 120, 420, 120);
    line3.setStrokeLineCap(StrokeLineCap.SQUARE);
    line3.setStrokeWidth(20);

    Line line4 = new Line(460, 20, 560, 120);
    line4.getStrokeDashArray().addAll(10.0, 20.0, 30.0, 40.0);

    pane.getChildren().addAll(rectangle1, rectangle2, rectangle3, line1, line2, line3, line4);

    Scene scene = new Scene(pane, 600, 180);
    primaryStage.setTitle("StrokeDemo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
