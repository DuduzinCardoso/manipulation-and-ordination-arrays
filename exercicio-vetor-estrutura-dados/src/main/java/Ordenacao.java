import java.util.Arrays;

public class Ordenacao {

    public static void exibeVetorNomes(int[] v) {
        int contador = 0;
        int troca = 0;
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++){
                contador++;
                if (v[j] < v[i]){
                   int aux = v[i];
                   v[i] = v[j];
                   v[j] = aux;
                }
            }
            troca++;
        }
        System.out.println(contador);
        System.out.println(troca);
        System.out.println(Arrays.toString(v));
    }

    public static void sortOtimizado(int[] v) {
        int contador = 0;
        int troca = 0;
        for (int i = 0; i < v.length -1; i++){
            int indMenor = i;
            for (int j = i + 1; j < v.length; j++){
                contador++;
                if (v[j] < v[indMenor]){
                    indMenor = j;
                }
            }
            troca++;
            int aux = v[i];
            v[i] = v[indMenor];
            v[indMenor] = aux;
        }
        System.out.println(contador);
        System.out.println(troca);
        System.out.println(Arrays.toString(v));
    }

    public static void main(String[] args) {

        int[] vetorzinho = {2,5,3,7,0,1,4,9,8};

//        sortOtimizado(vetorzinho);
      exibeVetorNomes(vetorzinho);
    }
}
