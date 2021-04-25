package sample;

//metodo
public class Main {

    public static void main(String[] args) {
        int []vet1 = {2,4,5,3,1};
        int []vet2 = {2,4,2,8,2};
        int []result = new int[5];

        for(int i=0; i<5; i++)
            result[i] = vet1[i] + vet2[i];

//imprimir os 3 vetores/arrays
        for(int i=0; i<5; i++){
            System.out.print(vet1[i] + " ");
        }
        System.out.println("\n");

        for(int i=0; i<5; i++){
            System.out.print(vet2[i] + " ");
        }
        System.out.println("\n");

        for(int i=0; i<5; i++){
            System.out.print(result[i] + " ");
        }
    }

}