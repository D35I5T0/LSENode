package pacote;
public class LSEAluno {
    private LSENode primeiro;

    public boolean isEmpty () {
        return (this.primeiro == null);
    }

    public void exibirTodos() {
        LSENode aux;
        if (!isEmpty()) {
            aux = this.primeiro;
            while(aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }   
        }
        else {
            System.out.println("A lista está vazia");
        }      
    }
    
    public void inserirNoFinalSemRepetidos (Aluno valor) {
        LSENode novo, aux;
        novo = new LSENode(valor);
        if (isEmpty()) {
            this.primeiro = novo;
        } 
        else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(valor) == 0) {
                    System.out.println("Valor repetido. Inserção não efetuada!");
                    break;
                }
                else if (aux.getProx() == null) {
                    aux.setProx(novo);
                    break;
                }
                else {
                    aux = aux.getProx();
                }
            }
        }
    }

    public void listaAlunosAprovadosEReprovados (LSEAluno listaAprovados, LSEAluno listaReprovados) {
        LSENode aux = this.primeiro;
        if (isEmpty()) {
            System.out.println("A lista de alunos está vazia");
        }
        else {
            while (aux != null) {
                Aluno novo = aux.getInfo();
                if (novo.getMedia() >= 7) {
                    listaAprovados.inserirNoFinalSemRepetidos(novo);
                }
                else {
                    listaReprovados.inserirNoFinalSemRepetidos(novo);
                }
                aux = aux.getProx();
            }
        }
    }
}
