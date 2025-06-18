package proyecto;

import proyecto.model.CajaAhorro;
import proyecto.model.CuentaCorriente;
import proyecto.model.TarjetaCredito;

import java.util.logging.Logger;

public class Main {
  public static final Logger log = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {

    CajaAhorro ca1 = new CajaAhorro(100, 200);
    CuentaCorriente cc1 = new CuentaCorriente(100, 201);
    TarjetaCredito tc1 = new TarjetaCredito(101, 202, 1234);

    log.info(ca1.toString());
    log.info(cc1.toString());
    log.info(tc1.toString());

  }
}