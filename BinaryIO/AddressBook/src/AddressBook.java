import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddressBook extends Application{

    private Controlls myObject = new Controlls();

    @Override
    public void start(Stage primaryStage){

        Scene scene = new Scene(myObject, 400, 240);
        primaryStage.setTitle("AddressBook");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}