package controller;

import com.jfoenix.controls.JFXTextField;

import dialogs.Dialogs;
import interfaces.ControllerInterface;
import interfaces.TableViewFillModelInterfance;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.CustomerTableView;
import model.DataValidation;

public class EditCustomerPropertyController implements ControllerInterface{
	private CustomerTableView model;
	@FXML
	private Button acceptButton;

	@FXML
	private JFXTextField nameTextField;

	@FXML
	private JFXTextField surnameTextField;

	@FXML
	private JFXTextField cityTextField;

	@FXML
	private JFXTextField postCodeTextField;

	@FXML
	private JFXTextField streetTextField;

	@FXML
	private JFXTextField localNumberTextField;

	private CustomerTableView selectedItem;


	public EditCustomerPropertyController(CustomerTableView model)
	{
		this.model = model;
		System.out.println("Kontroller wstrzykniety");
	}

	public EditCustomerPropertyController() {
	}
	@FXML
	void acceptButtonClicked(ActionEvent event) {
		if(DataValidation.validName(nameTextField.getText()) 
				&& DataValidation.validSurname(surnameTextField.getText()) 
				&& DataValidation.validCity(cityTextField.getText())
				&& DataValidation.validPostCode(postCodeTextField.getText()) 
				&& DataValidation.validLocalNumber(localNumberTextField.getText())
				&& DataValidation.validStreet(streetTextField.getText())) {

			selectedItem.setName(nameTextField.getText());
			selectedItem.setSurname(surnameTextField.getText());
			selectedItem.setCity(cityTextField.getText());
			selectedItem.setPostCode(postCodeTextField.getText());
			selectedItem.setStreet(streetTextField.getText());
			selectedItem.setLocalNumber(localNumberTextField.getText());
			Button button = (Button)event.getSource();
			button.getScene().getWindow().hide();
		}
		else
		{
			System.out.println(localNumberTextField.getText());
			Dialogs.errorAlert("Apparenty you mistyped some properties\n", "Please correct data");
		}

	}

	@FXML
	public void initialize()
	{
		nameTextField.setText(selectedItem.getName());
		surnameTextField.setText(selectedItem.getSurname());
		cityTextField.setText(selectedItem.getCity());
		postCodeTextField.setText(selectedItem.getPostCode());
		streetTextField.setText(selectedItem.getStreet());
		localNumberTextField.setText(selectedItem.getLocalNumber());
	}

	@Override
	public <T> void passSelectedItem(TableViewFillModelInterfance<T> properObject) {
		this.selectedItem = (CustomerTableView) properObject;

	}

}
