package local_global_instant;

/*      1. Create a class name Rectangle
        2. Create two instance variables height and width
        3. Create a method that returns height
        4. Create a method that returns width
        5. Calculate area and return the value
        6. Calculate perimeter and return value
        7. Create another method RectangleMain
        8. Create an object of Rectangle class
        9. Set values for height and width of the object
        10.Call all the method */

public class Rectangle {

    // instance variable
    double height;    // non-static variable
    double width;

    // constructor
    Rectangle(double height1,double width1){
     //this.height = height1;
     //this.width = width1;

     double local_height = height1;
     double local_width = width1;
     System.out.println(local_height + local_width);

 }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,5);

        System.out.println("Area : " + rectangle.height * rectangle.width);
       // System.out.println(rectangle.);

    }


}
