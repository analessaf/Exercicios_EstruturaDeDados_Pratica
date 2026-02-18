public class ControleEstoque {
    private int[][] estoque;

    public ControleEstoque(int[][] matrizDoMain) {
        this.estoque = matrizDoMain;
    }

    public int estoqueTotalProduto(int p) {
        int soma = 0;
        int colunas = estoque[0].length;
        
        for (int j = 0; j < colunas; j++) {
            soma += estoque[p][j];
        }
        return soma;
    }

    public int estoqueGeral() {
        int soma = 0;
        
        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[0].length; j++) {
                soma += estoque[i][j];
            }
        }
        return soma;
    }
}