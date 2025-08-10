import java.util.Arrays;

public class SistemaEvaluación {

    // Función para calcular el promedio
    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Función que retorna un carácter según el promedio
    public static char obtenerLiteral(double promedio) {
        if (promedio >= 90) return 'A';
        else if (promedio >= 80) return 'B';
        else if (promedio >= 70) return 'C';
        else if (promedio >= 60) return 'D';
        else return 'F';
    }

    // Función para verificar si está aprobado
    public static boolean estaAprobado(char literal) {
        return literal == 'A' || literal == 'B' || literal == 'C';
    }

    // Procedimiento para mostrar resultados de un estudiante
    public static void mostrarResultado(String nombre, double[] notas) {
        double promedio = calcularPromedio(notas);
        char literal = obtenerLiteral(promedio);
        boolean aprobado = estaAprobado(literal);

        System.out.println("Estudiante: " + nombre);
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.println("Literal: " + literal);
        System.out.println("Resultado: " + (aprobado ? "Aprobado ✅" : "Reprobado ❌"));
        System.out.println("-------------------------");
    }

    // Programa principal
    public static void main(String[] args) {
        String[] nombres = {"Ana Castillo", "Luis Pérez", "María López"};
        double[][] todasLasNotas = {
                {95.5, 87.0, 90.0},
                {60.0, 65.5, 58.0},
                {82.0, 79.5, 85.0}
        };

        for (int i = 0; i < nombres.length; i++) {
            mostrarResultado(nombres[i], todasLasNotas[i]);
        }
    }
}
