/**
 * Clase Semaforo
 */
public class Semaforo {
    /***************************************************/
    /******************** Atributos ********************/
    /***************************************************/
    String color;
    int duracion;

    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/

    /**
     * Constructor de la clase Semaforo: Inicializa los atributos de mi clase
     * @param color
     * @param duracion
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Semaforo(String color, int duracion){
        this.color = color;
        this.duracion = duracion;
    }

    /**
     * Método que enciende el semáforo en un color específico por un tiempo determinado
     * @return boolean: Indica si el semáforo se encendió
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean encender(){
        System.out.println("El semáforo se enciende en color " + this.color + " por " + this.duracion + " segundos");
        return true;
    }

    /**
     * Método que apaga el semáforo
     * @return boolean: Indica si el semáforo se apagó
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean apagar(){
        System.out.println("El semáforo se apaga");
        return true;
    }
}