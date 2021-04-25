package sample;

import sample.model.Endereço;
import sample.model.Pessoa;
import sample.model.PessoaFisica;
import sample.model.PessoaJuridica;

public class Main {

    public static void main(String[] args) {

        Endereço endereço =  new Endereço();
        endereço.setRua("Virgilio Varzea");
        endereço.setBairro("Saco Grande");
        endereço.setNumero(1234);
        endereço.setCep("1134546");

        PessoaFisica pessoa2 = new
                PessoaFisica("Sofia", endereço);
        pessoa2.setRg("999999999");
        pessoa2.setCpf("1111111111");
        //System.out.println(pessoa2);

        PessoaFisica pessoa =
                new PessoaFisica("Fisica");
        pessoa.setEndereço("Rua",
                12,
                "Jurere", "1213232");
        pessoa.setRg("8888888");
        pessoa.setCpf("22222222");
        System.out.println(pessoa);

        PessoaJuridica pessoa3 =
                new PessoaJuridica("Juridica");
        pessoa3.setEndereço("Rua", 30, "Canasvieiras", "11312435465");
        pessoa3.setCnpj("123323");
        pessoa3.setIe("777");
        System.out.println(pessoa3);
    }



}
