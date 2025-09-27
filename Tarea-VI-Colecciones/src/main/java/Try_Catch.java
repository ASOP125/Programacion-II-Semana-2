public class Try_Catch {
    public static void main(String[] args) {
        try {
            int division = 10 / 0;
            System.out.println("Resultado: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }
    }
}