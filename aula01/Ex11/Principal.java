import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a qtd de respostas para cadastrar:");
        int n = sc.nextInt();
        
        int[] vetorRespostas = new int[n];
        
        System.out.println("Digite as " + n + " respostas obtidas na pesquisa:");
        for (int i = 0; i < n; i++) {
            vetorRespostas[i] = sc.nextInt();
        }
        
        ResultadoPesquisa pesquisa = new ResultadoPesquisa(vetorRespostas);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nota " + i + ": " + pesquisa.contarNota(i));
        }
        
        sc.close();
    }
}