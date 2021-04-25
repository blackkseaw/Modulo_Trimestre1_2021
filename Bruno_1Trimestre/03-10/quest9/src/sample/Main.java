package sample;

import java.util.Scanner;

class Main {
    //metodo
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe 5 números inteiros para um vetor.");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();
        int i4 = scan.nextInt();
        int i5 = scan.nextInt();

        System.out.println("Informe 5 números inteiros para outro vetor.");
        int i6 = scan.nextInt();
        int i7 = scan.nextInt();
        int i8 = scan.nextInt();
        int i9 = scan.nextInt();
        int i10 = scan.nextInt();

        int []vetA = {i1,i2,i3,i4,i5};
        int []vetB = {i6,i7,i8,i9,i10};
        int []vetC = new int[5];

        for(int i=0; i<5; i++){
            vetC[i] = vetA[i] - vetB[i];
        }

        System.out.println("Array 1:");
        for(int i=0; i<5; i++){
            System.out.print(vetA[i] + " ");
        }

        System.out.println("\nArray 2:");
        for(int i=0; i<5; i++){
            System.out.print(vetB[i] + " ");
        }

        System.out.println("\nArray 3:");
        for(int i=0; i<5; i++){
            System.out.print(vetC[i] + " ");
        }

    }
}


