public class App {
    public static void main(String[] args) throws Exception {

        fizBuzz(100);

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
        
        // Arrays
        int b, n, m, u = 0; // Multi-declaration
        b = 0;
        n = 0;
        m = 0; 
        int[] arr = {n, u, m, b}; // Merely copies, since n, u, m, b are primitives
        n = 5;
        System.out.println(arr[0]); // n is unchanged
        arr[0] = 5;
        System.out.println(arr[0]);
        System.out.println("The array in question has " + arr.length + " items contained.");

        System.out.println(addYaBoi("I play chess.")); // Nested method call
    }

    // Functions = Methods
    public static String addYaBoi(String str) {
        return str + " -ya boi";
    }

    // FizzBuzz
    public static void fizBuzz(int upperBound) {
        for (int k = 1; k <= upperBound; k++) {
            
            String output = "";

            if (k % 3 == 0) output += "Fizz";
            if (k % 5 == 0) output += "Buzz";

            if (output == "") output = String.valueOf(k);
            
            System.out.println(output);
        }
    }
}
