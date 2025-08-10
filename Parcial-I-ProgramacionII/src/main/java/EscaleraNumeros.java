import java.util.Scanner;

public class EscaleraNumeros{

    // Procedimiento para imprimir escalera ascendente
    public static void imprimirAscendente(int niveles) {
        for (int i = 1; i <= niveles; i++) {
            imprimirLinea(i); // Se usa el metodo sobrecargado
        }
    }

    // Procedimiento para imprimir escalera descendente
    public static void imprimirDescendente(int nivel) {
        if (nivel < 1) {
            return; //  cuando ya no hay más niveles
        }
        imprimirLinea(nivel);
        imprimirDescendente(nivel - 1);
    }

    // Metodo sobrecargado para imprimir lineas
    public static void imprimirLinea(int nivel) {
        for (int i = 1; i <= nivel; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Metodo para imprimir una linea con un simbolo
    public static void imprimirLinea(int nivel, char simbolo) {
        for (int i = 1; i <= nivel; i++) {
            System.out.print(simbolo + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de niveles: ");
        int n = entrada.nextInt();

        if (n < 1) {
            System.out.println(" Error! el número de niveles debe ser mayor o igual a 1.");
        } else {
            // Parte ascendente
            imprimirAscendente(n);

            // Parte descendente usando recursividad
            imprimirDescendente(n - 1);

            // Imprimir escalera con simbolo
            System.out.println("\nEscalera con símbolo '*':");
            for (int i = 1; i <= n; i++) {
                imprimirLinea(i, '*');
            }
            for (int i = n - 1; i >= 1; i--) {
                imprimirLinea(i, '*');
            }
        }

        entrada.close();
    }
}
