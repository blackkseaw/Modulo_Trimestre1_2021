package sample;

import sample.Model.Nome;

public class Main{

    //valores e printando
    public static void main(String[] args) {

        Nome nome = new Nome();
        Nome.setNome("bla");
        Nome.setDataNascimento("aaa");

        System.out.println(nome);

    }
}