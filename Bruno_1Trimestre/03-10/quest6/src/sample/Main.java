package sample;

public class Main{

//metodo
    public static void main(String[] args) {
        int []idade = {6,17,20,7,22,18,15,16,18,20};
        int menorIdade = 120;
        for(int i=0; i<idade.length; i++){
            if(idade[i] < menorIdade)
                menorIdade = idade[i];
        }
        System.out.println("Menor Idade: "+menorIdade);


        idade = new int[]{6, 17, 20, 7, 22, 18, 15, 16, 18, 20};
        menorIdade = 120;
        for(int i=0; i<idade.length; i++){
            if(idade[i] < menorIdade)
                menorIdade = idade[i];
        }
        System.out.println("Menor Idade: "+menorIdade);

        int qtdIgualMenorIdade = 0;
        for(int i=0; i<idade.length; i++){
            if(idade[i] == menorIdade)
                qtdIgualMenorIdade++;
        }
        System.out.println("A qtd de idade igual(is) a menor idade é: " + qtdIgualMenorIdade);

    }
}
