import med.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Paciente> listaPacientes = new ArrayList<>();
    private static ArrayList<Doctor> listaDoctores = new ArrayList<>();
    private static ArrayList<Cita> listaCitas = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        Doctor doctor1 = new Doctor("Jose P", 34, 'M',"General");
        Doctor doctor2 = new Doctor("Rosa M", 32, 'F',"Neurologia");
        listaDoctores.add(doctor1);
        listaDoctores.add(doctor2);

        do {
            mostrarMenu();
            System.out.print("Ingrese su opcion: ");
            opcion = scan.nextInt();

            switch (opcion){
                case 1:
                    registrarPaciente();
                    break;
                case 2:
                    registrarDoctor();
                    break;
                case 3:
                    programarCita();
                    break;
                case 4:
                    realizarCita();
                    break;
                case 5:
                    cancelarCita();
                    break;
                case 6:
                    reprogramarCita();
                    break;
                case 7:
                    verListaPacientes();
                    break;
                case 8:
                    verListaDoctores();
                    break;
                case 9:
                    verHistorialMedico();
                    break;
                case 10:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opcion no valida, ingresa nuevamente la opcion");
            }

        }while (opcion != 10);

    }

    private static void mostrarMenu() {
        System.out.println("\n1. Registrar Paciente");
        System.out.println("2. Registrar Doctor");
        System.out.println("3. Programar cita");
        System.out.println("4. Realizar cita");
        System.out.println("5. Cancelar cita");
        System.out.println("6. Reprogramar cita");
        System.out.println("7. Ver lista de pacientes");
        System.out.println("8. Ver lista de doctores");
        System.out.println("9. Ver historial medico de paciente");
        System.out.println("10. Salir");
    }

    private static void registrarPaciente() {
        try {
            System.out.print("\nIngrese el nombre del paciente: ");
            String nombre = scan.next();
            System.out.print("Ingrese el sexo del paciente (M o F): ");
            char sexo = scan.next().charAt(0);
            System.out.print("Ingrese el edad del paciente: ");
            int edad = scan.nextInt();
            Paciente paciente = new Paciente(nombre, edad, sexo, listaPacientes.size());
            listaPacientes.add(paciente);
            System.out.println("\nLa informacion del paciente es:");
            paciente.informacionPersonal();
        }catch (Exception e) {
            System.out.println("Hubo un error al registrar el paciente");
            scan.nextLine();
        }

    }

    private static void registrarDoctor() {
        try {
            System.out.print("\nIngrese el nombre del doctor: ");
            String nombre = scan.next();
            System.out.print("Ingrese el sexo del doctor (M o F): ");
            char sexo = scan.next().charAt(0);
            System.out.print("Ingrese el edad del doctor: ");
            int edad = scan.nextInt();
            System.out.print("Ingrese la especialidad del doctor: ");
            String especialidad = scan.next();
            Doctor doctor = new Doctor(nombre, edad, sexo, especialidad);
            listaDoctores.add(doctor);
            System.out.println("El doctor " + doctor.getNombre() + " ha sido registrado");
        }catch (Exception e) {
            System.out.println("Hubo un error al registrar el doctor");
            scan.nextLine();
        }
    }

    private static void programarCita() {
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados");
            return;
        }
        try {
            System.out.print("\nIngresa el numero de paciente: ");
            int numPaciente = scan.nextInt();
            String pers = listaPacientes.get(numPaciente).getNombre();
            System.out.print("Ingresa el numero de doctor: ");
            int numDoctor = scan.nextInt();
            String doc = listaDoctores.get(numDoctor).getNombre();
            System.out.print("Ingresa la fecha de la cita: ");
            String fecha = scan.next();
            System.out.print("Ingresa la hora de la cita: ");
            String hora = scan.next();
            Cita cita = new Cita(fecha, hora, pers, doc, listaCitas.size());
            listaCitas.add(cita);
            cita.getInfoCita();
        }catch (Exception e) {
            System.out.println("Hubo un error al programar la cita");
            scan.nextLine();
        }
    }

    private static void realizarCita() {
        if (listaCitas.isEmpty()) {
            System.out.println("No hay citas registradas");
            return;
        }
        try {
            System.out.print("\nIngresa el numero del doctor: ");
            int numDoc = scan.nextInt();
            System.out.print("Ingresa el numero del paciente: ");
            int numPac = scan.nextInt();
            System.out.print("Ingresa el numero de la cita");
            int numCit = scan.nextInt();
            System.out.print("¿Cual fue el diagnostico?: ");
            String diag = scan.next();
            System.out.print("¿Cual sera el tratamiento?");
            String trat = scan.next();
            System.out.println("Ingresa el cobro de la consulta");
            double cobro = scan.nextDouble();
            listaDoctores.get(numDoc).actualizarDiagnostico(listaPacientes.get(numPac), diag, trat);
            listaCitas.get(numCit).concluirCita();
            listaDoctores.get(numDoc).generarRecibo(cobro);
        }catch (Exception e){
            System.out.println("Ocurrio un error al tratar de realizar la cita");
            scan.nextLine();
        }
    }

    private static void cancelarCita() {
        if (listaCitas.isEmpty()) {
            System.out.println("No hay citas registradas");
            return;
        }
        try {
            System.out.print("\nIngresa el numero de la cita: ");
            int numero = scan.nextInt();
            listaCitas.get(numero).cancelarCita();
        }catch (Exception e){
            System.out.println("Ocurrio un error al tratar de cancelar la cita");
            scan.nextLine();
        }
    }

    private static void reprogramarCita() {
        if (listaCitas.isEmpty()) {
            System.out.println("No hay citas registradas");
            return;
        }
        try {
            System.out.print("\nIngresa el numero de la cita");
            int numero = scan.nextInt();
            System.out.print("Ingresa la nueva fecha: ");
            String fecha = scan.next();
            System.out.print("Ingresa la nueva hora: ");
            String hora = scan.next();
            listaCitas.get(numero).reprogramarCita(hora,fecha);
        }catch (Exception e){
            System.out.println("Ocurrio un error al reprogramar la cita");
            scan.nextLine();
        }
    }

    private static void verListaPacientes() {
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados");
            return;
        }
        listaPacientes.forEach(Paciente::informacionPersonal);
    }

    private static void verListaDoctores() {
        listaDoctores.forEach(Doctor::informacionPersonal);
    }

    private static void verHistorialMedico() {
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados");
            return;
        }
        try {
            System.out.print("\nIngrese el numero de paciente: ");
            int num = scan.nextInt();
            listaPacientes.get(num).historialPaciente();
        }catch (Exception e){
            System.out.println("Ocurrio un error al cargar el historial medico");
            scan.nextLine();
        }
    }
}