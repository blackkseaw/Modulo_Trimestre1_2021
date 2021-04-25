package sample;

import sample.model.Pessoa;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa A, B;

        A = new Pessoa();
        B = new Pessoa();

        System.out.println("Digite, respectivamente, nome e idade da primeira pessoa.");
        A.nome = scan.next();
        A.idade = scan.nextInt();

        System.out.println("Digite, respectivamente, nome e idade da segunda pessoa.");
        B.nome = scan.next();
        B.idade = scan.nextInt();

        if(A.idade > B.idade){
            System.out.println(A.nome + " é mais velho que " + B.nome + ".");
        }
        else if(A.idade == B.idade){
            System.out.println(A.nome + " e " + B.nome + " possuem a mesma idade.");
        }
        else{
            System.out.println(B.nome + " é mais velho que " + A.nome + ".");
        }
    }
}