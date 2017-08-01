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



	public SimpleStringProperty getName() {
		return name;
	}

	public SimpleStringProperty getSurname() {
		return surname;
	}

	public SimpleStringProperty getCity() {
		return city;
	}

	public SimpleStringProperty getPostCode() {
		return postCode;
	}

	public SimpleStringProperty getStreet() {
		return street;
	}

	public SimpleStringProperty getLocalNumber() {
		return localNumber;
	}
	
	

}
