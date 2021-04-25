package sample;

import sample.model.Funcionario;
import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Funcionario A, B;

        A = new Funcionario();
        B = new Funcionario();

        System.out.println("Digite, respectivamente, nome e salário do primeiro funcionário.");
        A.nome = scan.next();
        A.salario = scan.nextDouble();

        System.out.println("Digite, respectivamente, nome e salário do segundo funcionário.");
        B.nome = scan.next();
        B.salario = scan.nextDouble();

        double salariomedio;

        salariomedio = (A.salario + B.salario)/2;

        System.out.println("O salário médio é de " + salariomedio + " reais.");
    }
}
