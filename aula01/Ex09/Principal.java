import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a qtd de produtos:");
        int produtos = sc.nextInt();
        
        System.out.println("Digite a qtd de filiais:");
        int filiais = sc.nextInt();
        
        int[][] matriz = new int[produtos][filiais];
        
        System.out.println("Digite a qtd de produtos por filial:");
        for (int i = 0; i < produtos; i++) {
            for (int j = 0; j < filiais; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        
        ControleEstoque controle = new ControleEstoque(matriz);

        System.out.println("Total produto 0: " + controle.estoqueTotalProduto(0));
        System.out.println("Total geral: " + controle.estoqueGeral());
        
        sc.close();
    }
}