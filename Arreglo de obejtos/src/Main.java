public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("pepe", 1, 20, "MasCulino");
        Student s2 = new Student("rosa", 2, 45, "Femenino");
        Student s3 = new Student("ricardo", 3, 60, "mAsculino");
        Student s4 = new Student("luisa", 4, 56, "Femenino");
        Student s5 = new Student("pedro", 4, 5, "masculino");

        Section se1 = new Section(4);
        System.out.println(se1.addStudent(s1));
        System.out.println(se1.addStudent(s2));
        System.out.println(se1.addStudent(s3));
        System.out.println(se1.addStudent(s4));
        System.out.println(se1.addStudent(s5));

        System.out.println(s1.getName());
        System.out.println(s2.getId());

        Student[] masc = new Student[3];
        Student[] fem = new Student[3];

        System.out.println("Alumna de mayor edad: "+se1.searchMax("femenino"));
        System.out.println("Alumno de mayor edad en general: "+ se1.searchMax());
        System.out.println("Cantidad de alumnas: "+se1.splitSudents(masc, fem));

    }
}