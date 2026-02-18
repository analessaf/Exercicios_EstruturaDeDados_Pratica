public class EstatisticaVetor {
    public int [] passos;

    public EstatisticaVetor(int[] vetorDoMain){
        this.passos = vetorDoMain;
    }

    public int calcularMaior() {
        int maior = passos[0];
        for (int n : passos) {
            if (n > maior) {
                maior = n;
            }
        }
        return maior;
    }

    public int calcularMenor() {
        int menor = passos[0];
        for (int n : passos) {
            if (n < menor) {
                menor = n;
            }
        }
        return menor;
    }

    public double calcularMedia() {
        double soma = 0;
        for (int n : passos) soma += n;
        return soma / passos.length;
    }
}
