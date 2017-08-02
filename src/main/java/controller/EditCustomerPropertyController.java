package controller;

import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.ControllerInterface;
import model.CustomerTableView;
import model.TableViewFillModelInterfance;

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
			// TODO Auto-generated constructor stub
		}
		@FXML
	    void acceptButtonClicked(ActionEvent event) {
	    	selectedItem.setName(nameTextField.getText());
	    	selectedItem.setSurname(surnameTextField.getText());
	    	selectedItem.setCity(cityTextField.getText());
	    	selectedItem.setPostCode(postCodeTextField.getText());
	    	selectedItem.setStreet(streetTextField.getText());
	    	selectedItem.setLocalNumber(localNumberTextField.getText());
	    	Button button = (Button)event.getSource();
	    	button.getScene().getWindow().hide();

	    	

	    }
	    @FXML
	    public void initialize()
	    {
	    	if(nameTextField==null)
	    	{
	    		System.out.println("1");
	    	}
	    	if(selectedItem==null)
	    	{
	    		System.out.println("2");
	    	}
	    	nameTextField.setText(selectedItem.getName());
	    	surnameTextField.setText(selectedItem.getSurname());
	    	cityTextField.setText(selectedItem.getCity());
	    	postCodeTextField.setText(selectedItem.getPostCode());
	    	streetTextField.setText(selectedItem.getStreet());
	    	localNumberTextField.setText(selectedItem.getLocalNumber());
	    }
	
/*	public void passSelectedItem(CustomerTableView customerTableViewItem) {
		this.selectedItem = customerTableViewItem;
		
	}*/
	@Override
	public <T> void passSelectedItem(TableViewFillModelInterfance<T> properObject) {
		this.selectedItem = (CustomerTableView) properObject;
		
	}

}
