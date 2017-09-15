package GUI;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.security.PrivateKey;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController  implements Initializable{
	
	@FXML
	private Label label; 
	@FXML
	private ComboBox combo;
	
	@FXML
	private TextField text;
	
	ObservableList<String> listaCombo = FXCollections.observableArrayList();
	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		System.out.println("You click me!");
		label.setText("Hola mundo!");
		
	}

	@FXML
	private void verItem(ActionEvent event) {
		String itemSeleccionado = combo.getValue().toString();
		text.setText(itemSeleccionado);
		
	}
	
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		listaCombo.add("Item 1");
		listaCombo.add("Item 2");
		listaCombo.add("Item 3");
		listaCombo.add("Item 4");
		combo.setItems(listaCombo);
		
	}

}
