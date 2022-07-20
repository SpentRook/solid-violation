package Envio;

/**
 * Implementacion de las reglas de IEnvio en
 * el envio de tipo Internacional.
 */
public class EnvioInternacional implements IEnvio {
    private Integer precio;

    /**
     * Constructor de envio tipo Internacional
     * 
     * @param precio el precio del envio
     */
    public EnvioInternacional(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String getTipoEnvio() {
        return "Internacional";
    }

    @Override
    public String getTiempoDeEnvio() {
        return "Tiempo envio 90 horas";
    }

    @Override
    public Integer getPrecio() {
        return this.precio;
    }
}
