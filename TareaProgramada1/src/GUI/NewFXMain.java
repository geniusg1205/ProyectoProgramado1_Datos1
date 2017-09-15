package GUI;

import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class NewFXMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/GUI/GUI_FXML.fxml"));
			//Screen screen = Screen.getPrimary();
			//Rectangle2D bounds = screen.getVisualBounds();
			
			//primaryStage.setX(bounds.getMinX());
			//primaryStage.setY(bounds.getMinY());
			//primaryStage.setWidth(bounds.getWidth());
			//primaryStage.setHeight(bounds.getHeight());
			
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		
		} catch (IOException ex) {
			Logger.getLogger(NewFXMain.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
