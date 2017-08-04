package controller;

import com.jfoenix.controls.JFXDatePicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import model.CarTableView;
import model.CustomerTableView;
import model.Deal;
import model.DealListView;

public class AddNewDealFormController {
	
	private DealListView dealListView;
	private CarTableView carTableView;
	private CustomerTableView customerTableView;
	@FXML
    private ChoiceBox<CarTableView> carChoiceBox;

    @FXML
    private ChoiceBox<CustomerTableView> customerChoiceBox;

    @FXML
    private JFXDatePicker fromDatePicker;

    @FXML
    private JFXDatePicker tillDatePicker;

    @FXML
    private Button acceptButton;
    
    public AddNewDealFormController(CustomerTableView customerTableView,CarTableView carTableView,DealListView dealListView)
    {
    	this.customerTableView = customerTableView;
    	this.carTableView = carTableView;
    	this.dealListView = dealListView;
    }

    @FXML
    void acceptButtonClicked(ActionEvent event) {
    	Deal deal = new Deal(carChoiceBox.getSelectionModel().getSelectedItem(),customerChoiceBox.getSelectionModel().getSelectedItem(),fromDatePicker.getValue(),tillDatePicker.getValue());
    	dealListView.getObservableList().add(deal);
    	Button button = (Button) event.getSource();
    	button.getScene().getWindow().hide();

    }
    
    @FXML
    public void initialize()
    {
    	carChoiceBox.setItems(carTableView.getObservableList());
    	customerChoiceBox.setItems(customerTableView.getObservableList());
    }


}
