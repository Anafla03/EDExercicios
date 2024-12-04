package ifma.lista01;

public class Testar {
    public static void main(String[] args) {
        CadastrarAlunos alunos = new CadastrarAlunos(5);


        Aluno aluno1 = new Aluno(1, "101", "Francisca");
        Aluno aluno2 = new Aluno(2, "102", "Pedro");
        Aluno aluno3 = new Aluno(3, "103", "Joao");
        Aluno aluno4 = new Aluno(4, "104", "Paula");
        Aluno aluno5 = new Aluno(5, "105", "Bruno");


        alunos.adicionarNoInicio(aluno3);
        alunos.adicionarNoFinal(aluno4);
        alunos.adicionarNoInicio(aluno2);
        alunos.adicionarNoFinal(aluno1);
        alunos.adicionarNoInicio(aluno5);
        System.out.println(alunos);

        System.out.println("Depois de ordenar :");
        alunos.ordenarVetor();
        System.out.println(alunos);

        System.out.println("Removendo Aluno do indice 1 :");
        alunos.removerComIndice(1);
        System.out.println(alunos);

        System.out.println("Removendo Aluno do Inicio :");
        alunos.removerNoInicio();
        System.out.println(alunos);

        System.out.println("Removendo Aluno do Final :");
        alunos.removerNoFinal();
        System.out.println(alunos);






    }
}
