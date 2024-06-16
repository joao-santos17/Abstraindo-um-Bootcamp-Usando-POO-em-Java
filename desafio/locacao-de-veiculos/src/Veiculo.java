public abstract class Veiculo {
    
    private String marca;
    private String modelo;
    private int ano;
    private double valorDiaria;
    private boolean disponivel;

    public Veiculo(String marca, String modelo, int ano, double valorDiaria){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    // Métodos getters e setters para os atributos privados
    public String getMarca(){
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
    //Método abstrato para calcular o valor da locação (será implementado nas subclasses)
    public abstract double calcularValorLocacao(int dias);
}
