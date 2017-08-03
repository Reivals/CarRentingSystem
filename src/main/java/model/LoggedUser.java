package model;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;

public class LoggedUser {
	private static LoggedUser instance = null;
	private static SimpleStringProperty login = new SimpleStringProperty();
	private static SimpleStringProperty password = new SimpleStringProperty();
	public LoggedUser() {}
	
	   public static LoggedUser getInstance() {
		      if(instance == null) {
		         instance = new LoggedUser();
		      }
		      return instance;
		   }
	

	public static SimpleStringProperty getLoginProperty() {
		return login;
	}
	public static SimpleStringProperty getPasswordProperty() {
		return password;
	}
	public static String getLogin()
	{
		return login.getValue();
	}

	public static void setLogin(String login) {
		LoggedUser.login.setValue(login);;
	}

	public static void setPassword(String password) {
		LoggedUser.password.setValue(password);
	}
	
	
	
	

}
