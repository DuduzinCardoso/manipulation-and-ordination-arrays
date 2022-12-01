import java.util.Objects;
import java.util.Scanner;

public class VetorExercicioDois {

    public static void exibeVetor(double[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println("vetor[" + i + "]" + v[i]);
        }
    }

    public static void main(String[] args) {

        double[] vetor = new double[10];
        Scanner leitor = new Scanner(System.in);
        double soma = 0;

        while (true){
            System.out.println("Bem-vindo! para adicionar os números, digite a palavra: cat");
            if (!Objects.equals(leitor.nextLine(), "cat")){
                System.out.println("Não conseguir entender, tente novamente, por favor");
            }else{
                for (int i = 0; i < vetor.length; i++){
                    System.out.println("Digite o valor do vetor[" + i + "]");
                    vetor[i] = leitor.nextDouble();
                    soma += vetor[i];
                }
                double calculoMedia = soma / vetor.length;
                exibeVetor(vetor);
                System.out.println(calculoMedia);
                break;
            }
        }



    }
}
