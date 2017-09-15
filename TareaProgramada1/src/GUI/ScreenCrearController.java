package GUI;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class ScreenCrearController  implements Initializable{
	
	@FXML
	private void creaStore(ActionEvent event) {
		Parent VentanaCrear = FXMLLoader.load(getClass().getResource("/GUI/ScreenCrear.fxml"));
		Scene EscenaCrear = new Scene(VentanaCrear);
	}
		
		

	
	public void initialize(URL url, ResourceBundle rb) {
		
	}
		
}