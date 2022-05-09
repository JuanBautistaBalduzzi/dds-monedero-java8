package dds.monedero.model;

public enum TipoMovimiento {
  Deposito {
    @Override
    public double getMontoConSigno(double monto) {
      return monto;
    }
  },
  Extraccion {
    @Override
    public double getMontoConSigno(double monto) {
      return -monto;
    }
  };

  public abstract double getMontoConSigno(double monto);

}
