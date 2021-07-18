package final_Keyword;

public class University {
    final String UNIVERSITY_NAME = "LU";
    final int fees;//Blank final variable
    //static final int fees; // Blank static final variable

    //
    //static{
    //static fees = 45000;  //
    // }

    University(){
        fees = 45000;
    }


    void display(){
        System.out.println("University Name:" + UNIVERSITY_NAME);
        System.out.println("Course fees:"+ fees);
    }


}
