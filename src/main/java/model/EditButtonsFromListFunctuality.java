package model;

import java.io.IOException;

import com.mysql.cj.api.xdevapi.Table;

import controller.EditCarPropertyController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EditButtonsFromListFunctuality 
{
	
/*	public <T> void addListenerToButton(Button button, String path, T interfaceInstance)
	{
		button.addEventFilter(MouseEvent.MOUSE_CLICKED, e->{
    		FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
    		Stage stage = new Stage();

    		CarTableView carTableViewItem = findProperObjectInTableView(interfaceInstance,button);
    		try {
    			EditCarPropertyController editCarPropertyController = new EditCarPropertyController();
    			loader.setController(editCarPropertyController);
    			editCarPropertyController.passSelectedItem(carTableViewItem);
				Scene scene = new Scene((Pane)loader.load());
				stage.setScene(scene);
				stage.show();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
    		
    	});
	}*/
	
	
	//Wyszukanie odpowiedniego auta maj¹c tylko button na ktorym wykonal sie listener!
	public static <T extends TableViewFillModelInterfance<T>> T findProperObjectInTableView(T t, Button button) {
	    for(TableViewFillModelInterfance<T> carnet : t.getObservableList()) {
	        if(carnet.getActionButton().equals(button)) {
	        	System.out.println("Found!");
	            return (T) carnet;
	        }
	    }
	    return null;
	}
}

