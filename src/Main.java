public class Main {

    public static void main(String[] args) {

        String helloWorld = "Hello"+" Wordl";
        StringBuilder helloWorldBuilder = new StringBuilder("Hello"+" World");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
    }

    public static void printInformation(String string){

        System.out.println("String = "+string);
        System.out.println("lenght = "+string.length());
    }

    public static void printInformation(StringBuilder builder){

        System.out.println("String = "+builder);
        System.out.println("lenght = "+builder.length());
    }
}
