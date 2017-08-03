package app;

import controller.LogInController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.DataValidation;
import model.LoggedUser;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	LoggedUser userModel = new LoggedUser();
	

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
		LogInController logInController = new LogInController();
		loader.setController(logInController);
		Scene scene = new Scene((Pane)loader.load());
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
		
	}

}
