package ifma.lista04;

public class Teste {
    public static void main(String[] args) {
        DequeList dequeList = new DequeList();

        Aluno aluno1 = new Aluno("Francisca", 10, 2);
        Aluno aluno2 = new Aluno("Pedro", 9, 3);
        Aluno aluno3 = new Aluno("Bruno", 8, 6);

        dequeList.addFirst(aluno3);
        dequeList.addFirst(aluno2);
        dequeList.addLast(aluno1);

        System.out.println("Alunos: ");
        System.out.println(dequeList);

        System.out.println("Pegando o primeiro aluno");
        System.out.println(dequeList.getFirst());
        System.out.println("Pegando o ultimo aluno");
        System.out.println(dequeList.getLast());
        System.out.println("Buscando o aluno Pedro");
        System.out.println(dequeList.search("Pedro"));

        System.out.println("Primeiro aluno removido: "+dequeList.removeFirst());
        System.out.println(dequeList);

        System.out.println("Ultimo aluno removido: "+dequeList.removeLast());
        System.out.println(dequeList);
    }
}
