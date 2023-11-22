import java.lang.*;
import java.lang.Process;
import java.io.*;
public class Ejemplo2PB {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.out.println("Dos procesos empiezan sincronizados");
		
		ProcessBuilder pa = new ProcessBuilder("notepad.exe", "C:\\Users\\Dani\\libro1.txt");
		ProcessBuilder pb = new ProcessBuilder("notepad.exe", "C:\\Users\\Dani\\libro2.txt");
	
		Process p1 = pa.start(); // Empieza el proceso 1
		Process p2 = pb.start(); // Empieza el proceso 2
		
		p1.waitFor();
		p2.waitFor();
		
		System.out.println("Espera hasta que los dos procesos se completen");
		
		
	}

}
