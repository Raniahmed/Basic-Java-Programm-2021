package local_global_instant;

public class ConstructorExample {
    String name;
    int age;
    String email;
    String mobNumber;
    double salary;
    boolean yes;

    ConstructorExample (String full_name, int age, String email, String mobNumber){
    this.name = full_name;
    this.age = age;
    this.email= email;
    this.mobNumber = mobNumber;
    }


    public static void main(String[] args) {

        ConstructorExample obj = new ConstructorExample("Shahadat", 33, "shahadathossain.8080@gmail.com", "01707076966");

        System.out.println(obj.name + " " + obj.age +  " " + obj.salary + " " + obj.yes);
        System.out.println(obj.email + " \n " + obj.mobNumber);

    }



}
