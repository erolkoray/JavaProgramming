package day30_CustomClass;
                                //SHORTCUT TO SETINFO METHOD, right click, Generate, Constructor -> select all, then update the method name to 'public void setInfo'
public class Student {

    public String name;         // THESE ARE INSTANCE VARIABLES - Because they are in the class, not in a particular method
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public void setInfo(String name, char gender, int age, int ID, char grade) {  // THESE ARE LOCAL VARIABLE - They are inside a particular method.
        this.name = name;
        this.gender = gender;
        this.age = age;                         // WE ARE ASSIGNING LOCAL VARIABLES TO INSTANCE VARIABLES ('this.' keyword does this)
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }


    public void code(){
        System.out.println(name+" is coding.");
    }

    public void sleep(){
        System.out.println(name+" is sleeping.");
    }

    public void study(){
        System.out.println(name+" is studying.");
    }






}
