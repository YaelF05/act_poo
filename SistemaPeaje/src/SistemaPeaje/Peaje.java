package SistemaPeaje;

import java.util.ArrayList;

public class Peaje {
    private String nombre;
    private String departamento;
    private ArrayList<Vehicle> vehiculos;
    private int totalPeaje = 0;
    private static int totalCar = 0;
    private static int totalMotorcycle = 0;
    private static int totalTruk = 0;

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void añadirVehiculo(Vehicle vehiculo) {
        vehiculos.add(vehiculo);
    }

    public int calcularTotalPeaje(Vehicle vehiculo) {
        if (vehiculo instanceof Car) {
            totalCar++;
            totalPeaje += ((Car) vehiculo).getValorPeaje();
            return ((Car) vehiculo).getValorPeaje();
        } else if (vehiculo instanceof Motorcycle) {
            totalMotorcycle++;
            totalPeaje += ((Motorcycle) vehiculo).getValorPeaje();
            return (((Motorcycle) vehiculo).getValorPeaje());
        }else if (vehiculo instanceof Truk) {
            totalTruk++;
            totalPeaje += ((Truk) vehiculo).getValorPeaje();
            return (((Truk) vehiculo).getValorPeaje());
        }else return  0;
    }

    public void imprimir(){

    }
}
