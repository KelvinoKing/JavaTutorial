import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PathDemo extends Application {
  @Override
  public void start(Stage primaryStage){
    Pane pane = new Pane();

    // Create a path
    Path path = new Path();
    path.getElements().add(new MoveTo(50.0, 50.0));
    path.getElements().add(new HLineTo(150.5));
    path.getElements().add(new VLineTo(100.5));
    path.getElements().add(new LineTo(200.5, 150.5));

    ArcTo arcTo = new ArcTo(45, 45, 250, 250.5, 100, false, false);
    path.getElements().add(arcTo);

    path.getElements().add(new QuadCurveTo(50, 50, 350, 100));
    path.getElements().add(new CubicCurveTo(250, 100, 350, 250, 450, 10));

    path.getElements().add(new ClosePath());

    pane.getChildren().add(path);
    path.setFill(null);
    Scene scene = new Scene(pane, 500, 250);
    primaryStage.setTitle("PathDemo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
