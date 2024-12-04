package ifma.lista04;

public class Aluno {
    String nome;
    double n1;
    double n2;

    Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.n1 = nota1;
        this.n2 = nota2;
    }

    @Override
    public String toString() {
        return "(" + nome + ", "+ n1 + ", "+ n2 + ")";
    }
}
