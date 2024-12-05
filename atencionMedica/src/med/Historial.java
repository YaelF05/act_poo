package med;
import java.util.ArrayList;

public class Historial {
    private ArrayList<String> diagnosticos;
    private ArrayList<String> tratamientos;

    public Historial() {
        diagnosticos = new ArrayList<>();
        tratamientos = new ArrayList<>();
    }

    public void agregarDiagnostico(String diagnostico, String tratamiento) {
        diagnosticos.add(diagnostico);
        tratamientos.add(tratamiento);
        System.out.println("Diagnostico: " + diagnostico);
    }

    public void consultarHistorial() {
        System.out.println("Historial:");
        for (int i = 0; i < diagnosticos.size(); i++) {
            System.out.println("Diagnostico: " + diagnosticos.get(i) + " Tratamiento: " + tratamientos.get(i));
        }
    }
}
