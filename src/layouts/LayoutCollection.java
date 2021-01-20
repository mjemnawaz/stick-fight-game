package layouts;

import constants.GlobalConstants;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sprites.Player;

public class LayoutCollection {

	private static StackPane loginLayout;
//	private static Parent registrationLayout;
//	private static Parent leaderboardLayout;
	private static StackPane lobby;
	
	public static StackPane getLoginLayout(Parent parentLayout) {
		
		if(loginLayout != null) {
			return loginLayout;
		}
		
		double width = GlobalConstants.getWidth();
		double height = GlobalConstants.getHeight();
		Stage primaryStage = GlobalConstants.getPrimaryStage();
		
		loginLayout = new StackPane();
		loginLayout.getStyleClass().add("titleScreens");
		
		VBox wrapperModal = new VBox(20);
		wrapperModal.setAlignment(Pos.CENTER);
		
		VBox loginModal = new VBox(0);
		loginModal.setId("loginModal");
		loginModal.setAlignment(Pos.TOP_CENTER);
		
		Label signInText = new Label("SIGN IN");
		signInText.setId("loginTitleLabel");
		signInText.setPadding(new Insets(height/24.0, 0, height/16.0, 0));
		signInText.setAlignment(Pos.CENTER);
		
		VBox textBoxes = new VBox(height/24.0);
		textBoxes.setAlignment(Pos.TOP_LEFT);
		textBoxes.setPadding(new Insets(0, width/24.0, height/24.0, width/24.0));
		
		VBox userNameBox = new VBox(2);
		Label usernameLabel = new Label("Username:");
		usernameLabel.getStyleClass().add("loginPageLabels");
		TextField username = new TextField();
		username.getStyleClass().add("loginTextFields");
		
		VBox passwordBox = new VBox(2);
		Label passwordLabel = new Label("Password:");
		passwordLabel.getStyleClass().add("loginPageLabels");
		TextField password = new TextField();
		password.getStyleClass().add("loginTextFields");
		
		Button loginButton = new Button("LOGIN");
		loginButton.setId("loginButton");
		loginButton.setPadding(new Insets(2, width/36.0, 2, width/36.0));
		
		Button goBack = new Button("Return To Title Screen");
		goBack.setId("returnButton");
		goBack.setAlignment(Pos.BOTTOM_CENTER);
		goBack.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				primaryStage.getScene().setRoot(parentLayout);
			}
		});
		
		userNameBox.getChildren().addAll(usernameLabel, username);
		passwordBox.getChildren().addAll(passwordLabel, password);
		textBoxes.getChildren().addAll(userNameBox, passwordBox);
		loginModal.getChildren().addAll(signInText, textBoxes, loginButton);
		wrapperModal.getChildren().addAll(loginModal, goBack);
		loginLayout.getChildren().addAll(wrapperModal);
		wrapperModal.setMaxWidth(width/3);
		loginModal.setMaxWidth(width/3);
		loginModal.setMinHeight((1.7*height)/3.0);
		
		return loginLayout;
	}
	
/**	
	public static Parent getRegistrationLayout() {
		
		if(registrationLayout != null) {
			return registrationLayout;
		}
		
		return registrationLayout;
	}
	
	public static Parent getLeaderboardLayout() {
		
		if(leaderboardLayout != null) {
			return leaderboardLayout;
		}
		
		return leaderboardLayout;
	}
	
*/
	public static StackPane getLobby(Parent parentLayout) {
		//if(lobby!=null) return lobby;
		
		lobby = new StackPane();
		lobby.getStyleClass().add("titleScreens");
		
		VBox wrapperModal = new VBox(20);
		wrapperModal.setAlignment(Pos.CENTER);
		
		Player player = new Player("file:images/Walk/right", 100, 100);
		ImageView iv2 = new ImageView();
		iv2.setImage(new Image("file:images/Platforms/gold-block"));
		iv2.setFitWidth(100);
        iv2.setPreserveRatio(true);
        iv2.setSmooth(true);
        iv2.setCache(true);
		
		wrapperModal.getChildren().addAll(iv2, new Label("what the frick"));
		lobby.getChildren().add(wrapperModal);
		return lobby;
	}
	
}
