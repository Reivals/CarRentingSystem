package model;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;

public class CarTableView  extends Car implements TableViewFillModelInterfance{
	private ObservableList<CarTableView> list =FXCollections.observableArrayList();
	private  Button actionButton;
	
	public CarTableView(String brand, String engine, String yearOfProduction, boolean navi, boolean available, int power, Button actionButton) {
		super(brand, engine, yearOfProduction, navi, available, power);
		this.actionButton=actionButton;
		
	}
	public CarTableView() {}

	public Button getActionButton() {
		return actionButton;
	}
	public ObservableList<CarTableView> getObservableList()
	{
		return list;
	}
	
}
