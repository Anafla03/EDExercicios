package ifma.lista04;

public class DequeList {
    Node head;
    Node trailer;
    int size;

    public DequeList() {
        head = new Node();
        trailer = new Node();
        size = 0;
        head.next = trailer;
        trailer.previous = head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(Aluno aluno) {
        Node primeiro = head.next;
        Node novo = new Node(aluno);

        novo.next = primeiro;
        novo.previous = head;

        primeiro.previous = novo;
        head.next = novo;

        size++;
    }

    public void addLast(Aluno aluno){
        Node ultimo = trailer.previous;
        Node novo = new Node(aluno);

        novo.next = trailer;
        novo.previous = ultimo;

        ultimo.next = novo;
        trailer.previous = novo ;

        size++;
    }

    public Node getFirst() {
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        return head.next;
    }
    public Node getLast() {
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        return trailer.previous;
    }

    public Node removeFirst(){
        Node primeiro = getFirst();
        if(primeiro == null){
            head.next = trailer;
        }
        else{
            head.next = primeiro.next;
            size--;
        }

        return primeiro;
    }

    public Node removeLast(){
        if(size <= 1){
            return removeFirst();
        }
        Node ultimo = getLast();
        Node penultimo = ultimo.previous;

        penultimo.next = trailer;
        trailer.previous = penultimo;

        size--;

        return ultimo;
    }

    public Node search(String nome){
        Node atual = getFirst();

        for (int i = 0; i < size; i++) {
            if(atual.aluno.nome.equals(nome)){
                return atual;
            }
            atual = atual.next;
        }

        throw new RuntimeException("Aluno " + nome +  " não foi encontrado");
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "[]";
        }
        Node node = head.next;
        StringBuilder S = new StringBuilder("[" + node.aluno);
        node = node.next;
        while(node != trailer){
            S.append(", ").append(node.aluno);
            node = node.next;
        }
        return S + " ]" ;
    }
}
