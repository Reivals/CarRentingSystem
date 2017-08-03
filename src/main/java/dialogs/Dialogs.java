package dialogs;

import javafx.scene.control.Alert;

public class Dialogs {
	
	public static void errorAlert(String contentText,String headerText)
	{
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setContentText(contentText);
		alert.setHeaderText(headerText);
		alert.showAndWait();
		
		
	}
			

}
