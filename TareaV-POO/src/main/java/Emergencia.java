//Subclase de Atencion: emergencia
public class Emergencia extends Atencion {
    public Emergencia(Paciente paciente, int duracion, double costoBase, PoliticaCobro politicaCobro) {
        super(paciente, duracion, costoBase, politicaCobro);
    }

    @Override
    public double calcularCosto() {
        // emergencia siempre se cobra 50% extra
        return politicaCobro.calcularCobro(costoBase, duracion) * 1.5;
    }
}
