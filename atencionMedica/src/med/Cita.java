package med;

public class Cita {
    private int idCita;
    private String fechaCita;
    private String horaCita;
    private String estadoCita;
    private String personaCita;
    private String doctorCita;


    public Cita(String fechaCita, String horaCita, String personaCita, String doctorCita, int idCita) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.personaCita = personaCita;
        this.doctorCita = doctorCita;
        this.estadoCita = "Confirmada";
    }

    public String getHoraCita() {
        return horaCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void cancelarCita() {
        System.out.println("Cita cancelada");
        this.estadoCita = "Cancelada";
    }

    public void concluirCita() {
        System.out.println("Cita concluada");
        this.estadoCita = "Concluida";
    }

    public void reprogramarCita(String horaCita, String fechaCita) {
        this.horaCita = horaCita;
        this.fechaCita = fechaCita;
        System.out.println("Cita reprogramada");
    }

    public void getInfoCita() {
        System.out.println("\nLa informacion de la cita es la siguiente:");
        System.out.println("El id de la cita es: " + this.idCita);
        System.out.println("Fecha de la cita: " + getFechaCita());
        System.out.println("Hora de la cita: " + getHoraCita());
        System.out.println("Estado de la cita: " + getEstadoCita());
        System.out.println("Paciente de la cita: " + personaCita);
        System.out.println("Doctor de la cita: " + doctorCita);
    }
}
