import java.util.Scanner;

public class ControlTemperaturas {

    //Procedimiento para mostrar todas las temperaturas
    public static void mostrarTemperaturas(double[] temperaturas){
        System.out.println("\n--- Temperaturas registradas ---");
        for(int i=0;i<temperaturas.length;i++){
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + " °C");
        }
    }

    //Funcion para obtener la temperatura maxima
    public static double temperaturaMaxima(double[] temperaturas){
        double max = temperaturas[0];
        for(int i = 1; i < temperaturas.length; i++){
            //Condicion para verificar la temperatura maxima
            if(temperaturas[i] > max){
                max = temperaturas[i];
            }
        }
        return max;
    }

    //Metodo sobrecargado para solo la temperatura
    public static void mostrarMaxima(double temperatura){
        System.out.println("La temperatura maxima es: " + temperatura + " °C");
    }

    //Metodo sobrecargado para temperatura + dia
    public static void mostrarMaxima(double temperatura, String dia ){
        System.out.println("La temperatura maxima es: " + temperatura + " °C registrada el " + dia);
    }

    //Funcion recursida para sumar temperaturas
    public static double sumarTemperaturas(double[] temperaturas, int indice){
        if(indice == temperaturas.length - 1){
            return temperaturas[indice];
        }
        return temperaturas[indice] + sumarTemperaturas(temperaturas, indice + 1);
    }

    //Programa principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] temperaturas = new double[7];
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        boolean datosIngresados = false;

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ingresar temperaturas");
            System.out.println("2. Mostrar todas las temperaturas");
            System.out.println("3. Mostrar temperatura máxima");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Ingreso de temperaturas ---");
                    for (int i = 0; i < 7; i++) {
                        System.out.print("Ingrese la temperatura del " + diasSemana[i] + ": ");
                        temperaturas[i] = entrada.nextDouble();
                    }
                    datosIngresados = true;
                    break;

                case 2:
                    if (datosIngresados) {
                        mostrarTemperaturas(temperaturas);
                        // Mostrar suma total usando recursividad (opcional)
                        double suma = sumarTemperaturas(temperaturas, 0);
                        System.out.println("Suma total de temperaturas: " + suma + " °C");
                    } else {
                        System.out.println("Primero debes ingresar las temperaturas.");
                    }
                    break;

                case 3:
                    if (datosIngresados) {
                        double maxTemp = temperaturaMaxima(temperaturas);
                        int indiceMax = 0;
                        for (int i = 0; i < temperaturas.length; i++) {
                            if (temperaturas[i] == maxTemp) {
                                indiceMax = i;
                                break;
                            }
                        }
                        mostrarMaxima(maxTemp); // sin día
                        mostrarMaxima(maxTemp, diasSemana[indiceMax]); // con día
                    } else {
                        System.out.println("Primero debes ingresar las temperaturas.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }
        } while (opcion != 4);

        entrada.close();
    }
}


