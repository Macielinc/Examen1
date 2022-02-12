package uia.com.apimvcrest.modelo;

public class ItemUpdateModelo extends ItemComprasUIAModelo {

    private double existenciaInicial = 0.0;
    private double existenciaMinima = 0.0;
    private double consumoMensual = 0.0;
    private int pedidoProveedor= -1;



    public ItemUpdateModelo(int existenciaInicial, int existenciaMinima, int consumoMensual, int pedidoProveedor)
    {
        this.existenciaInicial = existenciaInicial;
        this.existenciaMinima = existenciaMinima;
        this.consumoMensual = consumoMensual;

    }
    public ItemUpdateModelo(int existenciaInicial, int existenciaMinima, int consumoMensual, int pedidoProveedor,
                            String name, int clasificacion, int id, String codigo)
    {
        super(id, name, "", -1, clasificacion, -1,  -1,"", codigo);
        this.existenciaInicial = existenciaInicial;
        this.existenciaMinima = existenciaMinima;
        this.consumoMensual = consumoMensual;

    }

    public double getExistenciaInicial() {
        return existenciaInicial;
    }

    public void setExistenciaInicial(double existenciaInicial) {
        this.existenciaInicial = existenciaInicial;
    }

    public double getExistenciaMinima() {
        return existenciaMinima;
    }

    public void setExistenciaMinima(double existenciaMinima) {
        this.existenciaMinima = existenciaMinima;
    }

    public double getConsumoMensual() {
        return consumoMensual;
    }


    public void setConsumoMensual(double consumoMensual) {
        this.consumoMensual = consumoMensual;
    }
    public void print() {
        System.out.println(
                " \n\t\texistencia inicial:\t" + this.existenciaInicial
                        + " \n\t\texistencia minima:\t" + this.existenciaMinima
                        + " \n\t\tconsumo mensual:\t" + this.consumoMensual
                        + " \n\t\tpedido proveedor:\t" + this.pedidoProveedor);

    }
}
