public class Main {

    public static void main(String[] args) {

        String helloWorld = "Hello"+" Wordl";
        StringBuilder helloWorldBuilder = new StringBuilder("Hello"+" World");

        helloWorld.concat(" and Goodbye");
        helloWorldBuilder.append(" and goodbye");
        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        helloWorld.concat(" have a nice day");
        helloWorldBuilder.append(" have a nice day");
        System.out.println(helloWorldBuilder);
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
