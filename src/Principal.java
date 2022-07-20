import Envio.IEnvio;
import Envio.EnvioIntermunicipal;
import Envio.EnvioInternacional;
import Envio.EnvioMunicipal;
import ImpresoraEnvios.ImpresoraEnvios;

/**
 * Clase principal que hace uso de envios y de ImpresoraEnvios
 * 
 * @author Richard Guevara
 */
public class Principal {

  /**
   * Clase main para ejecutar el programa
   * 
   * @param args No usados
   */
  public static void main(String[] args) {
    IEnvio[] envios = {
        new EnvioMunicipal(5000),
        new EnvioIntermunicipal(15000),
        new EnvioInternacional(25000)
    };

    ImpresoraEnvios.imprimirTiempoDeEnvio(envios);
  }
}
