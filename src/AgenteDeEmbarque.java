public class AgenteDeEmbarque {
    private String nombre;
    private ColaDeEmbarque cola;

    public AgenteDeEmbarque(String nombre, ColaDeEmbarque cola) {
        this.nombre = nombre;
        this.cola = cola;
    }

    public void llamarSiguiente() {
        System.out.println("Atencion: Agente " + nombre + " solicita al siguiente pasajero.");
    }

    public boolean validarDocumentos(Pasajero p) {
        // Valida que el pasajero tenga pase y una identificacion valida
        return p.getPaseDeAbordar() != null && !p.getIdIdentificacion().isBlank();
    }

    public void procesarEmbarque() {
        if (!cola.estaVacia()) {
            llamarSiguiente();
            Pasajero p = cola.frente();

            if (validarDocumentos(p)) {
                cola.desencolar();
                System.out.println("Documentos verificados. El pasajero " + p.getNombre() + " ha abordado el avion.");
            } else {
                cola.desencolar();
                System.out.println("Documentos invalidos. El pasajero " + p.getNombre() + " no puede abordar.");
            }
        } else {
            System.out.println("La fila se encuentra vacia.");
        }
    }
}
