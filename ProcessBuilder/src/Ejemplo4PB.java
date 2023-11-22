import java.io.*;
public class Ejemplo4PB {

	public static void main(String[] args) throws IOException {
		var homeDir = System.getProperty("user.home"); // Creo una variable que contenga el home del usuario (C:\\Dani)
		var processBuilder = new ProcessBuilder(); // Creo processBuilder para poder usar sus metodos
		processBuilder.command("cmd.exe","/c","date /t"); // Ejecuto el comando para que me de la fecha en el cmd
		var fileName = new File(String.format("%s\\Documents\\output.txt",homeDir)); //
	
		processBuilder.redirectOutput(fileName);
		var process = processBuilder.start();
		
		var reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		
		while ((line = reader.readLine()) != null) { // Nos imprime todo el contenido que sea diferente a null
			System.out.println(line);
		}
	}
	

}
