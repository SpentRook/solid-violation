package ImpresoraEnvios;

import Envio.IEnvio;

/**
 * Clase que permite imprimir en consola el tiempo estimado
 * de uno o varios envios.
 */
public class ImpresoraEnvios {

    /**
     * Imprime en consola el tiempo estimado de entrega del
     * envio dado
     * 
     * @param envio Envio del cual se imprime el su tiempo
     */
    public static void imprimirTiempoDeEnvio(IEnvio envio) {
        System.out.println("Tiempo envio " + envio.getTiempoDeEnvio());
    }

    /**
     * Imprime en consola el tiempo estimado de entrega de
     * los envios dados
     * 
     * @param envios Array de envios del cual se imprime sus tiempos
     */
    public static void imprimirTiempoDeEnvio(IEnvio[] envios) {
        for (IEnvio envio : envios) {
            imprimirTiempoDeEnvio(envio);
        }
    }

}
