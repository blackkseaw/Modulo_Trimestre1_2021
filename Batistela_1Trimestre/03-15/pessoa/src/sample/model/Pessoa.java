package sample.model;

public abstract class Pessoa {

    //atributos
    private String nome;
    private Endereço endereço;

    //construtor
    public Pessoa(String nome){
        this.nome =  nome;
        this.endereço =  new Endereço();
    }

    //overload
    public Pessoa(String nome, Endereço endereço){
        this.nome =  nome;
        this.endereço =  endereço;
    }

    public String getNome() {
        return nome;
    }

    //getter e setter
    public void setNome(String nome) {
        this.nome = nome;
        endereço =  new Endereço();
    }
    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public void setEndereço(
            String rua, int numero,
            String bairro,
            String cep ){
        this.endereço.setRua(rua);
        this.endereço.setNumero(numero);
        this.endereço.setBairro(bairro);
        this.endereço.setCep(cep);
    }

    public String toString(){
        return "Nome: " + this.nome
        + '\n' + endereço;
    }

}
