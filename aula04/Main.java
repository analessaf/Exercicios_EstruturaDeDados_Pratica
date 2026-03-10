public class Main {
    public static void main(String[] args) {
        GamerDAO base = new GamerDAO();
        Gamer g1 = new Gamer("Alcides", 100);
        if (base.inserir(g1)){
            System.err.println("Cadastro realaizado");
        }else {
            System.err.println("Erro no cadastro");
        }

        Gamer g2 = new Gamer("Ana", 1000);
        if (base.inserir(g2)){
            System.err.println("Cadastro realaizado");
        }else {
            System.err.println("Erro no cadastro");
        }
        System.out.println("");
        System.out.println(base);

        base.remover(g1.getNome());
        System.out.println(base);

    }
}
