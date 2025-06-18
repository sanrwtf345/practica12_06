package proyecto.model;

public class TarjetaCredito extends ProductoBancario{

  private int claveSeguridad;

  public TarjetaCredito(int banco, int sucursal, int claveSeguridad) throws ProductoBancarioException {
    super(banco, sucursal);
    if (claveSeguridad < 100 || claveSeguridad > 9999) {
      throw new ProductoBancarioException("La clave de seguridad debe ser un número de 3 a 4 cifras.");
    }
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
