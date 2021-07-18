package arraylist;

import java.util.ArrayList;

public class Car_Arraylist {
    public static void main(String[] args) {
        ArrayList<String>car = new ArrayList<String>();

        car.add("BMW");
        car.add("Toyta");
        car.add("ferario");
        System.out.println(car);
        car.remove(1);
        System.out.println(car);

    }
}
