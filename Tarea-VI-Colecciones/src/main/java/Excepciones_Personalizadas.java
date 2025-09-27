class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super("Código de error: 1234 - " + message);
    }
}

public class Excepciones_Personalizadas {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try{
            checkAgeDefault(15);
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkAgeDefault(int age) throws Exception {
        if (age < 18) {
            throw new Exception("La edad debe ser mayor o igual a 18.");
        } else {
            System.out.println("Edad válida: " + age);
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {

            throw new InvalidAgeException("La edad debe ser mayor o igual a 18.");
        } else {
            System.out.println("Edad válida: " + age);
        }
    }
}