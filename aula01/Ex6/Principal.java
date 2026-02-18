import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite N (quantidade de dias): ");
        int n = sc.nextInt();
        int[] vetorDoMain = new int[n];
        
        System.out.println("Digite os passos diários: ");
        for (int i = 0; i < n; i++) {
            vetorDoMain[i] = sc.nextInt();
        }
        
        EstatisticaVetor calculadora = new EstatisticaVetor(vetorDoMain);
        
        System.out.println("Maior: " + calculadora.calcularMaior());
        System.out.println("Menor: " + calculadora.calcularMenor());
        System.out.printf("Media: %.2f\n", calculadora.calcularMedia());
        
        sc.close();
    }
} 
    
