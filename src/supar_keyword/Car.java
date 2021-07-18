package supar_keyword;

public class Car extends Vehicle {
    int Gear;

    Car(String c,double w,int G){
        super(c,w);
        Gear = G;
    }
    @Override
    void attribute(){
        System.out.println("Color:" + Color);
        System.out.println("Weight:" + Weight);
        System.out.println("Gear:" +Gear);



    }

}
