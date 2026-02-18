public class Boletim {
    public double [][] notas;

    public Boletim(double[][] matrizDoMain){
        this.notas = matrizDoMain;
    }

    public double mediaAluno(int a) {
        double soma = 0;
        int qtdProvas = notas[0].length;
        
        for (int j = 0; j < qtdProvas; j++) {
            soma += notas[a][j]; 
        }
        return soma / qtdProvas;
    }

    public double mediaProva(int p) {
        double soma = 0;
        int qtdAlunos = notas.length;
        
        for (int i = 0; i < qtdAlunos; i++) {
            soma += notas[i][p];
        }
        return soma / qtdAlunos;
    }
}

