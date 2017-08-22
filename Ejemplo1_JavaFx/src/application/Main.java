package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent>{
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Label lblHello;
	private TextField txtHello;
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox hbox = new HBox();
				//Como decir CANVAS
			hbox.setSpacing(10);
			lblHello = new Label("Ingresa tu nombre");
				//SE CREA UN LABEL
			txtHello = new TextField();
				//Crea el campo para ingresar texto
			hbox.getChildren().addAll(lblHello, txtHello);
			
			
			HBox areaBotones = new HBox();
			btn1 = new Button("Cambiar LABEL");
			btn1.setOnAction(this);
			btn2 = new Button("Cambiar TEXTO");
			btn2.setOnAction(this);
			btn3 = new Button("Cambiar IMPRIMIR");
			btn3.setOnAction(this);
			areaBotones.getChildren().addAll(btn1, btn2, btn3);
			
			BorderPane root = new BorderPane();
			root.setTop(hbox);
			root.setBottom(areaBotones);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Ejemplo label y TextFields");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		if ((Button)event.getSource() == btn1) {
			lblHello.setText("Okay");
		} else if((Button)event.getSource() == btn2) {
			txtHello.setText("Good Bye");
		} else if ((Button)event.getSource() == btn3) {
			System.out.println("Exit...");
		}
		
	}
}
