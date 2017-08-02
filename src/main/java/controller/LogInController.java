package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.ControllerInterface;
import model.LoggedUser;

public class LogInController{
	
    @FXML
    private JFXTextField userTextField;

    @FXML
    private JFXPasswordField passwordTextField;

    @FXML
    private JFXButton logInButton;
    
    public LogInController()
    {
    }
    
    @FXML
    public void initialize()
    {
    	LoggedUser.getInstance();
    	userTextField.textProperty().bindBidirectional(LoggedUser.getLoginProperty());
    	passwordTextField.textProperty().bindBidirectional(LoggedUser.getPasswordProperty());
    	
    }
    //WALIDACJA DANYCH Z BAZA DANYCH, na razie przepuszcza ka¿dego
    @FXML
    public void acceptButtonClicked(ActionEvent e)
    {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainPanel.fxml"));
    	MainPanelController mainPanelController = new MainPanelController();
    	loader.setController(mainPanelController);
    	Scene scene;
		try {
			scene = new Scene((Pane)loader.load());
	    	Stage stage = (Stage) logInButton.getScene().getWindow();
	    	stage.setScene(scene);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

    }

}
