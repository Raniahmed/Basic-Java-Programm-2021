package basic_class;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student();
        //s1= declare object

        s1.name = "Ferdous";
        s1.gender = "female";
        s1.age = 15;

        Student s2 = new Student();

        s2.name = "Sami";
        s2.gender = "male";
        s2.age = 16;

        Student s3 = new Student();

        s3.name = "Raj";
        s3.gender = "male";
        s3.age = 14;

        System.out.println("Name :" +s1.name);
        System.out.println("Gender :" +s1.gender);
        System.out.println("Age :" +s1.age);
        s1.displayInformation();
        s2.displayInformation();
        s3.displayInformation();

    }
}
