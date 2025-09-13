import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear pacientes
        Paciente p1 = new Paciente("Arleth Orozco", "3021834990101", 19);
        Paciente p2 = new Paciente("Brenda Flores", "9876543210101", 42);
        Paciente p3 = new Paciente("Jorge Miranda", "4567891230109", 52);

        // Lista solo con consultas médicas
        ArrayList<Atencion> consultasMedicas = new ArrayList<>();

        // Crear consultas médicas con política de cobro
        consultasMedicas.add(new consultaMedica(p1, 60, 500, "Psiquiatría", new CobroFijo()));
        consultasMedicas.add(new consultaMedica(p2, 60, 700, "Cardiología", new CobroporTiempo(5)));
        consultasMedicas.add(new consultaMedica(p3, 120, 500, "Cirugía plástica", new CobroHorarioPico()));

        // Mostrar resumen único
        System.out.println( "Paciente             Tipo            Especialidad        Duracion   Costo Total");
        System.out.println("--------------------------------------------------------------------------");

       // Permite que todas las columnas esten alineadas aunque los nombres tengan diferentes longitudes
        for (Atencion atencion : consultasMedicas) {
            consultaMedica cm = (consultaMedica) atencion;
            System.out.printf("%-20s %-15s %-20s %-10d Q%-10.2f%n", // Alinear a la izquierda, String(s) con ancho de caracteres
                    cm.getPaciente().getNombreCompleto(),
                    "consultaMedica",
                    cm.getEspecialidad(),
                    cm.getDuracion(),
                    cm.calcularCosto());
        }
    }
}
