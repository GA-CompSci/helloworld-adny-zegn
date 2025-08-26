public class App {
    public static void main(String[] args) throws Exception {
        // Different Data Types
        String myName = "Andy"; // camelCase
        int x = 57;
        char c = 'c';
        double y = 5.5; // Initialization
        boolean boo; // Declaration
        boo = false;
        final String LANGUAGE = "Java"; // const

        System.out.println("Hello, " + myName);
        System.out.println(5.0f / 4); // float math
        
        System.out.println(x - 3);
        x -= 3; // Also: x = x - 3;
        System.out.println(x);
        
        // Comparisons
        System.out.println(true == false);
        System.out.println(!boo);

        //Conditional
        if (boo) System.out.println("boo is true");
        else System.out.println("boo is false");

        // Short Circuit
        int divisor = 0;
        if (divisor != 0 && 5 / divisor > 1) System.out.println("Uh oh");
    }
}
