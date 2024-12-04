package ifma.lista02;

public class Main {
    public static void main(String[] args) {
//        q01();
//        q02();
//        q03();
//        q04();
//        q05();
//        q06();
//        q07();
//        q08();
//        q09();
//        q10();
//        q11();
//        q12();
//        q13();
//        q14();
//        q15();
//        q16();
//        q17();
//        q18();

    }

    static void imprimir(int [][] matriz){
        for (int[] ints : matriz) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    static void q01(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j){
                    matriz[i][j] = 0;
                }
            }
        }
        imprimir(matriz);

    }

    static void q02(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == (matriz.length - 1) - j){
                    matriz[i][j] = 0;
                }
            }
        }
        imprimir(matriz);
    }

    static void q03(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == (matriz.length - 1) - j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    static void q04(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == (matriz.length - 1) - j){
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println(soma);
    }

    static void q05(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.print("[ ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i >= (matriz.length - 1) - j){
                    System.out.print(matriz[i][j] + ", ");

                }
            }
        }
        System.out.println("]");
    }

    static void q06(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int soma = 0;
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i >= (matriz.length - 1) - j){
                    soma += matriz[i][j];
                    cont++;
                }
            }
        }
        double media = (double) soma/cont;
        System.out.println(media);
    }

    static void q07(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.print("[ ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i > (matriz.length - 1) - j){
                    System.out.print(matriz[i][j] + ", ");
                }
            }
        }
        System.out.println("]");
    }

    static void q08(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i > (matriz.length - 1) - j) {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                    }
                }
            }
        }
        System.out.println(maior);
    }

    static void q09(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.print("[ ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i <= (matriz.length - 1) - j){
                    System.out.print(matriz[i][j] + ", ");
                }
            }
        }
        System.out.println("]");
    }
    static void q10(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int menor = matriz[0][matriz.length - 1];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i <= (matriz.length - 1) - j) {
                    if (matriz[i][j] < menor) {
                        menor = matriz[i][j];
                    }
                }
            }
        }
        System.out.println(menor);
    }

    static void q11(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.print("[ ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < (matriz.length - 1) - j){
                    System.out.print(matriz[i][j] + ", ");
                }
            }
        }
        System.out.println("]");
    }

    static void q12(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int produto = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < (matriz.length - 1 - j)) {
                    produto *= matriz[i][j];
                }
            }
        }
        System.out.println(produto);
    }

    static void q13(){
        int [][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][] matrizB = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0){
                    matrizB[i][j] = (int) Math.pow(matriz[i][j], 2);
                } else {
                    matrizB[i][j] = (int) Math.pow(matriz[i][j], 3);
                }
            }
        }
        imprimir(matrizB);
    }

    static void q14() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length - 1; j >= 0 ; j--) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void q15(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void q16() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void q17(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0 || j == matriz.length - 1){
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void q18(){
        int [][] matriz = {
                {1,2},
                {3,4},
                {5,6}
        };
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
