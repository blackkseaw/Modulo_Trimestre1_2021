package sample;

import sample.controller.Tabuleiro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();
        nomes.add("Fulano1");
        nomes.add("Fulano2");

        Tabuleiro tabuleiro = new Tabuleiro(nomes);

        tabuleiro.jogar();
        System.out.println(tabuleiro);
    }

}
