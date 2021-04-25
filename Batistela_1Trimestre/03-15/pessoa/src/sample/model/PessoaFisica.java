package sample.model;

public class PessoaFisica extends Pessoa {

    //atributos
    private String cpf;
    private String rg;

    //overwrite
    public PessoaFisica(String nome){
        super(nome);
    }

    public PessoaFisica(String nome,
                        Endereço endereço){
        super(nome, endereço);
    }

    //getter e setter
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return super.toString()
                + " CPF: " + cpf
                + ", RG: " + rg;
    }
}
