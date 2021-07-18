package conditionalstatement;

/* a>b
   a<b
   a==b

 */

public class Compare {
    public static void relation(int a, int b){

        if (a>b){
            System.out.println(a + "is grater than " + b);

        }else if(a<b){
            System.out.println(a + "is less than " + b);
        } else {
            System.out.println(a +"is equal to " + b);
        }
    }

    public static void main(String[] args) {
        // call method
        relation(100,60);
        relation(66,68);
        relation(25,25);



    }

}
