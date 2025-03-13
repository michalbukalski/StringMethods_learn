public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = "+startingIndex);
        System.out.println("Birth year = "+birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("-", "25","11","1982");
        System.out.println("newDate = "+newDate);

        String newDate2 = "25";
        newDate2 = newDate2.concat("/");
        newDate2 = newDate2.concat("11");
        newDate2 = newDate2.concat("/");
        newDate2 = newDate2.concat("1982");
        System.out.println("newDate2 = "+newDate2);

        System.out.println(newDate2.replace("/","*"));

        System.out.println(newDate2.replaceFirst("/",":"));
        System.out.println(newDate2.replaceAll("/","---"));

        System.out.println("ABC\n".repeat(5).indent(8));

        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(5).indent(-100));

    }
}
