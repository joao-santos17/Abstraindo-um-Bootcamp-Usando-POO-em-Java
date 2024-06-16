public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, double valorDiaria, int cilindradas) {
        super(marca, modelo, ano, valorDiaria);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public double calcularValorLocacao(int dias) {
        // Exemplo simples: valor da locação é o valor diário multiplicado pelo número de dias
        return getValorDiaria() * dias;
    }
}
