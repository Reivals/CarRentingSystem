package controller;

import java.util.Properties;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Car;
import model.CarTableView;
import model.Customer;
import model.CustomerTableView;

public class CustomersListController {

		private CustomerTableView customerTableViewModel;
		@FXML
	    private TableView<CustomerTableView> tableView;

	    @FXML
	    private TableColumn<CustomerTableView, String> nameColumn;

	    @FXML
	    private TableColumn<CustomerTableView, String> surnameColumn;

	    @FXML
	    private TableColumn<CustomerTableView, String> cityColumn;

	    @FXML
	    private TableColumn<CustomerTableView, String> postCodeColumn;

	    @FXML
	    private TableColumn<CustomerTableView, String> streetColumn;

	    @FXML
	    private TableColumn<CustomerTableView, String> localNumberColumn;

	    @FXML
	    private TableColumn<CustomerTableView, Button> actionColumn;
	    
	    public CustomersListController(CustomerTableView customerTableViewModel)
	    {
	    	this.customerTableViewModel=customerTableViewModel;
	    }
	    
	    
	    @FXML
	    public void initialize()
	    {
	    	customerTableViewModel.getObservableList().add(new CustomerTableView("Michal","Karkowski","Gliwice","44-100","Gagarina","22/13",new Button("Edit")));
	    	tableView.setItems(customerTableViewModel.getObservableList());
	    	nameColumn.setCellValueFactory(cellData -> cellData.getValue().getName());
	    	surnameColumn.setCellValueFactory(cellData -> cellData.getValue().getSurname());
	    	cityColumn.setCellValueFactory(cellData -> cellData.getValue().getCity());
	    	postCodeColumn.setCellValueFactory(cellData -> cellData.getValue().getPostCode());
	    	streetColumn.setCellValueFactory(cellData -> cellData.getValue().getStreet());
	    	localNumberColumn.setCellValueFactory(cellData -> cellData.getValue().getLocalNumber());
	    	actionColumn.setCellValueFactory(new PropertyValueFactory<CustomerTableView,Button>("actionButton"));
	    	// DALEJ TUTAJ
	    }
}
