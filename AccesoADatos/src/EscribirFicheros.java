import java.io.*;

public class EscribirFicheros {

	public static void main(String[] args) {
		FileWriter fichero = null;
		PrintWriter escritor = null;

		try {
			fichero = new FileWriter("C:\\Users\\Dani\\Desktop\\archivo2.txt");
			
			escritor = new PrintWriter(fichero);
			
			escritor.println("Esto es una línea de trabajo");
		
		} catch (IOException ioe){
			ioe.printStackTrace();
		
		} finally {
			
			if(fichero != null);
			
				try {
					fichero.close();
				}catch (IOException ioe) {
					
				}
		}
		
	}

}
