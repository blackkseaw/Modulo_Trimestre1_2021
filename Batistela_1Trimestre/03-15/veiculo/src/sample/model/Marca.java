package sample.model;

public class Marca {
    //atributos
    private String nome;
    private String descricao;

    //getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Marca - " +
                "Nome: '" + nome + '\'' +
                ", Descrição:'" + descricao + '\'' +
                '.';
    }
}
