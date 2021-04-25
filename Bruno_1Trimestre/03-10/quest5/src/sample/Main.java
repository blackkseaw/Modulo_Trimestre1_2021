package sample;

//metodo
public class Main{

    public static void main(String[] args) {
        int []vet1 = {10,20,30,40,50};
        int []vet2 = new int[5];

        for(int i=0, j=4; i<vet1.length; i++, j--)
            vet2[i] = vet1[j];

        imprimirVetor(vet1);
        imprimirVetor(vet2);

    }

}
