//Procedimiento para una cirugia menor
public class Procedimiento extends Atencion {
    public Procedimiento(Paciente paciente, int duracion, double costoBase, PoliticaCobro politicaCobro) {
        super(paciente, duracion, costoBase, politicaCobro);
    }

    @Override
    public double calcularCosto() {
        return politicaCobro.calcularCobro(costoBase, duracion);
    }
}

