package model;

import java.io.IOException;

import com.mysql.cj.api.xdevapi.Table;

import controller.EditCarPropertyController;
import controller.EditCustomerPropertyController;
import interfaces.ControllerInterface;
import interfaces.TableViewFillModelInterfance;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EditButtonsFromListFunctuality 
{
	
	public static <T extends TableViewFillModelInterfance<T>> void addListenerToButton(Button button, String path, T interfaceInstance)
	{
		button.addEventFilter(MouseEvent.MOUSE_CLICKED, e->{

    
    		ControllerInterface controllerObject=null;
    		TableViewFillModelInterfance<T> properObject = findProperObjectInTableView(interfaceInstance,button);
    		FXMLLoader loader = new FXMLLoader(properObject.getClass().getResource(path));
    		try {
    			if(properObject instanceof CustomerTableView)
    			{
    				controllerObject = new EditCustomerPropertyController((CustomerTableView) interfaceInstance);
    			}
    			else if(properObject instanceof CarTableView)
    			{
    				controllerObject = new EditCarPropertyController((CarTableView) interfaceInstance);
    			}
    			loader.setController(controllerObject);
    			controllerObject.passSelectedItem(properObject);
    			Stage stage = new Stage();
				Scene scene = new Scene((Pane)loader.load());


				stage.setScene(scene);
				stage.show();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
    		
    	});
	}
	
	
	//Wyszukanie odpowiedniego auta maj¹c tylko button na ktorym wykonal sie listener!
	public static <T extends TableViewFillModelInterfance<T>> T findProperObjectInTableView(T t, Button button) {
	    for(TableViewFillModelInterfance<T> carnet : t.getObservableList()) {
	        if(carnet.getActionButton().equals(button)) {
	            return (T) carnet;
	        }
	    }
	    return null;
	}
}

