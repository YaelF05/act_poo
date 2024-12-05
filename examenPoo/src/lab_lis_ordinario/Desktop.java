package lab_lis_ordinario;

public class Desktop extends Computer{
    private double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight) {
        super(model, manufacturer, operatingSystem);
        this.caseHeight = caseHeight;
    }

    public double getCaseHeight(){
        return caseHeight;
    }

    public void setCaseHeight(double caseHeight){
        this.caseHeight = caseHeight;
    }

    public String toString(){
        return getModel() + "   " + getManufacturer() + "  " + getOperatingSystem() + "  " + getComputerType() +  "   " + getCaseHeight();
    }

    @Override
    public String getComputerType(){
        return "Computadora  de escritorio";
    }

    @Override
    public int calculatePortabilityScore(){
        return (int) (5 + (caseHeight/20));
    }
}
