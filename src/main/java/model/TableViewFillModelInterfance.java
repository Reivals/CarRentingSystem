package model;

import java.util.Collection;

import javafx.scene.control.Button;

public interface TableViewFillModelInterfance <T> {
	
	public Button getActionButton();
	
	Collection <T> getObservableList();

}
