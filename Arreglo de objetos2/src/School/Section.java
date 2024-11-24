package School;

import java.util.ArrayList;
import java.util.Scanner;

public class Section {
    private String NRC;
    private ArrayList<Student> arrayStu;

    public Section() {
        this.NRC = "21761";
        arrayStu = new ArrayList<>();
    }

    public void addStudent(Student s) {
        arrayStu.add(s);
        System.out.println("Estudiante agregado");
    }

    public void searchStudent(int id) {
        for (Student s : arrayStu) {
            if (s.getId() == id) {
                System.out.println(s.toString());
            }
        }
    }

    public void deleteStudent(int id) {
        for (Student s : arrayStu) {
            if (s.getId() == id) {
                arrayStu.remove(s);
            }
        }
    }

    public void changeDataStudent(int id) {
        Scanner sc = new Scanner(System.in);
        for (Student s : arrayStu) {
            if (s.getId() == id) {
                System.out.print("Ingresa el nuevo id: ");
                s.setId(sc.nextInt());
                System.out.print("Ingresa el nuevo nombre: ");
                s.setName(sc.next());
                System.out.print("Ingresa la nueva edad: ");
                s.setAge(sc.nextInt());
                System.out.print("Ingresa el genero: ");
                s.setGender(sc.next());
            }
        }
    }

    public void printStudentsByGender(String gender) {
        for (Student s : arrayStu) {
            if (s.getGender().equalsIgnoreCase(gender)) {
                System.out.println(s.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Section \n[NRC=" + NRC + ", \narrayStu=" + arrayStu + "]";
    }

}
