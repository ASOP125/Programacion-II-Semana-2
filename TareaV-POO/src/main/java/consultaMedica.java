public class consultaMedica extends Atencion {
    private String especialidad;

    public consultaMedica(Paciente paciente, int duracion, double costoBase, String especialidad, PoliticaCobro politicaCobro) {
        super(paciente, duracion, costoBase, politicaCobro);
        this.especialidad = especialidad;
    }

    @Override
    public double calcularCosto() {
        return politicaCobro.calcularCobro(costoBase, duracion);
    }

    @Override
    public void mostrarAtencion() {
        System.out.println("Consulta Médica - Especialidad: " + especialidad);
        super.mostrarAtencion();
        System.out.println("Costo final: Q" + calcularCosto());
    }

    //Getter y setter
    public String getEspecialidad() {return especialidad;}
    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}
}
