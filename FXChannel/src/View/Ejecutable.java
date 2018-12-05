package View;

import java.io.IOException;
import View.ControlCapas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ejecutable extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		try {
			FXMLLoader layouts = new FXMLLoader(); //llamamos a la clase FXML
			layouts.setLocation(Ejecutable.class.getResource("FxCChannel.fxml")); //indicamos el archivo XML
			AnchorPane abPLayouts = (AnchorPane) layouts.load(); //iniciamos el anchorpane
			
			Scene scene = new Scene(abPLayouts); //añadimos el anchorpane a Scene.
			primaryStage.setScene(scene); //añadimos scene a stage
			
			ControlCapas control = layouts.getController(); //llamada a los controladores de capas.
			control.FXejecutar(this); //coge la clase principal y la mete en el controlador.
			
			
			
			primaryStage.show(); //muestra o arranca la aplicacion.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
