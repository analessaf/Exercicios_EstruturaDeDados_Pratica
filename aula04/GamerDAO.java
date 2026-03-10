
import java.util.ArrayList;

public class GamerDAO {
    private ArrayList<Gamer> listaDeJogadores = new ArrayList<>();

    public boolean inserir(Gamer j){
        if (buscar(j.getNome()) ==  null){
            int index = buscarPontuacaoMaior(j);
            if (index >= 0){
                listaDeJogadores.add(index, j);
            } else{
                listaDeJogadores.add(j);
            }
            return true;
        }
        return false;
    }
    public int buscarPontuacaoMaior(Gamer j){
        for (int i = 0; i < listaDeJogadores.size(); i++){
            if (listaDeJogadores.get(i).getPontuacao() <= j.getPontuacao()){
                return i;
            }
        }
        return -1;
    }

    public Gamer buscar (String nome){
        for(Gamer j : listaDeJogadores){
            if (j.getNome().equals(nome)){
                return j;
            }
        }
        return null;

    }

    public boolean remover (String nome){
        Gamer j = buscar(nome);
        if (j != null){
            listaDeJogadores.remove(j);
            return true;
        }
        return false;
    }

    public boolean atualizar(Gamer j){
        Gamer g = buscar(j.getNome());
        if (g != null){
            g.setNome(j.getNome());
            g.setPontuacao(j.getPontuacao());
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        String saida = "";
        for (Gamer j : listaDeJogadores){
            saida += "Nome: " +j.getNome() + "  Pontos: " + j.getPontuacao()+ "\n";
        }
        return saida;
    }

}
