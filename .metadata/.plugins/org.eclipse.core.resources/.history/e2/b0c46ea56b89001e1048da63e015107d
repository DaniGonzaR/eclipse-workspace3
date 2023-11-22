package Dynamic_NoSync;

class sumArray {
    private int sum;

    // sumArray no está sincronizado y no es estático
    int sumArray(int nums[]) {
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
