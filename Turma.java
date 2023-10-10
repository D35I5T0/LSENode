package pacote;
public class Turma {
    public static void main(String[] args) {
        LSEAluno turma = new LSEAluno();
        LSEAluno aprovados = new LSEAluno();
        LSEAluno reprovados = new LSEAluno();
        Aluno aluno1 = new Aluno("15", "Abraão", 8, 0);
        Aluno aluno2 = new Aluno("20", "Bernardo", 6, 0);
        Aluno aluno3 = new Aluno("20", "Bernardo", 6, 0);
        Aluno aluno4 = new Aluno("25", "Carlos", 7, 0);

        turma.inserirNoFinalSemRepetidos(aluno1);
        turma.inserirNoFinalSemRepetidos(aluno2);
        turma.inserirNoFinalSemRepetidos(aluno3);
        turma.inserirNoFinalSemRepetidos(aluno4);

        turma.listaAlunosAprovadosEReprovados(aprovados, reprovados);

        System.out.println("Turma total: ");
        turma.exibirTodos();
        System.out.println("Aprovados: ");
        aprovados.exibirTodos();
        System.out.println("Reprovados: ");
        reprovados.exibirTodos();
    }
}
