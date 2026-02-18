public class ResultadoPesquisa {
    private int[] respostas;

    public ResultadoPesquisa(int[] vetorDoMain) {
        this.respostas = vetorDoMain;
    }

    public int contarNota(int nota) {
        int quantidade = 0;
        
        for (int resposta : respostas) {
            if (resposta == nota) {
                quantidade++;
            }
        }
        return quantidade;
    }
}