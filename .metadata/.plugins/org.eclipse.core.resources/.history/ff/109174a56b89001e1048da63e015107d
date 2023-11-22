package Dynamic_NoSync;

class MiHilo implements Runnable {
    Thread hilo;
    // sumArray ya no es estático en la clase MiHilo
    sumArray sumArray;
    int a[];
    int resp;

    // Constructor modificado para recibir la instancia de sumArray
    MiHilo(String nombre, int nums[], sumArray sa) {
        hilo = new Thread(this, nombre);
        a = nums;
        sumArray = sa;
    }

    // Método que crea e inicia un hilo
    public static MiHilo creaEInicia(String nombre, int nums[], sumArray sa) {
        MiHilo miHilo = new MiHilo(nombre, nums, sa);

        miHilo.hilo.start(); // Inicia el hilo
        return miHilo;
    }

    // Punto de entrada del hilo
    public void run() {
        int sum;
        System.out.println(hilo.getName() + " iniciando.");

        // Llama al método estático no sincronizado en lugar del método sincronizado
        resp = sumArray.sumArray(a);

        System.out.println("Suma para " + hilo.getName() + " es " + resp);
        System.out.println(hilo.getName() + " terminado.");
    }
}
