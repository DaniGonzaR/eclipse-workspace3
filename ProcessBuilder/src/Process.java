import java.io.File;
import java.io.IOException;

public class Process {

	public static void main(String [] args) {
		ProcessBuilder pb = new ProcessBuilder("Java","Suma","14","26");
		pb.directory(new File("C:\\Users\\Dani\\eclipse-workspace2\\Suma-ProcessBuilder\\bin"));
		File f = new File("salida.out");
		
		pb.redirectErrorStream(true);
		pb.redirectOutput(f);
		
		try {
			pb.start();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
