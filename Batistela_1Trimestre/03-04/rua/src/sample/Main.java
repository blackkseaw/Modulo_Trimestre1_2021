package sample;

import sample.model.Rua;

public class Main{

    public static void main(String[] args) {

        //valores e pritando
        Rua rua = new Rua();
        rua.setRua("Rua dos limões");
        rua.setNumero(42);
        rua.setBairro("Bairro do limoeiro");
        rua.setCidade("Limão");

        System.out.println(rua);

    }
}