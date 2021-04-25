package sample.model;

public abstract class Veiculo {
    //atributos
    private String nome;
    private Marca marca;

    //construtor
    public Veiculo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //overload
    public void setNome(String nome) {
        this.nome = nome;
        marca = new Marca();
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setMarca(
            String nome, String descricao
    ){
        Marca marca =  new Marca();
        marca.setNome(nome);
        marca.setDescricao(descricao);
        this.marca =  marca;
    }

    @Override
    public String toString() {
        return "Veiculo - " +
                "Nome: '" + nome + ". Marca: " + marca;
    }
}
