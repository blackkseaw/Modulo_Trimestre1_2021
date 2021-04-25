package sample.model;

import java.util.ArrayList;
import java.util.List;

public class Receita {
    //atributos
    private String nome;
    private String descricao;
    private List<Ingredientes> ingredientes;

    public Receita(){
        ingredientes = new ArrayList<>();
    }

    //getters e setters
    public List<Ingredientes> getIngredientes(){
        return ingredientes;
    }
    public void setIngrediente(String nome, double qtde, String um){
        Ingredientes ingrediente = new Ingredientes();
        ingrediente.setNome(nome);
        ingrediente.setQtde(qtde);
        ingrediente.setUm(um);
        ingredientes.add(ingrediente);
    }

    public void setIngredientes(Ingredientes ingrediente){
        this.ingredientes = ingredientes;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Receita{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}