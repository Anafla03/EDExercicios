package ifma.lista03;

public class Teste {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();
        lista.adicionarInicio(1);
        lista.adicionarFinal(2);
        lista.adicionarInicio(3);
        lista.adicionarFinal(4);
        lista.adicionarFinal(5);
        System.out.println(lista);

        int maior = lista.maior();
        System.out.println("Maior Valor: " + maior);

        int menor = lista.menor();
        System.out.println("Menor Valor: " + menor);

        double mediaElementos = lista.media();
        System.out.printf("Media Elementos: %.2f \n", mediaElementos);

        int saida = 0;
        saida = lista.removerFinal();
        System.out.println("Elemento Removido do Final: " + saida);
        System.out.println(lista);

        saida = lista.removerInicio();
        System.out.println("Elemento Removido do Começo: " + saida);
        System.out.println(lista);



    }


}
