package method_overriding;

public class Player extends Person_Overriding {
    String profession;

    @Override
    void displayInformation(){
        System.out.println("Name:" + name);
        System.out.println("Age:"+ age);
        System.out.println("Profession:" + profession);


    }
}
