package Envio;

public class Envio {

  public String tipo;
  Integer precio;

  public Envio(String tipo, Integer precio) {
    this.tipo = tipo;
    this.precio = precio;
  }

  String getTipoEnvio() {
    return this.tipo;
  }

  void crearTipoEnvio(Envio envio) {
    // Save Envio DB
  }
}