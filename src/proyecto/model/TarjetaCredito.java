package proyecto.model;

public class TarjetaCredito extends ProductoBancario{

  private int claveSeguridad;

  public TarjetaCredito(int banco, int sucursal, int claveSeguridad) {
    super(banco, sucursal);
    this.claveSeguridad = claveSeguridad;
  }

  //setter
  public void setClaveSeguridad(int claveSeguridad) {
    this.claveSeguridad = claveSeguridad;
  }

  //getter
  public int getClaveSeguridad() {
    return claveSeguridad;
  }

  @Override
  public String toString() {
    return super.toString() + ", Clave de Seguridad: " + claveSeguridad;
  }
}
