package GUI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonStore {
	
	public static void CrearJson(String Nombre){
		File CarpetaPrueba = new File(Nombre);
		CarpetaPrueba.mkdirs();
		//SE CREA UNA CARPETA EN ESTE CASO ES UN JSON STORE, PERO PRIMERO DEBEMOS CREAR EL OTRO QUE CONTENGA TODAS
			
	}
	
	public static void EliminarJson(){
		//sjdaoi
	}

	
	public static void Escribir(String a) throws IOException {
		File text = new File("C:\\Users\\Extreme PC\\Desktop\\GitHubEclipse\\TareaProgramada1\\CarpetaPrueba\\Texto.txt");
		
		FileWriter escribir = new FileWriter(text, true);
		escribir.write(a);
		escribir.close();
	}
}
