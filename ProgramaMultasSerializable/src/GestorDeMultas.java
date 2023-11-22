import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDeMultas implements Serializable {

    private static ArrayList<Multa> multas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        cargarMultas(); // Se cargan las multas (multas.dat)

        int decision;

        do {
            mostrarMenu();
            
            System.out.println("");
            System.out.print("Dime lo que quieres hacer: ");
            
            decision = scanner.nextInt();
            scanner.nextLine();

            switch (decision) {
                case 1:
                    crearMulta();
                    break;
                case 2:
                    eliminarMulta();
                    break;
                case 3:
                    modificarMulta();
                    break;
                case 4:
                    pagarMulta();
                    break;
                case 5:
                    consultarTodasLasMultas();
                    break;
                case 6:
                    buscarPorAgente();
                    break;
                case 7:
                    buscarPorNumeroDeMulta();
                    break;
                case 8:
                    buscarPorLocalidad();
                    break;
                case 9:
                    guardarMultas(); // Se guardan las multas en multas.dat y después se sale del programa.
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Numero no valido, inserta un numero del 1 al 9");
            }
        } while (decision != 9); // El switch-case está en funcionamiento hasta que se elige el caso 9 que cierra el programa.
    }

    // Simplemente se muestra un menu con las opciones a elegir.
    private static void mostrarMenu() {
    	
        System.out.println("\n///// Menu de Operaciones /////");
        
        System.out.println("1. Crear Multa");
        System.out.println("2. Eliminar Multa");
        System.out.println("3. Modificar Multa");
        System.out.println("4. Pagar Multa");
        System.out.println("5. Consultar Todas las Multas");
        System.out.println("6. Buscar Multas por Agente");
        System.out.println("7. Buscar Multas por Numero de Multa");
        System.out.println("8. Buscar Multas por Localidad");
        System.out.println("9. Salir");
    }

    // Se crea una multa pidiendo los datos con scanner, luego con esos datos la creamos con su constructor y la añadimos al arrayList de Multas con ".add".
    private static void crearMulta() {
    	
        System.out.print("Dime el numero de la multa: ");
        int numeroMulta = scanner.nextInt();
        
        System.out.print("Dime el numero del agente: ");
        int numeroAgente = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Dime la localidad de la multa: ");
        String localidad = scanner.nextLine();
        
        System.out.print("Dime el coste de la multa: ");
        double coste = scanner.nextDouble();
        
        System.out.print("¿Esta pagada la multa? (true/false): ");
        boolean pagada = scanner.nextBoolean();

        System.out.println("");

        Multa nuevaMulta = new Multa(numeroMulta, numeroAgente, localidad, coste, pagada);
        multas.add(nuevaMulta);

        System.out.println("Multa creada.");
    }

    // Se pide que el numero de multa de la multa que queremos borrar y simplemente se usa ".remove" para quitarla del arrayList.
    private static void eliminarMulta() {
    	
        System.out.print("Dime el numero de multa a eliminar: ");
        int numeroMulta = scanner.nextInt();

        for (Multa multa : multas) {
            if (multa.getNumeroMulta() == numeroMulta) {
                multas.remove(multa);
                System.out.println("Multa eliminada");
                return;
            }
        }
        System.out.println("No hay ninguna multa con ese numero");
    }

    // Se pide que el numero de multa de la multa que queremos modificar, se piden los datos de nuevo y se cambian los valores con los setters de la clase Multa.
    private static void modificarMulta() {
    	
        System.out.print("Dime el numero de multa a modificar: ");
        int numeroMulta = scanner.nextInt();

        for (int i = 0; i < multas.size(); i++) {
            Multa multa = multas.get(i);
            
            if (multa.getNumeroMulta() == numeroMulta) {
            	
                System.out.print("Dime el nuevo numero de agente: ");
                int nuevoNumeroAgente = scanner.nextInt();
                
                scanner.nextLine();
                
                System.out.print("Dime la nueva localidad: ");
                String nuevaLocalidad = scanner.nextLine();
                
                System.out.print("Dime el nuevo coste: ");
                double nuevoCoste = scanner.nextDouble();
                
                System.out.print("¿Esta pagada? (true/false): ");
                boolean nuevaPagada = scanner.nextBoolean();

                multa.setNumeroAgente(nuevoNumeroAgente);
                multa.setLocalidad(nuevaLocalidad);
                multa.setCoste(nuevoCoste);
                multa.setPagada(nuevaPagada);

                System.out.println("Multa modificada");
                return;
            }
        }

        System.out.println("No existen multas con ese numero");
    }

    // Se pide que el numero de multa de la multa que queremos pagar y se cambia el valor de pagada a TRUE.
    private static void pagarMulta() {
    	
        System.out.print("Dime el numero de la multa que vas a pagar: ");
        int numeroMulta = scanner.nextInt();

        for (Multa multa : multas) {
            if (multa.getNumeroMulta() == numeroMulta) {
                multa.setPagada(true);
                System.out.println("Multa pagada.");
                return;
            }
        }

        System.out.println("No existen multas con ese numero.");
    }

    // Si el arrayList esta vacío, suelta el mensaje, sino, lista con un for-each todas las multas que hay actualmente.
    private static void consultarTodasLasMultas() {
    	
        if (multas.isEmpty()) {
            System.out.println("No hay multas actualmente.");
            
        } else {
            System.out.println("\n///// Todas las Multas /////");
            
            for (Multa multa : multas) {
                System.out.println(multa);
            }
        }
    }
    
    // Se pide que el numero de agente de la multa que queremos buscar y se crea un arrayList que contenga las multas de ese agente y se añaden con ".add".
    private static void buscarPorAgente() {
    	
        System.out.print("Dime el numero del agente: ");
        int numeroAgente = scanner.nextInt();

        ArrayList<Multa> multasAgente = new ArrayList<>();

        for (Multa multa : multas) {
            if (multa.getNumeroAgente() == numeroAgente) {
                multasAgente.add(multa);
            }
        }

        if (multasAgente.isEmpty()) {
            System.out.println("Ese agente no tiene ninguna multa asociada actualmente.");
        } else {
            System.out.println("\n ///// Multas del Agente " + numeroAgente + " /////");
            for (Multa multa : multasAgente) {
                System.out.println(multa);
            }
        }
    }

    // Se pide que el numero de multa de la multa que queremos buscar y con un for-each se recorre y se imprime.
    private static void buscarPorNumeroDeMulta() {
    	
        System.out.print("Dime el numero de multa: ");
        int numeroMulta = scanner.nextInt();

        for (Multa multa : multas) {
            if (multa.getNumeroMulta() == numeroMulta) {
                System.out.println("\n Esta multa existe ");
                System.out.println(multa);
                return;
            }
        }

        System.out.println("No hay ninguna multa con ese numero.");
    }

    // Se pide que la localidad de la multa que queremos buscar, se crea un arrayList con todas las multas que el campo localidad sea el mismo y se imprime con un for-each.
    private static void buscarPorLocalidad() {
    	
        scanner.nextLine();
        System.out.print("Dime la localidad: ");
        String localidad = scanner.nextLine();

        ArrayList<Multa> multasLocalidad = new ArrayList<>();

        for (Multa multa : multas) {
        	
            if (multa.getLocalidad().equalsIgnoreCase(localidad)) {
                multasLocalidad.add(multa);
            }
        }

        if (multasLocalidad.isEmpty()) {
            System.out.println("No hay multas en esta localidad.");
            
        } else {
            System.out.println("\n ///// Multas en " + localidad + " /////");
            
            for (Multa multa : multasLocalidad) {
                System.out.println(multa);
            }
        }
    }

    // Aquí serializamos con ObjectOutputStream y lo guardamos en "multas.dat", este método se ejecutará ANTES de salir del programa.
    private static void guardarMultas() {
    	
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("multas.dat"))) {
            oos.writeObject(multas);
            System.out.println("Se han guardado las multas en: multas.dat");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Aquí cargamos la multa para poder seguir trabajando con ella cada vez que abramos el programa.
    private static void cargarMultas() {
    	
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("multas.dat"))) {
            multas = (ArrayList<Multa>) ois.readObject();
            System.out.println("Se han cargado las multas desde: multas.dat");
            
        } catch (IOException | ClassNotFoundException e) {
            multas = new ArrayList<>(); // Si el archivo que cargamos no existe, se crea un arrayList nuevo.
        }
    }
}
