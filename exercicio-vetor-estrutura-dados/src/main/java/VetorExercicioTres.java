import java.util.Scanner;

public class VetorExercicioTres {

    public static void exibeVetor(String[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println("vetor[" + i + "]" + v[i]);
        }
    }

    public static String achouNome(String[] v, String leitor){
        String mensagem = "Sinto muito, não foi dessa vez :c";;
        for (int i = 0; i < v.length; i++){
            if (v[i].equals(leitor)){
                mensagem = "ripa na chulipa pimba na gorduchinha, conseguiu encontrar um nome no indice " + i;
                break;
            }
        }
        return mensagem;
    }
            // (double)
    public static void main(String[] args) {

        String[] vetor = new String[10];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um nome para salvar:[" + i + "]");
            vetor[i] = leitor.nextLine();
        }
        exibeVetor(vetor);

        System.out.println("Digite o nome que você quer encontrar: ");
        System.out.println(achouNome(vetor, leitor.nextLine()));

    }
}
