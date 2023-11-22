package Estatico_NoSync;
class Sincronizacion {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        
        // Crear una instancia de sumArray
        sumArray sumArray = new sumArray();
        
        MiHilo mh1 = MiHilo.creaEInicia("#1", a, sumArray);
        MiHilo mh2 = MiHilo.creaEInicia("#2", a, sumArray);

        try {
            mh1.hilo.join();
            mh2.hilo.join();
        
        } catch (InterruptedException exc) {
            System.out.println("Hilo principal interrumpido.");
        }
    }
}
