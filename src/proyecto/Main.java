package proyecto;

import proyecto.model.CajaAhorro;
import proyecto.model.CuentaCorriente;
import proyecto.model.ProductoBancarioException;
import proyecto.model.TarjetaCredito;

import java.util.logging.Logger;

public class Main {
  public static final Logger log = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    try {
      CajaAhorro ca1 = new CajaAhorro(100, 200);
      TarjetaCredito tc1 = new TarjetaCredito(101, 201, 1234);
      CuentaCorriente cc1 = new CuentaCorriente(-1, 202); // lanza excepción

      log.info(ca1.toString());
      log.info(cc1.toString());
      log.info(tc1.toString());

    } catch (ProductoBancarioException e) {
      System.err.println("Error al crear producto bancario: " + e.getMessage());
    }




  }
}