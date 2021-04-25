package sample.model;

public class Carro extends Veiculo {

    //atributo
    private int porta;
    private Marca marca;

    //getter e setter
    public Carro(String nome){
        super(nome);
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    @Override
    public String toString() {
        return super.toString() +
                "N° de portas:" + porta +
                '.';
    }
}
