package local_global_instant;


/* Create a system that checks valid username and password
 * And if they both are valid then only system displays homepage
 * User can only try up-to 5 times with invalid login details
 * if it reaches 5 times then system should be locked for 1 min.*/



public class Mobile {

    //static variable
    static String iphone;

    //instant variable
    String username;
    String password;
    String phoneNumber;

    public static void main(String[] args) {mobile_validation("Ferdous","pass123456","01731514017");

    }



    //static method

        public static void mobile_validation (String name, String password, String phoneNumber){

        Mobile mobile = new Mobile();

            mobile.username = name;
            mobile.password = password;
            mobile.phoneNumber = phoneNumber;

        System.out.print("mobile_validation :" +"User name :"  + mobile.username + " Password " + mobile.password +" Phone number "+ mobile.phoneNumber);



        }

    }


