package Envio;

/**
 * Interface que define las reglas de
 * cualquier tipo de envio.
 * 
 * @author Richard Guevara
 */
public interface IEnvio {
    /**
     * Metodo para obtener el precio que tiene el envio
     * 
     * @return Integer Retorna el precio del envio
     */
    public Integer getPrecio();

    /**
     * Obtiene el tipo de envio.
     * 
     * @return String Retorna el tipo de envio
     */
    public String getTipoEnvio();

    /**
     * Obtiene el tiempo estimado que tarda
     * en realizarse el envio.
     * 
     * @return - tiempo estimado del envio
     */
    public String getTiempoDeEnvio();
}
