package ifma.lista03;

public class SimpleList {
    private Node head;
    private Node tail;
    private int tamanho;

    public SimpleList() {
        this.head = null;
        this.tail = null;
        this.tamanho = 0;
    }

    public void adicionarInicio(int elemento) {
        Node novo = new Node(elemento);
        if (this.head == null) {
            this.head = novo ;
            this.tail = this.head;
        } else {
            novo.setProximo(this.head);
            this.head = novo;
        }
        this.tamanho++;
    }

    public void adicionarFinal(int elemento) {
        Node novo = new Node(elemento);
        if (this.head == null) {
            adicionarInicio(elemento);
        } else {
            this.tail.setProximo(novo);
            this.tail = novo;
        }
        this.tamanho++;
    }

    public int removerInicio() {
        if (this.head == null) {
            throw new RuntimeException("Lista vazia");
        }
        int elemento = this.head.getElemento();
        this.head = this.head.getProximo();
        this.tamanho--;
        return elemento;
    }

    public int removerFinal() {
        if (this.head == null) {
            throw new RuntimeException("Lista vazia");
        }
        int elemento = this.tail.getElemento();
        Node atual = this.head;
        while (atual.getProximo() != this.tail) {
            atual = atual.getProximo();
        }
        atual.setProximo(null);
        this.tail = atual;
        this.tamanho--;
        return elemento;
    }

    public int maior() {
        if (this.head == null) {
            throw new RuntimeException("Lista vazia");
        }
        int maior = this.head.getElemento();
        Node atual = this.head.getProximo();
        while (atual != null) {
            if (atual.getElemento() > maior) {
                maior = atual.getElemento();
            }
            atual = atual.getProximo();
        }
        return maior;
    }

    public int menor() {
        if (this.head == null) {
            throw new RuntimeException("Lista vazia");
        }
        int menor = this.head.getElemento();
        Node atual = this.head.getProximo();
        while (atual != null) {
            if (atual.getElemento() < menor) {
                menor = atual.getElemento();
            }
            atual = atual.getProximo();
        }
        return menor;
    }

    public double media() {
        if (this.head == null) {
            throw new RuntimeException("Lista vazia");
        }
        int soma = 0;
        Node atual = this.head;
        while (atual != null) {
            soma += atual.getElemento();
            atual = atual.getProximo();
        }
        return (double) soma / this.tamanho;
    }


    @Override
    public String toString() {
        return "[" + head + "]";
    }
}

