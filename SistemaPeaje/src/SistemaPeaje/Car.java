package SistemaPeaje;

public class Car extends Vehicle{

    private static int valorPeaje = 10000;

    public Car(String placa) {
        super(placa);
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    static void setValorPeaje(int valorPeaje) {
        Car.valorPeaje = valorPeaje;
    }

    public void imprimir() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Peaje: " + getValorPeaje());
    }
}
