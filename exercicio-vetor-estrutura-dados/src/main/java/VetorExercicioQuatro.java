import java.util.Scanner;

public class VetorExercicioQuatro {

    public static void exibeVetor(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println("vetor[" + i + "]" + v[i]);
        }
    }

    public static String encontrarNumero(int[] v, int leitor){
        int contador = 0;
        String mensagem = "Sinto muito, não foi dessa vez :c";;
        for (int i = 0; i < v.length; i++){
            if (v[i] == leitor){
                contador++;
                mensagem = "ripa na chulipa pimba na gorduchinha, conseguiu encontrar um número e ele se repetiu " + contador + " vezes";
            }
        }
        return mensagem;
    }
    public static void main(String[] args) {


        int[] vetor = new int[10];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número para salvar:[" + i + "]");
            vetor[i] = leitor.nextInt();
        }
        exibeVetor(vetor);

        System.out.println("Digite um número para ver quantas vezes ele repetiu:");
        System.out.println(encontrarNumero(vetor, leitor.nextInt()));

    }
}
