import java.util.ArrayList;
import java.util.List;

public class LocacaoVeiculo {
    public static void main(String[] args) {
        // Criando alguns veículos para locação
        Carro carro1 = new Carro("Ford", "Fiesta", 2020, 100.0, 4);
        Moto moto1 = new Moto("Honda", "CBR500R", 2021, 80.0, 500);

        // Lista de veículos disponíveis para locação
        List<Veiculo> veiculosDisponiveis = new ArrayList<>();
        veiculosDisponiveis.add(carro1);
        veiculosDisponiveis.add(moto1);

        // Simulando a locação de um veículo
        Veiculo veiculoSelecionado = veiculosDisponiveis.get(0);
        int diasLocacao = 5;
        double valorLocacao = veiculoSelecionado.calcularValorLocacao(diasLocacao);

        // Marcando o veículo como indisponível após a locação
        veiculoSelecionado.setDisponivel(false);

        // Exibindo informações da locação
        System.out.println("Veículo alugado: " + veiculoSelecionado.getMarca() + " " + veiculoSelecionado.getModelo());
        System.out.println("Valor da locação por " + diasLocacao + " dias: R$" + valorLocacao);

        // Exibindo lista de veículos disponíveis após a locação
        System.out.println("\nVeículos disponíveis após a locação:");
        for (Veiculo veiculo : veiculosDisponiveis) {
            if (veiculo.isDisponivel()) {
                System.out.println(veiculo.getMarca() + " " + veiculo.getModelo());
            }
        }
    }
}
