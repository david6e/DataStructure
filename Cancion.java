import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Cancion {
    String nombre;
    
    public Cancion(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
class GestorReproduccion {
    private Stack<Cancion> pila = new Stack<>();
    private Stack<Cancion> pilaRepetidas = new Stack<>();
    

    private Queue<Cancion> cola = new LinkedList<>();
    private Queue<Cancion> colaRepetidas = new LinkedList<>();

    
    public void agregar_cancion(Cancion cancion) {
        pila.push(cancion);
        System.out.println("Canción agregada a la lista de reproducción (Pila): " + cancion);
    }

    public void repetir_lastcancion() {
        if (!pila.isEmpty()) {
            Cancion ultima_cancion = pila.pop(); 
            pilaRepetidas.push(ultima_cancion); 
            System.out.println("Reproduciendo (Pila): " + ultima_cancion + " (repetida)");
        } else {
            System.out.println("No hay canciones en la lista de reproducción (Pila) para repetir.");
        }
    }

    public void reproducir_siguiente() {
        if (!pilaRepetidas.isEmpty()) {
            Cancion cancion_repetida = pilaRepetidas.pop(); 
            System.out.println("Reproduciendo (Pila): " + cancion_repetida);
        } else if (!pila.isEmpty()) {
            Cancion cancion = pila.pop(); 
            System.out.println("Reproduciendo (Pila): " + cancion);
        } else {
            System.out.println("No hay canciones para reproducir (Pila).");
        }
    }

    
    public void agregar_cancion2(Cancion cancion) {
        cola.add(cancion);
        System.out.println("Canción agregada a la lista de reproducción (Cola): " + cancion);
    }

    public void repetir_lastcancion2() {
        if (!cola.isEmpty()) {
            Cancion ultima_cancion = cola.poll(); 
            colaRepetidas.add(ultima_cancion); 
            System.out.println("Reproduciendo (Cola): " + ultima_cancion + " (repetida)");
        } else {
            System.out.println("No hay canciones en la lista de reproducción (Cola) para repetir.");
        }
    }

    public void reproducir_siguiente2() {
        if (!colaRepetidas.isEmpty()) {
            Cancion cancion_repetida = colaRepetidas.poll(); 
            System.out.println("Reproduciendo (Cola): " + cancion_repetida);
        } else if (!cola.isEmpty()) {
            Cancion cancion = cola.poll(); 
            System.out.println("Reproduciendo (Cola): " + cancion);
        } else {
            System.out.println("No hay canciones para reproducir (Cola).");
        }
    }
}

class Main {
    public static void main(String[] args) {
        GestorReproduccion gestor = new GestorReproduccion();
        
        
        gestor.agregar_cancion(new Cancion("Canción A"));
        gestor.agregar_cancion(new Cancion("Canción B"));
        gestor.agregar_cancion(new Cancion("Canción C"));

        System.out.println(" ");

        gestor.reproducir_siguiente(); 
        gestor.reproducir_siguiente(); 

        
        gestor.repetir_lastcancion(); 
        
        
        gestor.reproducir_siguiente();
        gestor.reproducir_siguiente(); 

        System.out.println("------------------------------------------------------------- ");

        gestor.agregar_cancion2(new Cancion("Canción D"));
        gestor.agregar_cancion2(new Cancion("Canción E"));
        gestor.agregar_cancion2(new Cancion("Canción F"));

        System.out.println(" ");

        gestor.reproducir_siguiente2(); 
        gestor.reproducir_siguiente2();

        
        gestor.repetir_lastcancion2(); 
        

        gestor.reproducir_siguiente2(); 
        gestor.reproducir_siguiente2(); 
    }
}