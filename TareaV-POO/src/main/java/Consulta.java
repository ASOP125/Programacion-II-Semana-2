public class Consulta extends Atencion {
    public Consulta(Paciente paciente, int duracion, double costoBase, PoliticaCobro politicaCobro) {
        super(paciente, duracion, costoBase, politicaCobro);
    }

    @Override
    public double calcularCosto() {
        return politicaCobro.calcularCobro(costoBase, duracion);
    }
}
