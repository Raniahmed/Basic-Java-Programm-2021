package basic_class;

public class person {
    //instance variable
    String name = "Rani";
    int age  = 55 ;

    // method
    public static void person(){
        String name = "Raj";
    }
    public static void main(String[] args) {

        person person = new person();


        System.out.println(person.name);
        System.out.println(person.age);

    }
}
