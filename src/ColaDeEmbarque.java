import java.util.LinkedList;
import java.util.Queue;

public class ColaDeEmbarque {
    private Queue<Pasajero> pasajeros;

    public ColaDeEmbarque() {
        this.pasajeros = new LinkedList<>();
    }

    public void encolar(Pasajero p) {
        pasajeros.offer(p);
    }

    public Pasajero desencolar() {
        return pasajeros.poll();
    }

    public Pasajero frente() {
        return pasajeros.peek();
    }

    public boolean estaVacia() {
        return pasajeros.isEmpty();
    }
}
