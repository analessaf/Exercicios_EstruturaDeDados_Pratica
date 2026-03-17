public class Tarefa {
    private int ID;
    private String descricao;
    private String prioridade;
    private String status;

    public Tarefa(int id, String d, String p, String s){
        this.ID = id;
        this.descricao = d;
        this.prioridade = p;
        this.status = s;
    }

    public void setID(int id){
        this.ID = id;
    }
    public void setDescricao(String d){
        this.descricao = d;
    }
    public void setPrioridade(String p){
        this.prioridade = p;
    }
    public void setStatus(String  s){
        this.status = s;
    }
    public int getID(){
        return this.ID;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public String getPrioridade(){
        return this.prioridade;
    }
    public String getStatus(){
        return this.status;
    }

}
