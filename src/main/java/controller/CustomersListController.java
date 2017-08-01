package controller;


import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.CarTableView;
import model.CustomerTableView;
import model.EditButtonsFromListFunctuality;

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
	    	for( CustomerTableView customer : customerTableViewModel.getObservableList())
	    	{
	    		addListenerToButton(customer.getActionButton());
	    	}
	    	tableView.setItems(customerTableViewModel.getObservableList());
	    	nameColumn.setCellValueFactory(cellData -> cellData.getValue().getNameProperty());
	    	surnameColumn.setCellValueFactory(cellData -> cellData.getValue().getSurnameProperty());
	    	cityColumn.setCellValueFactory(cellData -> cellData.getValue().getCityProperty());
	    	postCodeColumn.setCellValueFactory(cellData -> cellData.getValue().getPostCodeProperty());
	    	streetColumn.setCellValueFactory(cellData -> cellData.getValue().getStreetProperty());
	    	localNumberColumn.setCellValueFactory(cellData -> cellData.getValue().getLocalNumberProperty());
	    	actionColumn.setCellValueFactory(new PropertyValueFactory<CustomerTableView,Button>("actionButton"));
	    	// DALEJ TUTAJ
	    }
	    
	    public void addListenerToButton(Button button) // JAK zrobic to lepiej ¿eby funkcja byla uniwersalna dla Car i Customer? Propozycja w EditButtonsFrom....()
		{
			button.addEventFilter(MouseEvent.MOUSE_CLICKED, e->{
	    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EditCustomerProperty.fxml"));
	    		Stage stage = new Stage();

	    		CustomerTableView customerTableViewItem = EditButtonsFromListFunctuality.findProperObjectInTableView(customerTableViewModel,button);
	    		try {
	    			EditCustomerPropertyController editCustomerPropertyController = new EditCustomerPropertyController(customerTableViewModel);
	    			loader.setController(editCustomerPropertyController);
	    			editCustomerPropertyController.passSelectedItem(customerTableViewItem);
					Scene scene = new Scene((Pane)loader.load());
					stage.setScene(scene);
					stage.show();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
	    		
	    	});
		}
}
