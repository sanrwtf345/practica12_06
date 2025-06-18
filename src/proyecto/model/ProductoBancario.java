package proyecto.model;

public class ProductoBancario {
  private static int contadorProductos = 1;

  private int banco;
  private int sucursal;
  private int numeroProducto;

  public ProductoBancario(int banco, int sucursal) throws ProductoBancarioException {
    if (banco < 0 || sucursal < 0) {
      throw new ProductoBancarioException("El banco y la sucursal deben ser valores positivos.");
    }
    this.banco = banco;
    this.sucursal = sucursal;
    this.numeroProducto = contadorProductos++;
  }

  //setters
  public static void setContadorProductos(int contadorProductos) {
    ProductoBancario.contadorProductos = contadorProductos;
  }

  public void setBanco(int banco) {
    this.banco = banco;
  }

  public void setSucursal(int sucursal) {
    this.sucursal = sucursal;
  }

  public void setNumeroProducto(int numeroProducto) {
    this.numeroProducto = numeroProducto;
  }

  //getters
  public int getBanco() {
    return banco;
  }

  public int getSucursal() {
    return sucursal;
  }

  public int getNumeroProducto() {
    return numeroProducto;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ProductoBancario that = (ProductoBancario) obj;
    return numeroProducto == that.numeroProducto;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(numeroProducto);
  }

  @Override
  public String toString() {
    return "Banco: " + banco + ", Sucursal: " + sucursal + ", Nº Producto: " + numeroProducto;
  }
}

