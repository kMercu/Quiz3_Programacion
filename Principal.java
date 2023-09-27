/**
 * Primera clase que es ejecutada
 */
public class Principal {

    /**
     * Primer método que se ejecuta en mi aplicación
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public static void main(String[] args) {
        Semaforo miSemaforo = new Semaforo("Rojo", 30);
        miSemaforo.encender();
        miSemaforo.apagar();
    }
}