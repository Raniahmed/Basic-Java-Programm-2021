package supar_keyword;

public class Vehicle {
    String Color;
    double Weight;

    Vehicle(String  c,double  w){
        Color = c;
        Weight = w;
    }

    void attribute(){

        System.out.println("Color:" + Color);
        System.out.println("Weight:" + Weight);

    }

}
