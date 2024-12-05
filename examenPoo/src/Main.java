import java.util.ArrayList;
import lab_lis_ordinario.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();

        Desktop computer1 = new Desktop("2020", "IBM", "Linux", 9.2);
        Laptop computer2 = new Laptop("2024", "HP", "Win", 3900, 6.6);
        Notebook computer3 = new Notebook("2022", "Apple", "MacOs", 3000, 5.7);

        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);

        System.out.println("No.   Modelo    Marca      SO      Tipo");
        for (int i = 0; i < computers.size(); i++){
            System.out.println((i + 1) + "     " + computers.get(i).getModel() + "     " + computers.get(i).getManufacturer() + "      " + computers.get(i).getOperatingSystem() + "        " + computers.get(i).getComputerType());
        }
    }
}