import java.io.*;

public class Ejemplo1PB {

	public static void main(String[] args) throws IOException, InterruptedException {
		var processBuilder = new ProcessBuilder(); // Creo processBuilder para poder usar sus metodos
		processBuilder.command("notepad.exe"); // Command para ejecutar un programa (el bloc de notas)
		var proceso = processBuilder.start(); // Invoca al command
		var ret = proceso.waitFor(); // 
		System.out.printf("Programa cerrado con el codigo:  %d", ret);
	}

}

