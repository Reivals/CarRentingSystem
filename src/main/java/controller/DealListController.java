package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.jfoenix.controls.JFXListView;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import model.Car;
import model.Customer;
import model.Deal;
import model.DealListView;

public class DealListController {
	
	private DealListView dealModel;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private JFXListView<Deal> listView;
    
    
    public DealListController(DealListView dealListViewModel) {
		dealModel = dealListViewModel;
	}


	@FXML
    public void initialize()
    {
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	LocalDate date = LocalDate.parse("1993-12-01", formatter); 
    	LocalDate date1 = LocalDate.parse("1993-12-02", formatter); 
		
		dealModel.getObservableList().add(new Deal(new Car("FIAT","JTD","1993-02-02",true,true,123),
				new Customer("Michal","Karkowski","Gliwice","44-100","Gagarina","22/13"),date,date1));
    	listView.setItems(dealModel.getObservableList());
    	
    	
    }
    
    
    @Override
    public String toString()
    {
    	return "";
    }

}
