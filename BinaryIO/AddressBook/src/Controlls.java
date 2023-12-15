import java.io.*;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Controlls extends VBox{
    
    private Label nameLbl = new Label("Name");
    private TextField nameTxt = new TextField();
    private Label streetLbl = new Label("Street");
    private TextField streetTxt = new TextField();
    private Label cityLbl = new Label("City");
    private TextField cityTxt = new TextField();
    private Label stateLbl = new Label("State");
    private TextField stateTxt = new TextField();
    private Label zipLbl = new Label("Zip");
    private TextField zipTxt = new TextField();

    private Button addbtn = new Button("Add");
    private Button firstbtn = new Button("First");
    private Button nextbtn = new Button("Next");
    private Button prevbtn = new Button("Previous");
    private Button lastbtn = new Button("Last");
    private Button updatebtn = new Button("Update");

    private GridPane infoPane = new GridPane();
    private GridPane btnPane = new GridPane();

    private ManipulateData dataFile = new ManipulateData();

    public Controlls(){
        infoPane.add(nameLbl, 0, 0);
        infoPane.add(nameTxt, 1, 0);
        infoPane.add(streetLbl, 0, 1);
        infoPane.add(streetTxt, 1, 1);
        infoPane.add(cityLbl, 0, 2);
        infoPane.add(cityTxt, 1, 2);
        infoPane.add(stateLbl, 0, 3);
        infoPane.add(stateTxt, 1, 3);
        infoPane.add(zipLbl, 0, 4);
        infoPane.add(zipTxt, 1, 4);
        infoPane.setHgap(10);
        infoPane.setVgap(5);
        //infoPane.setGridLinesVisible(true);
        
        btnPane.add(addbtn, 0, 0);
        btnPane.add(firstbtn, 1, 0);
        btnPane.add(nextbtn, 2, 0);
        btnPane.add(prevbtn, 3, 0);
        btnPane.add(lastbtn, 4, 0);
        btnPane.add(updatebtn, 5, 0);
        btnPane.setHgap(5);
        btnPane.setVgap(5);
        //btnPane.setGridLinesVisible(true);

        setMargin(infoPane, new Insets(10,10,10,10));
        setMargin(btnPane, new Insets(10,10,10,10));
        setSpacing(5);
        getChildren().addAll(infoPane, btnPane);


        //Handle events
            addbtn.setOnAction(e -> {
                try {
                    dataFile.addData(nameTxt.getText(), streetTxt.getText(), cityTxt.getText(),
                    stateTxt.getText(), zipTxt.getText());
                } catch (IOException e1) {
                    System.out.println(e1.getMessage());
                }});

            firstbtn.setOnAction(e -> {
                try {
                    dataFile.firstRecord();
                    textFieldSet();
                } catch (IOException e1) {
                    System.out.println(e1.getMessage());
                }
            });

            nextbtn.setOnAction(e -> {
                try{
                    dataFile.nextRecord();
                    textFieldSet();
                } catch (IOException e1){
                    System.out.println(e1.getMessage());
                }
            });

            prevbtn.setOnAction(e -> {
                try{
                    dataFile.prevRecord();
                    textFieldSet();
                } catch (IOException e1){
                    System.out.println(e1.getMessage());
                }
            });

            lastbtn.setOnAction(e -> {
                try{
                    dataFile.lastRecord();
                    textFieldSet();
                }catch(IOException e1){
                    System.out.println(e1.getMessage());
                }
            });

            updatebtn.setOnAction(e -> {
                try{
                    dataFile.updateRecord(nameTxt.getText(), streetTxt.getText(), cityTxt.getText(),
                    stateTxt.getText(), zipTxt.getText());
                }catch(IOException e1){
                    System.out.println(e1.getMessage());
                }
            });
    }
    private void textFieldSet(){
        nameTxt.setText(dataFile.getName());
        streetTxt.setText(dataFile.getStreet());
        cityTxt.setText(dataFile.getCity());
        stateTxt.setText(dataFile.getState());
        zipTxt.setText(dataFile.getZip());
    }
}

