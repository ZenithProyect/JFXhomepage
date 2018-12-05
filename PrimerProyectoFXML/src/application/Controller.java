package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;

public class Controller {
	
	@FXML
	private ImageView forestview;
	
	@FXML
	public void initialize() {
		forestview.setEffect(new GaussianBlur(2));
	}
	
	@FXML
	public void finish() {
		System.exit(0);
	}
}
