package ifma.lista03;

public class Node {
    private int elemento;
    private Node proximo;

    public Node(Node proximo, int elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Node(int elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        if (proximo != null) {
            return elemento + " , " + proximo;
        }else if(proximo == null) {
            return elemento + "";
        }
        return "";
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
