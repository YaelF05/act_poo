package SistemaPeaje;

public class Motorcycle extends Vehicle {

    private static int valorPeaje = 5000;

    public Motorcycle(String placa) {
        super(placa);
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    static void setValorPeaje(int valorPeaje) {
        Motorcycle.valorPeaje = valorPeaje;
    }

    public void imprimir() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Peaje: " + getValorPeaje());
    }
}
