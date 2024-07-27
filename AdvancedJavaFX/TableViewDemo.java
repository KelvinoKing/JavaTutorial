import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TableViewDemo extends Application {
  @SuppressWarnings("unchecked")
  @Override
  public void start(Stage primaryStage) {
    TableView<Country> tableView = new TableView<>();
    ObservableList<Country> data = FXCollections.observableArrayList(
      new Country("USA", "Washington DC", 327.2, true),
      new Country("Canada", "Ottawa", 36.7, true),
      new Country("United Kingdom", "London", 66.0, true),
      new Country("Germany", "Berlin", 82.8, true),
      new Country("France", "Paris", 66.9, true)
    );
    tableView.setItems(data);

    TableColumn<Country, String> countryColumn = new TableColumn<>("Country");
    countryColumn.setMinWidth(100);
    countryColumn.setCellValueFactory(new PropertyValueFactory<>("country"));

    TableColumn<Country, String> capitalColumn = new TableColumn<>("Capital");
    capitalColumn.setMinWidth(100);
    capitalColumn.setCellValueFactory(new PropertyValueFactory<>("capital"));

    TableColumn<Country, Double> populationColumn = new TableColumn<>("Population (millions)");
    populationColumn.setMinWidth(200);
    populationColumn.setCellValueFactory(new PropertyValueFactory<>("population"));

    TableColumn<Country, Boolean> democraticColumn = new TableColumn<>("Democratic");
    democraticColumn.setMinWidth(200);
    democraticColumn.setCellValueFactory(new PropertyValueFactory<>("democratic"));

    tableView.getColumns().addAll(countryColumn, capitalColumn, populationColumn, democraticColumn);

    Pane pane = new Pane();
    pane.getChildren().add(tableView);
    Scene scene = new Scene(pane, 605, 200);
    primaryStage.setTitle("TableViewDemo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static class Country {
    private final SimpleStringProperty country;
    private final SimpleStringProperty capital;
    private final SimpleDoubleProperty population;
    private final SimpleBooleanProperty democractic;

    public Country(String country, String capital, double population, boolean democratic) {
      this.country = new SimpleStringProperty(country);
      this.capital = new SimpleStringProperty(capital);
      this.population = new SimpleDoubleProperty(population);
      this.democractic = new SimpleBooleanProperty(democratic);
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

    public double getPopulation() {
      return population.get();
    }

    public void setPopulation(double population) {
      this.population.set(population);
    }

    public boolean isDemocratic() {
      return democractic.get();
    }

    public void setDemocratic(boolean democratic) {
      this.democractic.set(democratic);
    }
  }
  public static void main(String[] args) {
    launch(args);
  }
}
