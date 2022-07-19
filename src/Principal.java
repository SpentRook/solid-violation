import Envio.IEnvio;
import Envio.Intermunicipal;
import Envio.Internacional;
import Envio.Municipal;
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
        new Municipal(5000),
        new Intermunicipal(15000),
        new Internacional(25000)
    };

    ImpresoraEnvios.imprimirTiempoDeEnvio(envios);
  }
}
