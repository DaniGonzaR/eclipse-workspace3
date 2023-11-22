import java.io.*;
public class Ejemplo5PB {

	public static void main(String[] args) throws IOException {
		var processBuilder = new ProcessBuilder(); // Creo processBuilder para poder usar sus metodos
		
		processBuilder.command("cmd.exe","type") // Ejecuto la cmd y dentro de la cmd el comando type
		.redirectInput(new File("C:\\Users\\Dani","input.txt")) // Aquí elijo el archivo que actuará como Input
		.redirectOutput(new File("C:\\Users\\Dani","output.txt")) // Aquí elijo el archivo que actuará como Output
		.start(); // Aquí empiezo los comandos
	}

}
