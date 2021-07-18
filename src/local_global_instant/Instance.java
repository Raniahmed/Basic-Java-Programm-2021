package local_global_instant;

public class Instance {


    public static String ANOTHERE_NAME;
    public String name;
    public double salary;


    // The name variable is assigned in the constructor
    public Instance (String empName){
        name = empName;
    }

    // This is another Constructor using two variables
    public Instance (String anOther, String nameString){
        ANOTHERE_NAME = anOther;
        name = nameString;
    }

    public void printAnother(){
        System.out.println("First Name: " + ANOTHERE_NAME);
        System.out.println("Last Name  " + name);
    }

    //The Salary variable is assigned a value.
    public void addSalary (double empSal){
        salary = empSal;
    }

    // THis method prints the Instance Variable details.
    public  void printEmp(){
        System.out.println("Name :" + name);
        System.out.println("Salary : "  + salary);
    }

    public static void main (String [] args){

        Instance obj = new Instance("Shahadat", "Hossain");
        Instance obj2 = new Instance("Abdullah Al Mamun");
        obj2.addSalary(15000);
        obj2.printEmp();
        obj.printAnother();
    }



}
