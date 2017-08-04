package model;

import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

public class DealListView extends Deal{
	
	private ObservableList<Deal> observableList = FXCollections.observableArrayList();

	
	public ObservableList<Deal> getObservableList() {
		return observableList;
		
	}
	

}
