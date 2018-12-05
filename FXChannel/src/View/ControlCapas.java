package View;


import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControlCapas {

	Ejecutable eje;
	
	@FXML
	Button die;
	@FXML
	Button live;
	
	
	@FXML
	private void die() {
		
		System.exit(0);
		
	}
	
	@FXML
	private void live() {
		
		//TODO
		
	}
	
	public void FXejecutar(Ejecutable eje) {
		this.eje=eje;
	}

	
}
