package encapsulation;

public class EncapTest {
    public static void main(String[] args) {
        Student p1 = new Student();
        p1.setName("Rani");
        p1.setAge(50);
        System.out.println("Name :" + p1.getName());
        System.out.println("Age :" +p1.getAge());

    }
}
