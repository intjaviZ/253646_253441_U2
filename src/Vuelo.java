public class Vuelo {
    private String numeroVuelo;
    private String destino;

    public Vuelo(String numeroVuelo, String destino) {
        this.numeroVuelo = numeroVuelo;
        this.destino = destino;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getDestino() {
        return destino;
    }
}
