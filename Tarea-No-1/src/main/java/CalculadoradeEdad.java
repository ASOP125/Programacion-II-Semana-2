import java.util.Scanner; //importa la clase scanner

public class CalculadoradeEdad {

    public static void main(String[] args) {
        // Permite leer lo que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre al usuario
        System.out.print("Ingrese tu nombre: ");
        String Nombre = scanner.nextLine(); //lee el texto donde se escribio el nombre

        // Solicitar el año de nacimiento del usuario
        System.out.print("Ingresa tu año de nacimiento: ");
        int AñoNacimiento = scanner.nextInt(); // lee un numero entero

        // Calcular la edad aproximada utilizando el año actual (2025)
        int Edad = 2025 - AñoNacimiento;

        // Mostrar el resultado
        System.out.println("Hola "+ Nombre + ", tu edad aproximada es: " + Edad + " años. " );

        // Cerrar el scanner
        scanner.close();

    }
}