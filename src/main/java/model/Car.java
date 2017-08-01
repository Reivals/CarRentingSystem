package model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Car {
	
	protected SimpleStringProperty brand = new SimpleStringProperty();
	protected SimpleStringProperty engine = new SimpleStringProperty();
	protected SimpleStringProperty yearOfProduction = new SimpleStringProperty();
	protected SimpleBooleanProperty navi = new SimpleBooleanProperty();
	protected SimpleBooleanProperty available = new SimpleBooleanProperty();
	protected SimpleIntegerProperty power = new SimpleIntegerProperty();
	
	

	public Car(String brand, String engine, String yearOfProduction,
			boolean navi, boolean available, int power) {
		this.brand.set(brand);
		this.engine.set(engine);
		this.yearOfProduction.set(yearOfProduction);;
		this.navi.set(navi);
		this.available.set(available);
		this.power.set(power);
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public SimpleStringProperty getEngineProperty() {
		return engine;
	}
	public SimpleStringProperty getYearOfProductionProperty() {
		return yearOfProduction;
	}
	public SimpleBooleanProperty getNaviProperty() {
		return navi;
	}
	public SimpleBooleanProperty getAvailableProperty() {
		return available;
	}
	public SimpleIntegerProperty getPowerProperty() {
		return power;
	}
	public SimpleStringProperty getBrandProperty() {
		return brand;
	}
	
	public String getEngine() {
		return engine.get();
	}
	
	public String getBrand() {
		return brand.get();
	}
	public String getYearOfProduction() {
		return yearOfProduction.get();
	}
	public boolean getNavi() {
		return navi.get();
	}
	public boolean getAvailable() {
		return available.get();
	}
	public int getPower() {
		return power.get();
	}
	
	public void setPower(int power) {
		this.power.set(power);
	}
	public void setAvailable(boolean available) {
		this.available.set(available);
	}
	public void setNavi(boolean navi) {
		this.navi.set(navi);
	}
	
	public void setYearOfProduction(String yearOfProduction) {
		this.yearOfProduction.set(yearOfProduction);
	}
	public void setBrand(String brand)
	{
		this.brand.set(brand);
	}
	public void setEngine(String engine)
	{
		this.engine.set(engine);
	}
	
	
	
	
	
	

}
