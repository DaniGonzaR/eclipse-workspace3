import java.io.*;

public class LeerFicheros {

	public static void main(String[] args) {
		
		File fichero = null;
		FileReader leer = null;
		BufferedReader buffer = null;
		
		try {
			buffer = new BufferedReader(new FileReader(new File("C:\\Users\\Dani\\Desktop\\archivo.txt")));
			String linea = null;
			while ((linea = buffer.readLine()) != null)
				System.out.println(linea);
				
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (buffer != null) {
				try {
					buffer.close();
				} catch (IOException ioe) {
					
				}
			}
		}
		
	}

}
