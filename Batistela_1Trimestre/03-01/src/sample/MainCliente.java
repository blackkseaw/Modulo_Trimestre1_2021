package sample;

import sample.model.Cliente;

public class MainCliente {

    //ESTABELECENDO VALORES E PRINTANDO

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Fulano");
        cliente.setIdade(20);
        cliente.setEmail("fulano@gmail.com");
        cliente.setTelefone("(48) 9 1234-5678");

        System.out.println("Nome: " + cliente.getNome() + "\nIdade: " + cliente.getIdade()
                + "\nEmail: " + cliente.getEmail() + "\nTelefone: " + cliente.getTelefone());
    }
}
