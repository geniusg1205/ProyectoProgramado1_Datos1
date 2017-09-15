package GUI;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class FXMLDocumentController  implements Initializable{
	
	@FXML
	private Label label; 
	@FXML
	private ComboBox combo;
	
	@FXML
	private TextField text;
	
	@FXML
	private Button btn1;
	
	@FXML
	TreeView <String> treeview;
	
	TreeItem <String> root = new TreeItem<>("Json Store");
	
	
	ObservableList<String> listaCombo = FXCollections.observableArrayList();


	@FXML
	private void verItem(ActionEvent event) {
		String itemSeleccionado = combo.getValue().toString();
		text.setText(itemSeleccionado);
		
	}
	
	
	@FXML
	private void Exit(ActionEvent event) {
		Platform.exit();	
	}
	
	
	@FXML
	private void creaStore(ActionEvent event) {
		JsonStore a = new JsonStore();
		a.CrearJson("Hola");
		TreeItem <String> Hola = new TreeItem<>("Hola");
		root.getChildren().add(Hola);
		treeview.setRoot(root);
		
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		TreeItem <String>  prueba = new TreeItem<>("Prueba");
		root.getChildren().add(prueba);
		treeview.setRoot(root);
		
		
		
		
		
	}

}
