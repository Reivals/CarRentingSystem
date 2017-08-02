package controller;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import model.ControllerInterface;
import model.EditButtonsFromListFunctuality;

public class CarListController{
	
	private CarTableView carTableViewModel;
	
	@FXML
    private TableView<CarTableView> tableView;

    @FXML
    private TableColumn<CarTableView, String> brandColumn;

    @FXML
    private TableColumn<CarTableView, String> engineColumn;

    @FXML
    private TableColumn<CarTableView, String> dateOfProductionColumn;

    @FXML
    private TableColumn<CarTableView, Boolean> naviColumn;

    @FXML
    private TableColumn<CarTableView, Boolean> availableColumn;

    @FXML
    private TableColumn<CarTableView, Number> powerColumn;

    @FXML
    private TableColumn<CarTableView, Button> actionColumn;
    
    public CarListController(CarTableView carTableViewModel) {
		this.carTableViewModel=carTableViewModel;
	}

	@FXML
    public void initialize()
    {
		carTableViewModel.getObservableList().addAll(new CarTableView("FIAT","d","12.08.2017",true,true,120,new Button("Edit")),new CarTableView("BMW","d","30.08.2017",true,true,120,new Button("Edit")));
    	for(CarTableView car : carTableViewModel.getObservableList()) // iteracja po liscie 
    	{
    		EditButtonsFromListFunctuality.addListenerToButton(car.getActionButton(),"/fxml/EditCarProperty.fxml",carTableViewModel);
    		
   	}
    	tableView.setItems(carTableViewModel.getObservableList());
    	brandColumn.setCellValueFactory(cellData->cellData.getValue().getBrandProperty());
    	engineColumn.setCellValueFactory(cellData->cellData.getValue().getEngineProperty());
    	dateOfProductionColumn.setCellValueFactory(cellData->cellData.getValue().getYearOfProductionProperty());
    	naviColumn.setCellValueFactory(cellData->cellData.getValue().getNaviProperty());
    	availableColumn.setCellValueFactory(cellData->cellData.getValue().getAvailableProperty());
    	powerColumn.setCellValueFactory(cellData->cellData.getValue().getPowerProperty());
    	actionColumn.setCellValueFactory(new PropertyValueFactory<CarTableView, Button>("actionButton"));

    }
	public void addListenerToButton(Button button) // JAK zrobic to lepiej ¿eby funkcja byla uniwersalna dla Car i Customer? Propozycja w EditButtonsFrom....()
	{
		button.addEventFilter(MouseEvent.MOUSE_CLICKED, e->{
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EditCarProperty.fxml"));
    		Stage stage = new Stage();

    		CarTableView carTableViewItem = EditButtonsFromListFunctuality.findProperObjectInTableView(carTableViewModel,button);
    		try {
    			EditCarPropertyController editCarPropertyController = new EditCarPropertyController(carTableViewModel);
    			loader.setController(editCarPropertyController);
    			editCarPropertyController.passSelectedItem(carTableViewItem);
				Scene scene = new Scene((Pane)loader.load());
				stage.setScene(scene);
				stage.show();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
    		
    	});
	}
}
