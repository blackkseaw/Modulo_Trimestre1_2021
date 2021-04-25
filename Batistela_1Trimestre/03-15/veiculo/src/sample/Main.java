package sample;

import sample.model.Marca;
import sample.model.Caminhao;
import sample.model.Carro;
import sample.model.Veiculo;

public class Main {

    public static void main(String[] args) {

        Marca marca =  new Marca();
        marca.setNome("Jotaro");
        marca.setDescricao("Carro grande e azul");


        Carro carro1 =  new
                Carro("Carro");
        carro1.setPorta(1);
        carro1.setMarca("Jotado", "blblblblblblblblblbl");
        System.out.println(carro1);

        Caminhao caminhao1 = new
                Caminhao("Caminhao");
        caminhao1.setEixos(4);
        caminhao1.setMarca("Hahaha", "banaak");
        System.out.println(caminhao1);

    }
}
