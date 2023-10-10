package pacote;
public class LSENode {
    private Aluno info;
    private LSENode prox;

    public LSENode (Aluno info) {
        this.info = info;
    }   
    
    public void setInfo (Aluno info) {
        this.info = info;
    }        
    
    public void setProx (LSENode novoProx) {
        this.prox = novoProx;
    }   

    public Aluno getInfo() {
        return this.info;
    }

    public LSENode getProx () {
        return this.prox;
    }
}