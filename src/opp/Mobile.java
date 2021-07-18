package opp;


public class Mobile {

    //variables
    String name,color;
    int size;

    //method

    void setInformation(String n,String c,int s) {
        name = n;
        color = c;
        size = s;
    }

        void displayInformation () {

            System.out.println("Name " + name);
            System.out.println("Color " + color);
            System.out.println("Size " + size);
            System.out.println("\n\n");

        }
    }



