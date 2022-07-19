package Envio;

public class Internacional implements IEnvio {
    private Integer precio;

    /**
     * Constructor de envio tipo Internacional
     * 
     * @param precio el precio del envio
     */
    public Internacional(Integer precio) {
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
