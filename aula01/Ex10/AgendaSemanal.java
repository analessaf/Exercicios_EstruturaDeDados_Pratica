public class AgendaSemanal {
    private int[][] agenda;

    public AgendaSemanal(int[][] matrizDoMain) {
        this.agenda = matrizDoMain;
    }

    public int contarHorariosLivres() {
        int livres = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (agenda[i][j] == 0) {
                    livres++;
                }
            }
        }
        return livres;
    }
}