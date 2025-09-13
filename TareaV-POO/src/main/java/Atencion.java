// Clase abstracta
public abstract class Atencion {
    protected Paciente paciente;
    protected int duracion;      // duración en minutos
    protected double costoBase;  // tarifa base de la atención
    protected String especialidad;
    protected PoliticaCobro politicaCobro; // Strategy (política de cobro)

    // Constructor
    public Atencion(Paciente paciente, int duracion, double costoBase, PoliticaCobro politicaCobro) {
        this.paciente = paciente;
        this.duracion = duracion;
        this.costoBase = costoBase;
        this.politicaCobro = politicaCobro;
    }

    // Getters y Setters
    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public int getDuracion() { return duracion; }
    public void setDuracion(int duracion) { this.duracion = duracion; }
    public double getCostoBase() { return costoBase; }
    public void setCostoBase(double costoBase) { this.costoBase = costoBase; }
    public PoliticaCobro getPoliticaCobro() { return politicaCobro; }
    public void setPoliticaCobro(PoliticaCobro politicaCobro) { this.politicaCobro = politicaCobro; }

    // Metodo subclase
    public abstract double calcularCosto();

    //Metodo para mostrar la informacion
    public void mostrarAtencion() {
        System.out.println("Atención de " + paciente.getNombreCompleto() +
                " | Duración: " + duracion + " min | Costo base: Q" + costoBase);
    }
}
