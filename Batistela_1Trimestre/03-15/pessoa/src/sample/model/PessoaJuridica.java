package sample.model;

public class PessoaJuridica extends Pessoa{

    //atributos
    private String cnpj;
    private String ie;

    //overwrite
    public PessoaJuridica(String nome){
        super(nome);
    }

    public PessoaJuridica(String nome,
                        Endereço endereço){
        super(nome, endereço);
    }

    //getter e setter
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return super.toString() +
                " CNPJ: '" + cnpj +
                ", IE:'" + ie  +
                '.';
    }
}
