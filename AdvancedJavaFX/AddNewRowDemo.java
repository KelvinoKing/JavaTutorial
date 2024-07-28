import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.CheckBox;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class AddNewRowDemo extends Application {
  @SuppressWarnings("unchecked")
  @Override
  public void start(Stage primaryStage) {
    ObservableList<Country> data = FXCollections.observableArrayList(
      new Country("USA", "Washington DC", 280.0, true),
      new Country("Canada", "Ottawa", 32.0, true),
      new Country("United Kingdom", "London", 60.0, true),
      new Country("Germany", "Berlin", 83.6, true),
      new Country("France", "Paris", 60.76, true)
    );

    TableView<Country> tableView = new TableView<>();
    tableView.setItems(data);
    tableView.setEditable(true);

    TableColumn<Country, String> countryColumn = new TableColumn<>("Country");
    countryColumn.setMinWidth(100);
    countryColumn.setCellValueFactory(new PropertyValueFactory<>("country"));

    TableColumn<Country, String> capitalColumn = new TableColumn<>("Capital");
    capitalColumn.setMinWidth(100);
    capitalColumn.setCellValueFactory(new PropertyValueFactory<>("capital"));

    TableColumn<Country, Double> populationColumn = new TableColumn<>("Population (Millions)");
    populationColumn.setMinWidth(100);
    populationColumn.setCellValueFactory(new PropertyValueFactory<>("population"));

    TableColumn<Country, Boolean> democraticColumn = new TableColumn<>("Democratic");
    democraticColumn.setMinWidth(100);
    democraticColumn.setCellValueFactory(new PropertyValueFactory<>("democratic"));

    TableColumn<Country, Double> location = new TableColumn<>("Location");
    location.setMinWidth(100);
    location.getColumns().addAll(new TableColumn<>("latitude"), new TableColumn<>("longitude"));

    // Make all columns editable
    // Make the countryColumn editable
    countryColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    countryColumn.setOnEditCommit(
      new EventHandler<CellEditEvent<Country,String>>() {
        @Override
        public void handle(CellEditEvent<Country, String> t) {
          t.getTableView().getItems().get(
            t.getTablePosition().getRow())
            .setCountry(t.getNewValue());
        }
      }
    );

    // Make the capitalColumn editable
    capitalColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    capitalColumn.setOnEditCommit(
      new EventHandler<TableColumn.CellEditEvent<Country,String>>() {
        @Override
        public void handle(CellEditEvent<Country, String> t) {
          t.getTableView().getItems().get(
            t.getTablePosition().getRow())
            .setCountry(t.getNewValue());
        }
      }
    );

    tableView.getColumns().addAll(
      countryColumn, capitalColumn, populationColumn, democraticColumn, location
      );

    FlowPane flowPane = new FlowPane(3, 3);
    TextField countryTextField = new TextField();
    TextField capitalTextField = new TextField();
    TextField populationTextField = new TextField();
    CheckBox democraticCheckBox = new CheckBox();
    Button addButton = new Button("Add");
    flowPane.getChildren().addAll(
      new Label("Country"), countryTextField,
      new Label("Capital"), capitalTextField,
      new Label("Population"), populationTextField,
      new Label("Is Democratic?"), democraticCheckBox, addButton
      );
    
    addButton.setOnAction(e -> {
      data.add(new Country(
        countryTextField.getText(),
        capitalTextField.getText(),
        Double.parseDouble(populationTextField.getText()),
        democraticCheckBox.isSelected()
      ));
      countryTextField.clear();
      capitalTextField.clear();
      populationTextField.clear();
      democraticCheckBox.setSelected(false);
    });

    BorderPane root = new BorderPane();
    root.setCenter(tableView);
    root.setBottom(flowPane);

    Scene scene = new Scene(root, 870, 300);
    primaryStage.setTitle("Add New Row Demo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static class Country {
    private final SimpleBooleanProperty democratic;
    private final SimpleStringProperty country;
    private final SimpleStringProperty capital;
    private final SimpleDoubleProperty population;

    private Country(String country, String capital, Double population, boolean democratic) {
      this.democratic = new SimpleBooleanProperty(democratic);
      this.country = new SimpleStringProperty(country);
      this.capital = new SimpleStringProperty(capital);
      this.population = new SimpleDoubleProperty(population);
    }

    public String getCountry() {
      return country.get();
    }
    public void setCountry(String country) {
      this.country.set(country);
    }

    public String getCapital() {
      return capital.get();
    }
    public void setCapital(String capital) {
      this.capital.set(capital);
    }

    public Double getPopulation() {
      return population.get();
    }
    public void setPopulation(Double population) {
      this.population.set(population);
    }

    public boolean isDemocratic() {
      return democratic.get();
    }
    public void setDemocratic(boolean democratic) {
      this.democratic.set(democratic);
    }
  }
  public static void main(String[] args) {
    launch(args);
  }
}
