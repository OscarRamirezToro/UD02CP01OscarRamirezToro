// Clase que define la tarea que ejecutará cada hebra
class TareaCaracter implements Runnable {
    private final char caracter;
    private final int repeticiones;

    // Constructor que recibe el carácter a imprimir y el número de veces
    public TareaCaracter(char caracter, int repeticiones) {
        this.caracter = caracter;
        this.repeticiones = repeticiones;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracter);
            // Pequeña pausa opcional para facilitar la alternancia entre hilos en la CPU
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}