import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantos eventos quer digitar? ");
        int qtd = sc.nextInt();
        int eventos[] = new int [qtd];

        System.out.println("Digite os eventos? ");
        for (int i = 0; i < qtd; i++){
            eventos[i] = sc.nextInt();
        }
        
        int auxiliar = 0;
        for (int j = 0; j < (qtd/2); j ++){
            int oposto = (qtd - 1) - j;
            auxiliar = eventos[j];
            eventos[j] = eventos[oposto];
            eventos[oposto] = auxiliar;
        }

        System.out.print("Vetor invertido: ");
        for (int i = 0; i < qtd; i++){
            System.out.print(eventos[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
