public class Risky {
    public static String risky(int n) {
    try {
        if (n == 0) {
            throw new IllegalArgumentException("Zero not allowed");
        }
        return "Success: " + (10 / n);
    } catch (ArithmeticException e) {
        return "Arithmetic error";
    } finally {
        System.out.println("Finally executed");
    }
}
    
}
