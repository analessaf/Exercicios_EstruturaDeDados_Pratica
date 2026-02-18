public class Assentos {
    private int[][] mapa;

    public Assentos(int[][] mapaDoMain) {
        this.mapa = mapaDoMain;
    }

    public int[] reservarBloco(int qtd) {
        int linhas = mapa.length;
        int colunas = mapa[0].length;

        for (int i = 0; i < linhas; i++) {
            int assentosLivresSeguidos = 0;
            int colunaInicial = -1;

            for (int j = 0; j < colunas; j++) {
                if (mapa[i][j] == 0) {
                    if (assentosLivresSeguidos == 0) {
                        colunaInicial = j;
                    }
                    assentosLivresSeguidos++;

                    if (assentosLivresSeguidos == qtd) {
                        for (int k = colunaInicial; k < colunaInicial + qtd; k++) {
                            mapa[i][k] = 1;
                        }
                        return new int[]{i, colunaInicial}; 
                    }
                } else {
                    assentosLivresSeguidos = 0;
                    colunaInicial = -1;
                }
            }
        }
        return new int[]{-1, -1};
    }
}