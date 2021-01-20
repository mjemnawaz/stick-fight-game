package layouts;

import constants.GlobalConstants;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TitleScreenLayout {
		
	public static void display(Scene mainScene, String location) {
				
		double width = GlobalConstants.getWidth();
		double height = GlobalConstants.getHeight();

		Label label1= new Label("Stick Wars");
		label1.setId("titleLabel");
		label1.setPadding(new Insets(height/6.0, 0, height/12.0, 0));
		
		Button signInButton = new Button("SIGN IN");
		Button createAccountButton = new Button("CREATE ACCOUNT");
		Button playAsGuestButton = new Button("PLAY AS GUEST");
		Button viewLeaderBoardButton = new Button("VIEW LEADERBOARD");
		
		signInButton.getStyleClass().add("titleScreenButton");
		createAccountButton.getStyleClass().add("titleScreenButton");
		playAsGuestButton.getStyleClass().add("titleScreenButton");
		viewLeaderBoardButton.getStyleClass().add("titleScreenButton");
		
		VBox layout1 = new VBox(10);     
		layout1.getChildren().addAll(label1, signInButton, createAccountButton, playAsGuestButton, viewLeaderBoardButton);
		layout1.getStyleClass().add("titleScreens");
		layout1.setAlignment(Pos.TOP_CENTER);
		layout1.setPrefWidth(width/3.5);
		
		signInButton.setMinWidth(layout1.getPrefWidth());
		createAccountButton.setMinWidth(layout1.getPrefWidth());
		playAsGuestButton.setMinWidth(layout1.getPrefWidth());
		viewLeaderBoardButton.setMinWidth(layout1.getPrefWidth());
		
		Stage primaryStage = GlobalConstants.getPrimaryStage();
		
		signInButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				StackPane loginPage = LayoutCollection.getLoginLayout(layout1);
				primaryStage.getScene().setRoot(loginPage);
			}
		});
		
		playAsGuestButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				StackPane lobby = LayoutCollection.getLobby(layout1);
				primaryStage.getScene().setRoot(lobby);
			}
		});
				
		mainScene = new Scene(layout1, width, height);
		
		GlobalConstants.setMainScene(mainScene);
		
		mainScene.getStylesheets().add("https://fonts.googleapis.com/css?family=Inconsolata:bold");
		mainScene.getStylesheets().add("https://fonts.googleapis.com/css?family=Inconsolata");
		      
		primaryStage.setScene(mainScene);
		mainScene.getStylesheets().add(location);
		primaryStage.show();
	}
}
