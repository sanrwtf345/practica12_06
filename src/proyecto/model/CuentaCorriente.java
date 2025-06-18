package proyecto.model;

public class CuentaCorriente extends ProductoBancario{

  public CuentaCorriente(int banco, int sucursal)throws ProductoBancarioException {
    super(banco, sucursal);
  }
}
