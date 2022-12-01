import java.util.Scanner;

public class VetorExercicioCinco {

    public static void exibeVetorNomes(String[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("vetor[" + i + "]" + v[i]);
        }
    }

    public static void exibeVetorNumeros(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("vetor[" + i + "]" + v[i]);
        }
    }

    public static String encontrarCarroEconomico(String[] c, int[] v) {
        int valorTotal = 0;
        String nomeCarro = "";
        String mensagem = "Sinto muito, não foi dessa vez :c";
        ;
        for (int i = 0; i < v.length; i++) {
            for (int y = 0; y < c.length; y++) {
                if (valorTotal <= v[i]) {
                    valorTotal = v[i];
                    nomeCarro = c[i];
                }
            }
            mensagem = "ripa na chulipa pimba na gorduchinha, o carro mais economico é: " + nomeCarro + " e o valor economico dele é: " +
                    valorTotal;
        }
        return mensagem;
    }

    public static void main(String[] args) {

        int[] vetorEconomico = new int[5];
        String[] vetorNomes = new String[5];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetorNomes.length; i++) {
            System.out.println("Olá, Seja Bem-Vindo! Cadastre 5 modelos de carros: [" + i + "]");
            vetorNomes[i] = leitor.nextLine();
        }

        for (int i = 0; i < vetorEconomico.length; i++) {
            System.out.println("Agora, digite o rendimento de cada carro, seguindo a ordem que foram " +
                    "digitados anteriormente: [" + i + "]");
            vetorEconomico[i] = leitor.nextInt();
        }

        exibeVetorNomes(vetorNomes);
        exibeVetorNumeros(vetorEconomico);
        System.out.println(encontrarCarroEconomico(vetorNomes, vetorEconomico));

    }
}
