package Repositorios;

import Envio.IEnvio;

/**
 * Interface que define las reglas de
 * cualquier tipo repositorio de envio.
 */
public interface IEnvioRepository {
    /**
     * Guarda en la base de datos el envio dado
     * 
     * @param envio Envio a guardar en la base de datos
     */
    void crearTipoEnvio(IEnvio envio);
}
