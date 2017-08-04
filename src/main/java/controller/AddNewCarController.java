package controller;

import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class AddNewCarController {
	
		@FXML
	    private Button acceptButton;

	    @FXML
	    private JFXTextField brandTextField;

	    @FXML
	    private JFXTextField engineTextField;

	    @FXML
	    private JFXTextField dateOfProduction;

	    @FXML
	    private JFXTextField powerTextField;

	    @FXML
	    private ChoiceBox<String> naviChoiceBox;

	    @FXML
	    private ChoiceBox<String> avaliableChoiceBox;
	    
	    @FXML
	    public void acceptButtonClicked(ActionEvent e)
	    {
	    	
	    }

}
