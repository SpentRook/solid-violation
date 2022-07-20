package Envio;

/**
 * Implementacion de las reglas de IEnvio en
 * el envio de tipo Intermunicipal.
 */
public class EnvioIntermunicipal implements IEnvio {

    private Integer precio;

    /**
     * Constructor de envio tipo Intermunicipal
     * 
     * @param precio el precio del envio
     */
    public EnvioIntermunicipal(Integer precio) {
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
