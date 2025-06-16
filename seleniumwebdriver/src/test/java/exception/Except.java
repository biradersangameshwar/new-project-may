package exception;

public class Except {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

