package model;

import interfaces.TableViewFillModelInterfance;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;

public class CustomerTableView extends Customer implements TableViewFillModelInterfance{
	
	
	private ObservableList<CustomerTableView> list = FXCollections.observableArrayList();
	private Button actionButton;



	public CustomerTableView(String name, String surname, String city, String postCode, String street,
			String localNumber, Button actionButton) {
		super(name, surname, city, postCode, street, localNumber);
		this.actionButton=actionButton;
	}



	public CustomerTableView() {
		// TODO Auto-generated constructor stub
	}



	public Button getActionButton() {
		return actionButton;
	}



	public void setActionButton(Button actionButton) {
		this.actionButton = actionButton;
	}

	public ObservableList<CustomerTableView> getObservableList() {
		return list;
	}
	
	@Override
	public String toString()
	{
		return getSurname()+", "+getName()+", "+getCity()+", "+getStreet()+", "+getPostCode();
	}
	
	
	

}
