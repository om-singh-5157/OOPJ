public class Ques1 {
    public static void main(String[] args) {
        int a=5,b=6;
        System.out.println("\nArithmetic Operations:");
        System.out.printf("a + b = %d%n", a + b);
        System.out.printf("a - b = %d%n", a - b);
        System.out.println("\nRelational Operations:");
        System.out.printf("a == b: %b%n", a == b);
        System.out.printf("a != b: %b%n", a != b);
        System.out.println("\nLogical Operations:");
        System.out.printf("(a > 0) && (b > 0): %b%n", (a > 0) && (b > 0));
        System.out.printf("(a > 0) || (b > 0): %b%n", (a > 0) || (b > 0));
        System.out.printf("!(a > 0): %b%n", !(a > 0));
    }
}
