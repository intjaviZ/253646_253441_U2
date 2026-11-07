public class PaseDeAbordar {
    private String numeroVuelo;
    private int grupoEmbarque;
    private String asiento;
    private Vuelo vuelo;

    public PaseDeAbordar(String numeroVuelo, int grupoEmbarque, String asiento, Vuelo vuelo) {
        this.numeroVuelo = numeroVuelo;
        this.grupoEmbarque = grupoEmbarque;
        this.asiento = asiento;
        this.vuelo = vuelo;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public int getGrupoEmbarque() {
        return grupoEmbarque;
    }
}
