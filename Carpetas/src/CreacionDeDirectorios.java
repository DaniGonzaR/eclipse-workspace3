import java.io.*;

public class CreacionDeDirectorios {
	public static void main(String args[]){
		
		FileWriter fichero = null;
		PrintWriter escritor = null;
		
		FileWriter texto1;
		FileWriter texto2;
		FileWriter texto3;
		FileWriter resumen;
		
		File colegio = new File("C:\\Users\\Dani\\Colegio");
		colegio.mkdir();
		
		File curso1 = new File("C:\\Users\\Dani\\Colegio\\Curso1");
		curso1.mkdir();
		
		File tema1 = new File("C:\\Users\\Dani\\Colegio\\Curso1\\Tema1");
		tema1.mkdir();
		File tema2 = new File("C:\\Users\\Dani\\Colegio\\Curso1\\Tema2");
		tema2.mkdir();
		File tema3 = new File("C:\\Users\\Dani\\Colegio\\Curso1\\Tema3");
		tema3.mkdir();
		
		File curso2 = new File("C:\\Users\\Dani\\Colegio\\Curso2");
		curso2.mkdir();
		
		try {
			
			texto1 = new FileWriter("C:\\Users\\Dani\\Colegio\\Curso1\\Tema3\\texto1.txt");
			texto2 = new FileWriter("C:\\Users\\Dani\\Colegio\\Curso1\\Tema3\\texto2.txt");
			texto3 = new FileWriter("C:\\Users\\Dani\\Colegio\\Curso1\\Tema3\\texto3.txt");
			
			resumen= new FileWriter("C:\\Users\\Dani\\Colegio\\Curso2\\resumen.txt");
			escritor = new PrintWriter(resumen);

			
			texto1.close();
			texto2.close();
			texto3.close();
			
			
			escritor.println(curso1.getName());
			escritor.println("-----");
			String[] curs1 = curso1.list();
			
			for (String fich : curs1) {
				escritor.println(fich);
	        }
			
			escritor.println("");
			escritor.println(tema3.getName());
			escritor.println("-----");
			String[] tem3 = tema3.list();
			
			
			for (String text : tem3) {
				escritor.println(text);
	        }
			
			escritor.println("");
			escritor.println(curso2.getName());
			escritor.println("-----");
			String[] cur2 = curso2.list();
			
			
			for (String curs2 : cur2) {
				escritor.println(curs2);
	        }
			
			resumen.close();
			
			
			
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	
	}
}

