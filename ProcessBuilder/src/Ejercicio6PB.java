import java.io.*;
public class Ejercicio6PB {

	public static void main(String[] args) throws IOException {
		var homeDir = System.getProperty("user.home"); // Creo una variable que contenga el home del usuario (C:\\Dani)
		var pb = new ProcessBuilder(); // Creo processBuilder para poder usar sus metodos
		
		pb.command("cmd.exe","/c","dir"); // Ejecuto la cmd y dentro de la cmd hago un dir de C: para mostrar su contenido
		pb.directory(new File(homeDir)); 
		
		var process = pb.start();
		
		var reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		
		String line;
		
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}

}
