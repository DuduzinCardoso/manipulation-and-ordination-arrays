import java.util.Scanner;

public class VetorTeste {

    public static void exibeVetor(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println("vetor[" + i + "]" + v[i]);
        }
    }

    public static void exibeVetorAoContrario(int[] v){
        for (int i = v.length -1; i >= 0; i--){
            System.out.println("vetor[" + i + "]" + v[i]);
        }
    }

    public static void main(String[] args) {


        int[] megumin = new int[7];

        for (int i = 0; i < megumin.length; i++){
            megumin[i] = i * 10;
        }
        exibeVetor(megumin);

        System.out.println("--------------------------------------------------------");

        exibeVetorAoContrario(megumin);

    }
}
