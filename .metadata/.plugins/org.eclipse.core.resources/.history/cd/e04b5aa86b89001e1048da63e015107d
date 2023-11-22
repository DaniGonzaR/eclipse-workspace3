package Estatico_Sync;

class sumArray {
    private static int sum;

    // sumArray no está sincronizado y ahora es estático
    static synchronized int sumArray(int nums[]) {
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Total acumulado de " +
                    Thread.currentThread().getName() + " es " + sum);
            try {
                Thread.sleep(100); // permitir el cambio de tarea
            } catch (InterruptedException exc) {
                System.out.println("Hilo interrumpido");
            }
        }
        return sum;
    }
}