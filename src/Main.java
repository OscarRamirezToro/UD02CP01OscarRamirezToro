public class Main {
    public static void main(String[] args) {
        int cantidad = 50; // Número de repeticiones para cada hebra

        // Creación de las 3 tareas con caracteres distintos
        TareaCaracter tarea1 = new TareaCaracter('A', cantidad);
        TareaCaracter tarea2 = new TareaCaracter('B', cantidad);
        TareaCaracter tarea3 = new TareaCaracter('C', cantidad);

        // Creación de las 3 hebras asociadas a sus tareas
        Thread hebra1 = new Thread(tarea1);
        Thread hebra2 = new Thread(tarea2);
        Thread hebra3 = new Thread(tarea3);

        // Inicio de la ejecución de las hebras
        hebra1.start();
        hebra2.start();
        hebra3.start();
    }
}