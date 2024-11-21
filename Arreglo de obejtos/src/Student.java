public class Student {

    protected String name;
    protected int id;
    protected int age;
    protected String gender;

    public Student(String name, int id, int age,String gender  ){
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String display(){
        return "Los atributos de la clase son: \nname \nid \nage \ngender";
    }

    public String toString(){
        return name;
    }
}
