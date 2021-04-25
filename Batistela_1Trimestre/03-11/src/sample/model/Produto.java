package sample.model;

public class Produto {

    //atributos
    private String nome;
    private double valor;

    //getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto: " + nome +
                " Preço: R$" + valor;
    }
}
