package sample;

import sample.model.Contato;
import sample.model.Pessoa;

public class MainPessoaContato {

    //valores e printando
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Fulano");
        pessoa.setContato("48 1234-5678",
                "fulano@gmail.com",
                "amiguinho");

        System.out.println(pessoa);

    }
}
