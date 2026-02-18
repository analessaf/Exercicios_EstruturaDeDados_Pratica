import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor de N? ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        System.out.println("Digite os valores da matriz: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------");
        for (int coluna = 0; coluna < n; coluna++) {
            for (int linha = n - 1; linha >= 0; linha--) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }    
}    