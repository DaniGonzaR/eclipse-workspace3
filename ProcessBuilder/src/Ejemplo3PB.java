import java.io.*;
public class Ejemplo3PB {

	public static void main(String[] args) throws IOException {
		var processBuilder = new ProcessBuilder(); // Creo processBuilder para poder usar sus metodos
		processBuilder.command("cmd.exe", "/c", "ping -n 3","google.com");
		var process = processBuilder.start(); // Ejecuto el comando de la linea anterior
		var reader = new BufferedReader(new InputStreamReader(process.getInputStream())); // BufferedReader me permite leer texto de un InputStream
		String line;
		
		while ((line = reader.readLine()) != null) { // Nos imprime todo el contenido que sea diferente a null
			System.out.println(line);
		}
		
	}

}
