import java.util.Scanner;

public class Menu {
    private ColaDeEmbarque cola;
    private AgenteDeEmbarque agente;
    private Scanner scanner;

    public Menu() {
        this.cola = new ColaDeEmbarque();
        this.agente = new AgenteDeEmbarque("Carlos", cola);
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n--- Sistema de Embarque ---");
            System.out.println("1. Formarse en la fila");
            System.out.println("2. Procesar Embarque");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                registrarPasajero();
            } else if (opcion == 2) {
                agente.procesarEmbarque();
            }
        }

        scanner.close();
        System.out.println("Sistema finalizado.");
    }

    private void registrarPasajero() {
        System.out.print("Nombre del pasajero: ");
        String nombre = scanner.nextLine();

        System.out.print("ID de Identificacion: ");
        String id = scanner.nextLine();

        System.out.print("Numero de vuelo: ");
        String numVuelo = scanner.nextLine();

        System.out.print("Destino: ");
        String destino = scanner.nextLine();

        System.out.print("Grupo de embarque: ");
        int grupo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Asiento: ");
        String asiento = scanner.nextLine();

        Vuelo vuelo = new Vuelo(numVuelo, destino);
        PaseDeAbordar pase = new PaseDeAbordar(numVuelo, grupo, asiento, vuelo);
        Pasajero pasajero = new Pasajero(nombre, id, pase);

        cola.encolar(pasajero);
        System.out.println("Registro exitoso. Pasajero formado en la fila.");
    }
}
