package sample;

import sample.model.Conta;

public class Atividade {
    public static void main(String[] args){

        Conta conta1 = new Conta(8832,"Alex Green");
        conta1.setInicial(1);
        conta1.iniciar(500);
        System.out.println(conta1);

        conta1.depositar(200);
        System.out.println(conta1);

        conta1.sacar(300);
        System.out.println(conta1);


        Conta conta2 = new Conta(7801, "Maria Brown");
        conta2.setInicial(2);
        System.out.println(conta2);

        conta2.depositar(200);
        System.out.println(conta2);

        conta2.sacar(198);
        System.out.println(conta2);
    }
}
