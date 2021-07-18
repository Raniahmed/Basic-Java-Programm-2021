package local_global_instant;

public class Operator {

    public static void main(String[] args) {

        int a = 100;
        int b = 15;
        int min,max;

        min = a < b ? a:b;
        max = (a > b) ? a : b ;

        System.out.println(min);
        System.out.println(max);
    }
}
