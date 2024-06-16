public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, double valorDiaria, int numeroPortas) {
        super(marca, modelo, ano, valorDiaria);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public double calcularValorLocacao(int dias) {
        // Exemplo simples: valor da locação é o valor diário multiplicado pelo número de dias
        return getValorDiaria() * dias;
    }
}

