public class Cita {
    private Paciente paciente;
    private String tipoAtencion;
    private String fecha;
    private String hora;
    private String estado;

    //Constructor por defecto
    public Cita() {
        this.paciente = null;
        this.tipoAtencion = "Consulta";
        this.fecha = "Sin definir";
        this.hora = "Sin definir ";
        this.estado = "Sin programar";

    }

    //Constructor completo
    public Cita(Paciente paciente, String tipoAtencion, String fecha, String hora, String estado) {
        this.paciente = paciente;
        this.tipoAtencion = tipoAtencion;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;

    }

    //Sobrecarga solo de paciente, fecha y hora, los demas son valores por defecto
    public Cita(Paciente paciente, String tipoAtencion, String fecha, String hora) {
        this.paciente = paciente;
        this.tipoAtencion = "Consulta";
        this.fecha = fecha;
        this.hora = hora;
        this.estado = "Sin programar";
    }

    //Getters y Setters
    Paciente getPaciente() {
        return paciente;
    }

    void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    String getTipoAtencion() {
        return tipoAtencion;
    }

    void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    String getFecha() {
        return fecha;
    }

    void setFecha(String fecha) {
        this.fecha = fecha;
    }

    String getHora() {
        return hora;
    }

    void setHora(String hora) {
        this.hora = hora;
    }

    String getEstado() {
        return estado;
    }

    void setEstado(String estado) {
        this.estado = estado;
    }

    //Metodo imprimir informacion de la cita
    public void mostrarCita() {
        System.out.println("Cita [" + tipoAtencion + "] con " + paciente.getNombreCompleto() +
                " | Fecha: " + fecha + " | Hora: " + hora + " | Estado: " + estado);

    }
}
