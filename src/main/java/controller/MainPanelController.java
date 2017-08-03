package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import interfaces.ControllerInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import model.CarTableView;
import model.CustomerTableView;
import model.LoggedUser;

public class MainPanelController{
		CarTableView carTableViewModel = new CarTableView();
		CustomerTableView customerTableViewModel = new CustomerTableView();
	 	@FXML
	    private VBox leftVBox;

	    @FXML
	    private ImageView avatarImage;

	    @FXML
	    private Label nameLabel;

	    @FXML
	    private Label typeLabel;

	    @FXML
	    private JFXButton customersButton;

	    @FXML
	    private JFXButton CarsButton;

	    @FXML
	    private JFXButton dealsButton;

	    @FXML
	    private JFXButton calendarButton;

	    @FXML
	    private AnchorPane rightAnchorPane;

	    @FXML
	    void calendarButtonClicked(ActionEvent event) {

	    }

	    @FXML
	    void carsButtonClicked(ActionEvent event) throws IOException {
	    	CarListController carListController = new CarListController(carTableViewModel);
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CarsList.fxml"));
	    	loader.setController(carListController);
	    	rightAnchorPane.getChildren().add(loader.load());

	    }

	    @FXML
	    void customersButtonClicked(ActionEvent event) throws IOException {
	    	CustomersListController customerListController = new CustomersListController(customerTableViewModel);
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CustomersList.fxml"));
	    	loader.setController(customerListController);
	    	rightAnchorPane.getChildren().add(loader.load());
	    }

	    @FXML
	    void dealsButtonClicked(ActionEvent event) {

	    }
	    
	    @FXML
	    public void initialize()
	    {
	    	nameLabel.setText("Name: "+ LoggedUser.getInstance().getLogin());
	    }

}
