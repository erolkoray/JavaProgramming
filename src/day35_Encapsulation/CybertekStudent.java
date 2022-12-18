package day35_Encapsulation;

public class CybertekStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String school;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CybertekStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy, String secretCode) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        school = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println(school);
    }

    public static void printSecretCode(){
        System.out.println(secretCode);
    }
    public void attendClass(){
        System.out.println(name+" is attending class");
    }
    public void setFieldOfStudy(){
        System.out.println(name+" is studying "+fieldOfStudy);
    }

    @Override
    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school=" + school + '\'' +
                ", programmingLanguage=" + programmingLanguage +'\'' +
                ", secretCode=" + secretCode + '\'' +
                '}';
    }
}
/*
2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()


 */
