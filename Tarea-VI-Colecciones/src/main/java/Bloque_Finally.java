import java.io.FileInputStream;
import java.io.IOException;

public class Bloque_Finally {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("archivo.txt");
            System.out.println("Archivo abierto correctamente.");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            System.out.println("Sección finally");
            try {
                if (fis != null) {
                    fis.close();
                    System.out.println("Archivo cerrado correctamente.");
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}