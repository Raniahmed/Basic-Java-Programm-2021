package local_global_instant;

public class Manager {

    static String class_name;
    String studentName;
    int studentRoll;
    String studentFName;

    public static void main(String[] args) {
        studentRegistration("Amatullah Jaria" , 1250, "Shahadat Hossain");
    }

    //this is static method or block
    public static  void studentRegistration(String sname, int roll, String sfname){
        Manager obj_manager = new Manager();

        obj_manager.studentName = sname;
        obj_manager.studentRegSuccess(" Shahadat", 12, " Mahamudul Haque");
        obj_manager.studentRoll=111;
        System.out.println("This value comes from studentRegistration method__ that's means it's a static method or bolcks ::: "
                + obj_manager.studentFName  + " "
                + obj_manager.studentName + " "
                + obj_manager.studentRoll);
        System.out.println();
    }

    //this is non-static method
    public void studentRegSuccess(String sname, int roll, String sfname){
        studentFName = sfname;
        studentName = sname;
        studentRoll = roll;
        System.out.println("This value comes from studentRegSuccess method ::: " + studentName +  " " + studentFName  + " " + studentRoll);
        System.out.println();
    }

}
