package Dynamic_Sync;

class sumArray {
    private int sum;

    // sumArray está sincronizado pero no es estático
    synchronized int sumArray(int nums[]) {
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Total acumulado de " +
                    Thread.currentThread().getName() + " es " + sum);
            try {
                Thread.sleep(10); // permitir el cambio de tarea
            } catch (InterruptedException exc) {
                System.out.println("Hilo interrumpido");
            }
        }
        return sum;
    }
}
