public class Section {

    protected Student[] arrayStu;
    protected int numStu;

    public Section(int size){
        arrayStu = new Student[size];
    }

    public String addStudent(Student st) {
        if (numStu < arrayStu.length) {
            arrayStu[numStu] = st;
            numStu++;
            return "Estudiante agregado";
        } else {
            return "La sección de de la EE está llena";
        }
    }

    public Student searchMax(){
        Student max = arrayStu[0];
        for (int i = 0; i < numStu; i++){
            if(max.getAge() < arrayStu[i].getAge()){
                max = arrayStu[i];
            }
        }
        return max;
    }

    public Student searchMax(String gender){
        Student max = arrayStu[0];
        for (int i = 1; i < numStu; i++){
            if(max.getAge() < arrayStu[i].getAge() && arrayStu[i].getGender().toLowerCase().equals(gender)){
                max = arrayStu[i];
            }
        }
        return max;
    }

    public int splitSudents(Student[] male, Student[] female){
        int i = 0;
        int j = 0;
        int count = 0;

        while (count < arrayStu.length){
            if(arrayStu[count].getGender().toLowerCase().equals("masculino")){
                male[i] = arrayStu[count];
                i++;
            } else if (arrayStu[count].getGender().toLowerCase().equals("femenino")){
                female[j] = arrayStu[count];
                j++;
            }
            count++;
        }
        return j;
    }

}
