import java.io.*;
public class Primera {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Dani\\Desktop\\fichero1.txt");
			fw.write("Esto es una prueb");
			fw.write(97);
			fw.close();
			
			FileReader fr = new FileReader("C:\\Users\\Dani\\Desktop\\fichero1.txt");
			int valor = fr.read();
			
			while(valor!=-1) {
				System.out.print((char)valor);
				valor = fr.read();
			}
			fr.close();
			
		}catch(IOException e) {
			System.out.print("ERROR E/S" + e);
		}
		
		

	}
}
