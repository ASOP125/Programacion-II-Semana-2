import java.util.Random;

public class GeneradorDatosDueno {

    public static Dueno[] generarDuenos(int cantidad){
        Dueno[] duenos = new Dueno[cantidad];
        Random random = new Random();

        // Cree arreglos para poder usar los nombres de forma aleatoria y pueda darme 500 Dueños con nombres diferentes

        String[] nombres = {"Arleth", "María", "David", "Ana", "Luis", "Sofía", "Pedro", "Laura", "Diego", "Camila"};
        String[] apellidos = {"Orozco", "Pérez", "López", "Martínez", "Rodríguez", "Gómez", "Hernández", "Morales", "Cruz", "Ramírez"};

        for (int i = 0; i < cantidad; i++) {
            long id = i + 1;

            // Seleccionar nombre y apellido al azar
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido = apellidos[random.nextInt(apellidos.length)];
            String nombreCompleto = nombre + " " + apellido;

            // Teléfono aleatorio (8 dígitos)
            String telefono = "502-" + String.format("%08d", random.nextInt(100_000_000));

            // Email aleatorio
            String email = nombre.toLowerCase() + apellido.toLowerCase() + (random.nextInt(1000) + 1) + "@correo.com";

            // Dirección aleatoria
            String direccion = "Calle " + (random.nextInt(50) + 1) + ", Zona " + (random.nextInt(25) + 1);

            duenos[i] = new Dueno(id, nombreCompleto, telefono, email, direccion);
        }

        return duenos;
    }
}
