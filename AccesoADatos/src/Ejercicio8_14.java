import java.io.*;
public class Ejercicio8_14 {

	public static void main(String[] args) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("C:\\Users\\Dani\\Documents\\fichero_bin.dat");
			String texto = "Prueba para ficheros binarios";
			byte codigos[] = texto.getBytes(); // Copiamos ese texto en un array de bytes
			
			fos.write(codigos);
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
