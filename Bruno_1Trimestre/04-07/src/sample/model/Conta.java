package sample.model;

public class Conta {
    private int numconta;
    private String nometitular;
    private int inicial;
    private double saldo;
    private double varini;
    private double vardep;
    private double varsac;

    public Conta(int numconta, String nometitular){
        this.numconta = numconta;
        this.nometitular = nometitular;
    }

    public void iniciar(double valor){
        if(inicial == 1){
            this.saldo += valor;
        }
        else{
            this.saldo = 0;
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double sacar(double valor){
        this.saldo -= valor + 5;
        return valor;
    }

    public int getNumconta(){
        return numconta;
    }

    public void setNumconta(int numconta){
        this.numconta = numconta;
    }

    public String getNometitular(){
        return nometitular;
    }

    public void setNometitular(String nometitular){
        this.nometitular = nometitular;
    }

    public int getInicial(){
        return inicial;
    }

    public void setInicial(int inicial){
        this.inicial = inicial;
    }

    @Override
    public String toString() {
        return "Conta Bancária:" +
                "\nNúmero da Conta: " + numconta +
                "\nNome do Titular: " + nometitular +
                "\nSaldo: " + saldo + " reais\n";
    }
}
