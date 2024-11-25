package SistemaPeaje;

public class Truk extends Vehicle{

    private static int valorPeaje = 5000;
    private int eje;

    public Truk(String placa, int eje) {
        super(placa);
        this.eje = eje;
    }

    public int getValorPeaje() {
        return valorPeaje * eje;
    }

    static void setValorPeaje(int valorPeaje) {
        Truk.valorPeaje = valorPeaje;
    }

    public void imprimir() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Peaje: " + getValorPeaje() * eje);
        System.out.println("Eje: " + this.eje);
    }

}
