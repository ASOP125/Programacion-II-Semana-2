public class Throw_Throws {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("La edad debe ser mayor o igual a 18.");
        } else {
            System.out.println("Edad válida: " + age);
        }
    }
}
