/**
 * Store numbers in a linked list) Write a program that lets the user enter num-
 * bers from a graphical user interface and displays them in a text area, as shown
 * in Figure 20.17a. Use a linked list to store the numbers. Do not store dupli-
 * cate numbers. Add the buttons Sort, Shuffle, and Reverse to sort, shuffle, and
 * reverse the list.
 */

import java.util.LinkedList;
import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class StoreNumsLinkedList extends Application{
    @Override
    public void start(Stage primaryStage){
        Numbers numbers = new Numbers();
        numbers.setStyle("-fx-border-color: green");
        ScrollPane scrollPane = new ScrollPane(numbers);
        //Make scrollPane always visible
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        Button btShuffle = new Button("Shuffle");
        Button btSort = new Button("Sort");
        Button btReverse = new Button("Reverse");
        HBox hBox = new HBox(5);
        hBox.setAlignment(javafx.geometry.Pos.CENTER);
        hBox.getChildren().addAll(btShuffle, btSort, btReverse);

        Label lblNum = new Label("Enter a number: ");
        TextField tfNum = new TextField();
        tfNum.setPrefColumnCount(3);
        tfNum.setAlignment(javafx.geometry.Pos.CENTER);
        tfNum.setStyle("-fx-border-color: black;");
        HBox hBox2 = new HBox(5);
        hBox2.setAlignment(javafx.geometry.Pos.CENTER);
        hBox2.getChildren().addAll(lblNum, tfNum);

        tfNum.setOnAction(e -> numbers.setNum(Integer.parseInt(tfNum.getText())));
        btShuffle.setOnAction(e -> numbers.shuffle());
        btSort.setOnAction(e -> numbers.sort());
        btReverse.setOnAction(e -> numbers.reverse());

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(scrollPane);
        borderPane.setBottom(hBox);
        borderPane.setTop(hBox2);

        Scene scene = new Scene(borderPane, 250, 150);
        primaryStage.setTitle("Store Numbers in LinkedList");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public class Numbers extends Pane{
        private int num;
        private List<Integer> list = new LinkedList<>();
        private TextArea textArea = new TextArea();

        public Numbers(){
            textArea.setPrefColumnCount(20);
            textArea.setPrefRowCount(10);
            textArea.setEditable(false);
            getChildren().add(textArea);
        }

        public void setNum(int num){
            this.num = num;
            Integer myNum = list.indexOf(num);
            if (myNum == -1){
                list.add(num);
            }
            displayNum();
        }

        public void shuffle(){
            Collections.shuffle(list);
            displayNum();
        }

        public void sort(){
            Collections.sort(list);
            displayNum();
        }   

        public void reverse(){
            Collections.reverse(list);
            displayNum();
        }

        public void displayNum(){
            String str = "";
            //Append the elements in the list to the text area
            for (int i = 0; i < list.size(); i++){
                str += list.get(i) + " ";
            }
            textArea.setText(str);
        }
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}