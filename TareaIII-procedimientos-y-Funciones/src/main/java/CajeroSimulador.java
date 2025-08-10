import java.util.ArrayList;
import java.util.Scanner;

public class CajeroSimulador {

    // Procedimiento para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("\n1. Consultar Saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.print("\nElija una opción: ");
    }

    // Procedimiento para consultar saldo
    public static void consultarSaldo(double[] saldo, ArrayList<String> historial) {
        System.out.printf("Su saldo actual es: Q%.2f%n", saldo[0]);
        historial.add("Consulta de saldo");
    }

    // Procedimiento para depositar dinero
    public static void depositarDinero(double[] saldo, ArrayList<String> historial, Scanner entrada) {
        System.out.print("Ingrese el monto a depositar: Q");
        double monto = entrada.nextDouble();
        //if para verificar el monto ingresado
        if (monto <= 0) {
            System.out.println("El monto ingresado debe ser mayor a cero.");
            return;
        }

        saldo[0] += monto;
        System.out.printf("Depósito exitoso. Su saldo actual es: Q%.2f%n", saldo[0]);
        historial.add(String.format("Depósito de Q%.2f", monto));
    }

    // Procedimiento para retirar dinero
    public static void retirarDinero(double[] saldo, ArrayList<String> historial, Scanner entrada) {
        System.out.print("Ingrese el monto a retirar: Q");
        double retiro = entrada.nextDouble();

        //If para verificar si el monto a retirar no es mayor a su saldo ni es cero.
        if (retiro <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
            return;
        }

        if (retiro > saldo[0]) {
            System.out.println("Fondos insuficientes.");
            return;
        }

        saldo[0] -= retiro;
        System.out.printf("Retiro exitoso. Su saldo actual es: Q%.2f%n", saldo[0]);
        historial.add(String.format("Retiro de Q%.2f", retiro));
    }

    // Procedimiento para iniciar sesión
    public static void iniciarSesion() {
        Scanner control = new Scanner(System.in);
        double[] saldo = {1500.00}; // Saldo inicial
        ArrayList<String> historial = new ArrayList<>(); // Historial de transacciones

        System.out.println("Bienvenido al Cajero Automático");
        int opcion;

        do {
            mostrarMenu();
            opcion = control.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo(saldo, historial);
                    break;
                case 2:
                    depositarDinero(saldo, historial, control);
                    break;
                case 3:
                    retirarDinero(saldo, historial, control);
                    break;
                case 4:
                    System.out.println("\nGracias por usar el cajero automático.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 4);

        // Mostrar historial al salir
        System.out.println("\n--- Historial de transacciones ---");
        for (String transaccion : historial) {
            System.out.println(transaccion);
        }

        control.close();
    }

    // Llamar al procedimiento que lo controla todo
    public static void main(String[] args) {
        iniciarSesion();
    }
}
