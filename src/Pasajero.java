public class Pasajero {
    private String nombre;
    private String idIdentificacion;
    private PaseDeAbordar paseDeAbordar;

    public Pasajero(String nombre, String idIdentificacion, PaseDeAbordar paseDeAbordar) {
        this.nombre = nombre;
        this.idIdentificacion = idIdentificacion;
        this.paseDeAbordar = paseDeAbordar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdIdentificacion() {
        return idIdentificacion;
    }

    public PaseDeAbordar getPaseDeAbordar() {
        return paseDeAbordar;
    }
}
