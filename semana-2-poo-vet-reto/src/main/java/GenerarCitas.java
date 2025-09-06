import java.time.*;
public class GenerarCitas {


        public static Cita[] generarCitas(Dueno[] duenos, Paciente[] pacientes) {
            Cita[] citas = new Cita[40]; // 2 citas por cada uno de los primeros 20 dueños
            LocalDateTime base = LocalDateTime.now().plusDays(1);

            int index = 0;
            for (int i = 0; i < 20; i++) {
                Dueno dueno = duenos[i];
                Paciente[] mascotas = dueno.getMascotas();

                // seguridad: si no tiene mascotas, saltar
                if (mascotas.length == 0) continue;

                // primera mascota (si tiene)
                Paciente mascota1 = mascotas[0];
                citas[index] = new Cita(index + 1, mascota1, dueno, base.withHour(10), "Revisión general");

                // segunda mascota (o la misma si solo hay 1)
                Paciente mascota2 = mascotas.length > 1 ? mascotas[1] : mascota1;
                citas[index + 1] = new Cita(index + 2, mascota2, dueno, base.withHour(11), "Vacunación");

                index += 2;
            }

            // aplicar condiciones
            for (Cita c : citas) {
                if (c == null) continue;

                if (c.getId() % 2 == 0) {
                    c.reagendar(c.getFecha().plusDays(1));
                } else if (c.getId() % 3 == 0) {
                    c.cancelar("No puede asistir");
                } else {
                    c.marcarAtendida();
                }
            }

            return citas;
        }
    }


