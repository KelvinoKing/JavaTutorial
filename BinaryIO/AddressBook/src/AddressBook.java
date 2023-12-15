/**
 * (Address book) Write a program that stores, retrieves, adds, and updates addresses as
 * shown in Figure 17.20. Use a fixed-length string for storing each attribute in the address.
 * Use random-access file for reading and writing an address. Assume the sizes of the
 * name, street, city, state, and zip are 32, 32, 20, 2, and 5 bytes, respectively.
 */
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