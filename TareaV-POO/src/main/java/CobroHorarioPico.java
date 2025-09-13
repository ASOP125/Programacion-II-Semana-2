// Politica de cobro - 20% mas por consulta sin cita
public class CobroHorarioPico implements PoliticaCobro {
    @Override
    public double calcularCobro(double costoBase, int duracion) {
        return costoBase * 1.2; // 20% extra
    }
}
