package lab_lis_ordinario;

    public abstract class Computer {
    protected String model;
    protected String manufacturer;
    protected String operatingSystem;

    Computer(String model, String manufacturer, String operatingSystem) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }

    public abstract String getComputerType();

    public abstract int calculatePortabilityScore();
}
