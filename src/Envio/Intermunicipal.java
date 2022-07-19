package Envio;

public class Intermunicipal implements IEnvio {

    private Integer precio;

    /**
     * Constructor de envio tipo Intermunicipal
     * 
     * @param precio el precio del envio
     */
    public Intermunicipal(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String getTipoEnvio() {
        return "Intermunicipal";
    }

    @Override
    public String getTiempoDeEnvio() {
        return "Tiempo envio 36 horas";
    }

    @Override
    public Integer getPrecio() {
        return this.precio;
    }
}
