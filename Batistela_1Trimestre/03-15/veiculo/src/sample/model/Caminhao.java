package sample.model;

public class Caminhao extends Veiculo {

    //atributos
    private int eixos;
    private Marca marca;

    //getter e setter
    public Caminhao(String nome){
        super(nome);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return super.toString() +
                "N° de eixos: " + eixos +
                '.';
    }
}
