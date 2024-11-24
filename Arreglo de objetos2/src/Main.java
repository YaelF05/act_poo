import School.Section;
import School.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Section lis301 = new Section();

        do{
            System.out.println("\n1) Agregar \n2) Buscar \n3) Borrar \n4) Imprimir por género \n5 Imprimir todos \n6) Cambiar datos \n7) Salir");
            System.out.print("\nIngrese su opción: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el id, nombre, edad y género del estudiante");
                    Student est = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    lis301.addStudent(est);
                    break;
                case 2:
                    System.out.print("Ingrese el id del estudiante: ");
                    lis301.searchStudent(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Ingrese el id del estudiante a borrar: ");
                    lis301.deleteStudent(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Ingrese el genero los estudiantes que desea imprimir: ");
                    lis301.printStudentsByGender(sc.next());
                    break;
                case 5:
                    System.out.println(lis301.toString());
                    break;
                case 6:
                    System.out.print("Ingresa el id del estudiante al que desea cambiar los datos: ");
                    lis301.changeDataStudent(sc.nextInt());
                    break;
                case 7:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (opcion != 7);
    }
}