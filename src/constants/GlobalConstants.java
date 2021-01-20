package constants;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class GlobalConstants {
	
	/**
	 *	This class defines any constants that are used 
	 */
	private static double screenWidth = -1;
	private static double screenHeight = -1;
	private static Stage primaryStage;
	private static Scene mainScene;
	
	public static void setPrimaryStage(Stage someStage) {
		primaryStage = someStage;
	}
	
	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void setMainScene(Scene someScene) {
		mainScene = someScene;
	}
	
	public static Scene getMainScene() {
		return mainScene;
	}
	
	public static double getWidth() {
		if(screenWidth != -1) {
			return screenWidth;
		}
		
		Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
		screenWidth = screenBounds.getWidth();
		return screenWidth;
	}
	
	public static double getHeight() {
		if(screenHeight != -1) {
			return screenHeight;
		}
		
		Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
		screenHeight = screenBounds.getHeight();
		return screenHeight;
	}
}
