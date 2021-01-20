package sprites;

import javafx.scene.image.ImageView;

public class Player {
	
	private ImageView img = new ImageView("file:images/Walk/right");
	private double x=0, y=0, vx=0, vy=0;
	private double HP = 100, speed = 1, attack = 1, defense = 1;
	private boolean isDucking, isJumping, isRunning, isOnPlatform;
	
	/* private Weapon weapon; private boolean hasWeapon; */
	
	public Player(String imgPath, double x, double y) {
		img = new ImageView(imgPath);
		this.x = x;
		this.y = y;
	}
	public Player(ImageView img, double x, double y) {
		this.img = img;
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public ImageView getImage() {
		return img;
	}
	public void moveLeft() {
		
	}
	public void moveRight() {
		
	}
}
class Running extends Thread{ // running animation
	
}
class Jumping extends Thread{ // jumping animation + jumping movement
	
}