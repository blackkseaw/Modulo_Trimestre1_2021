package sample;

import sample.model.ItensDoPedido;
import sample.model.Pedido;

public class MainPedido {

    //valores e printando
    public static void main(String[] args) {
//        ItensDoPedido itensDoPedido = new ItensDoPedido();
//
//        itensDoPedido.setProduto("uva", 1.50);
//        System.out.println(itensDoPedido);

        Pedido pedido = new Pedido();
        pedido.setDescricao("Comida");
        pedido.setDate("1/2/03");
        pedido.addProduto("Larana", 2.20);
        pedido.addProduto("Suco de larana", 5.50);

        System.out.println(pedido);

    }
}
