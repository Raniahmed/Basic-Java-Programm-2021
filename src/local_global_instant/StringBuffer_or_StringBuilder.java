package local_global_instant;

public class StringBuffer_or_StringBuilder {



    public static void main(String[] args) {

        Integer i = new Integer(12345);
        String testString= "Shahadat123456789";


        StringBuilder sb = new StringBuilder();
        //sb.append(i);
String xPath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
String mobNumber = " +8801707076966";


        System.out.println("The length of country number is : " + mobNumber.substring(1,4));
        String countryNumber = mobNumber.substring(1,4);
        String cnumber= "+882";

        if (countryNumber.length() == cnumber.length()) {
            System.out.println("This is BD number");
        } else {
            System.out.println("sorry");
        }


        sb.append(testString);

        StringBuilder lastvalu =sb.delete(0,8);
        int another = Integer.parseInt(String.valueOf(lastvalu));

        //System.out.println(sb.delete(0,8));
        System.out.println("after convert string to int " + another);

    }





}
