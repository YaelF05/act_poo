package med;

public class Paciente extends Persona {
    private int numPaciente;
    private Historial historialMedico;

    public Paciente(String nombre, int edad, char sexo, int numPaciente) {
        super(nombre, edad, sexo);
        this.numPaciente = numPaciente;
        this.historialMedico = new Historial();
    }

    public void actualizarHistorial(String diagnostico, String tratamiento) {
        historialMedico.agregarDiagnostico(diagnostico, tratamiento);
    }

    public void historialPaciente(){
        historialMedico.consultarHistorial();
    }

    @Override
    public void informacionPersonal() {
        System.out.println("\nID: " + this.numPaciente);
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Sexo: " + this.getSexo());
    }
}
