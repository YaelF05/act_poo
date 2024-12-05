package lab_lis_ordinario;

public class Laptop extends Computer{
    private int batteryCapacity;
    private double weight;

    public Laptop(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
        super(model, manufacturer, operatingSystem);
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String toString(){
        return getModel() + "   " + getManufacturer() + "  " + getOperatingSystem() + "  " + getComputerType() + "  "+ getBatteryCapacity() + "   " + getWeight();
    }

    @Override
    public String getComputerType(){
        return "Computadora portátil";
    }

    @Override
    public int calculatePortabilityScore(){
        return (int) weight;
    }
}
