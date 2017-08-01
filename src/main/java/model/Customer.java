package model;

import javafx.beans.property.SimpleStringProperty;

public class Customer {
	
	private SimpleStringProperty name = new SimpleStringProperty();
	private SimpleStringProperty surname = new SimpleStringProperty();
	private SimpleStringProperty city = new SimpleStringProperty();
	private SimpleStringProperty postCode = new SimpleStringProperty();
	private SimpleStringProperty street = new SimpleStringProperty();
	private SimpleStringProperty localNumber = new SimpleStringProperty();
	
	public Customer() {}
	
	public Customer(String name, String surname, String city,
			String postCode, String street, String localNumber) {
		this.name.set(name);
		this.surname.set(surname);
		this.city.set(city);
		this.postCode.set(postCode);
		this.street.set(street);
		this.localNumber.set(localNumber);
	}



	public SimpleStringProperty getNameProperty() {
		return name;
	}

	public SimpleStringProperty getSurnameProperty() {
		return surname;
	}

	public SimpleStringProperty getCityProperty() {
		return city;
	}

	public SimpleStringProperty getPostCodeProperty() {
		return postCode;
	}

	public SimpleStringProperty getStreetProperty() {
		return street;
	}

	public SimpleStringProperty getLocalNumberProperty() {
		return localNumber;
	}
	public String getName()
	{
		return name.get();
	}
	public String getCity()
	{
		return city.get();
	}
	public String getSurname()
	{
		return surname.get();
	}
	public String getLocalNumber()
	{
		return localNumber.get();
	}
	public String getStreet()
	{
		return street.get();
	}
	public String getPostCode()
	{
		return postCode.get();
	}

	public void setName(String name) {
		this.name.setValue(name);
	}

	public void setSurname(String surname) {
		this.surname.setValue(surname);
	}

	public void setCity(String city) {
		this.city.setValue(city);
	}

	public void setPostCode(String postCode) {
		this.postCode.setValue(postCode);
	}

	public void setStreet(String street) {
		this.street.setValue(street);
	}

	public void setLocalNumber(String localNumber) {
		this.localNumber.setValue(localNumber);
	}
	
	
	
	
	

}
