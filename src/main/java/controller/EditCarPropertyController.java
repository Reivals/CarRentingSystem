package controller;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import model.CarTableView;

public class EditCarPropertyController {
	
		CarTableView selectedItem;
	 	@FXML
	    private GridPane gridPane;

	    @FXML
	    private Button acceptButton;

	    @FXML
	    private ChoiceBox<String> naviChoiceBox;

	    @FXML
	    private ChoiceBox<String> availableChoiceBox;

	    @FXML
	    private JFXDatePicker yearOfProductionDatePicker;

	    @FXML
	    private JFXTextField brandTextField;

	    @FXML
	    private JFXTextField engineTextField;

	    @FXML
	    private JFXTextField powerChoiceBox;

	    @FXML
	    void acceptButtonClicked(ActionEvent event) {
	    	selectedItem.setBrand(brandTextField.getText());
	    	selectedItem.setEngine(engineTextField.getText());
	    	selectedItem.setNavi(whichIsSelected(naviChoiceBox));
	    	selectedItem.setYearOfProduction(yearOfProductionDatePicker.getValue().toString());
	    	selectedItem.setPower(Integer.parseInt(powerChoiceBox.getText()));
	    	selectedItem.setAvailable(whichIsSelected(availableChoiceBox));
	    	Button button = (Button)event.getSource();
	    	button.getScene().getWindow().hide();

	    }
	    
	    @FXML
	    public void initialize()
	    {
	    	choiceBoxYesNoInit();
	    	fillData();

	    	
	    }
	    
	    public void choiceBoxYesNoInit()
	    {
	    ObservableList<String> list = FXCollections.observableArrayList("Yes","No");
	    availableChoiceBox.setItems(list);
	    naviChoiceBox.setItems(list);
	    availableChoiceBox.getSelectionModel().selectFirst();
	    naviChoiceBox.getSelectionModel().selectFirst();
	    }
	    public void fillData()
	    {
	    	DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd.MM.yyyy");
	    	LocalDate date = LocalDate.parse(selectedItem.getYearOfProduction(), formatter); 
	    	brandTextField.setText(selectedItem.getBrand());
	    	engineTextField.setText(selectedItem.getEngine());
	    	powerChoiceBox.setText(((Integer)selectedItem.getPower()).toString());
	    	yearOfProductionDatePicker.setValue(date);
	    	availableChoiceBox.getSelectionModel().select(whichToSelect(selectedItem));
	    	naviChoiceBox.getSelectionModel().select(whichToSelect(selectedItem));
	    }

		public void passSelectedItem(CarTableView carTableViewItem) {
			selectedItem = carTableViewItem;
			
		}
		
		public int whichToSelect(CarTableView selectedItem)
		{
			if(selectedItem.getAvailable()==true)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
		public boolean whichIsSelected(ChoiceBox<String> choiceBox)
		{
			if(choiceBox.getSelectionModel().getSelectedItem()=="YES")
			{
				return true;
			}
			else
			{
				return false;
			}
		}

}
