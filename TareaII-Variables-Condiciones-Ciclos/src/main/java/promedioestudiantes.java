import java.util.Scanner;

public class promedioestudiantes {

    // Función para calcular el promedio
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // Función para comprobar si está aprobado
    public static boolean estaAprobado(double promedio) {
        return promedio >= 61;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Variables constante que determinada la cantidad maxima
        final int MX_CANTIDAD = 5;

        //Preguntar al usuario la cantidad de estudiantes
        System.out.print("¿Cuántos estudiantes desea ingresar? (1 a 5): ");
        int cantidad = entrada.nextInt();

        //Condición que verifica la cantidad ingresada
        if (cantidad < 1 || cantidad > MX_CANTIDAD) {
            System.out.println("Error: debe ingresar una cantidad entre 1 y 5");
            return;
        }

        // Arreglos para nombres, promedios y estados 
        String[] nombres = new String[cantidad];
        double[] promedios = new double[cantidad];
        String[] estados = new String[cantidad];

        entrada.nextLine(); // Limpia

        // Ciclo For para poder capturar valores y asignarlos a los arreglos
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEstudiante #" + (i + 1));

            // Ingresa el nombre que escriba el usuario
            System.out.print("Nombre: ");
            nombres[i] = entrada.nextLine();

            // Notas ingresadas por el usuario
            System.out.print("Nota 1: ");
            double nota1 = entrada.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = entrada.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = entrada.nextDouble();

            // Calcular promedio
            double promedioEst = calcularPromedio(nota1, nota2, nota3);
            promedios[i] = promedioEst;

            // Determinar el estado del estudiante
            estados[i] = estaAprobado(promedioEst) ? "Aprobado" : "Reprobado";

            entrada.nextLine(); // Limpia
        }

        // Mostrar resumen de los datos ingresados
        System.out.println("\nResumen de estudiantes:");
        System.out.println("------------------------");
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Nombre: %-10s Promedio: %.2f     Estado: %s\n",
                    nombres[i], promedios[i], estados[i]);
                   }
              }
}