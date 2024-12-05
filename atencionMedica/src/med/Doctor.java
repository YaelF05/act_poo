package med;

public class Doctor extends Persona{
    private String especialidad;

    public Doctor(String nombre, int edad, char sexo, String especialidad) {
        super(nombre, edad, sexo);
        this.especialidad = especialidad;
    }

    public void actualizarDiagnostico(Paciente paciente, String diagnostico, String tratamiento) {
        paciente.actualizarHistorial(diagnostico, tratamiento);
    }

    public void generarRecibo(double valor) {
        System.out.println("\nEl cobro de la cita es: " + valor + " sin contar impuestos");
        System.out.println("El paciente debe: " + (valor + (valor * 0.16)));
        System.out.println("Ya con impuestos");
    }

    @Override
    public void informacionPersonal() {
        System.out.println("\nNombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Especialidad: " + especialidad);
    }
}
