// Politica de cobro -  se cobrara extra por el tiempo de la consulta
public class CobroporTiempo implements PoliticaCobro {
    private double tarifaPorMinuto;

    public CobroporTiempo(double tarifaPorMinuto) {
        this.tarifaPorMinuto = tarifaPorMinuto;
    }
    //
    @Override
    public double calcularCobro(double costoBase, int duracion) {
        return costoBase + (duracion * tarifaPorMinuto);
    }
}
