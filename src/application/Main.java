package application;

import constants.GlobalConstants;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import layouts.TitleScreenLayout;


public class Main extends Application {
	
	private static Stage primaryStage;
	private Scene mainScene;
	
	@Override
	public void start(Stage primaryStage1) {

		primaryStage = primaryStage1;
		
		GlobalConstants.setPrimaryStage(primaryStage);
		
		String cssLocation = getClass().getResource("application.css").toExternalForm();
		
		primaryStage.setTitle("Stick Wars!");
		primaryStage.setFullScreen(true);
		
		TitleScreenLayout.display(mainScene, cssLocation);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
