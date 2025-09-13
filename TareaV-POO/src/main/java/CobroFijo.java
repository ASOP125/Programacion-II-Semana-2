public class CobroFijo  implements PoliticaCobro{
    @Override
    public double calcularCobro(double costoBase, int duracion) {
        return costoBase; // se cobra lo mismo siempre
    }
}
