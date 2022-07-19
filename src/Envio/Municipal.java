package Envio;

public class Municipal implements IEnvio {

    private Integer precio;

    /**
     * Constructor de envio tipo Municipal
     * 
     * @param precio el precio del envio
     */
    public Municipal(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String getTipoEnvio() {
        return "Municipal";
    }

    @Override
    public String getTiempoDeEnvio() {
        return "Tiempo envio 12 horas";
    }

    @Override
    public Integer getPrecio() {
        return this.precio;
    }

}
