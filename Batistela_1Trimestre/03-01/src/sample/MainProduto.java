package sample;

import sample.model.Produto;

public class MainProduto {

    //ESTABELECENDO VALORES E PRINTANDO

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Laranja");
        produto.setPreco(3.20);

        System.out.println("produto: " + produto.getNome() + "\nPreço: " + produto.getPreco());
    }
}
