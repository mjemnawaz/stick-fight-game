package sprites;

import javafx.scene.image.ImageView;

public class Platform {
	private ImageView img;
	double x, y;
	public Platform(String imgPath, double x, double y) {
		img = new ImageView(imgPath);
		this.x = x;
		this.y = y;
	}
	public Platform(ImageView img, double x, double y) {
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
}
