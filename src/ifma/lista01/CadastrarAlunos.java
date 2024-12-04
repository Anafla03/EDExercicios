package ifma.lista01;

import java.util.Arrays;

public class CadastrarAlunos {
    private int tamanho;
    private int tamanhoMax;
    private Aluno[] alunos ;

    public CadastrarAlunos(int tamanho) {
        alunos = new Aluno[tamanho] ;
        this.tamanho = 0 ;
        tamanhoMax = tamanho ;
    }

    public void adicionarNoFinal(Aluno aluno){
        if(tamanho == tamanhoMax){
            throw new RuntimeException("Vetor Cheio");
        }
        alunos[tamanho] = aluno ;
        tamanho++ ;
    }

    public void adicionarNoInicio(Aluno aluno){
        if(tamanho == tamanhoMax){
            throw new RuntimeException("Vetor Cheio");
        }
        for(int i = tamanho; i>0; i--){
            alunos[i]= alunos[i-1];
        }
        alunos[0] = aluno;
        tamanho++;
    }

    public void removerNoFinal(){
        if(tamanho == 0){
            throw new RuntimeException("Vetor Vazio");
        }
        alunos[tamanho -1] = null;
        tamanho--;
    }

    public void removerNoInicio(){
        if(tamanho == 0){
            throw new RuntimeException("Vetor Vazio");
        }
        for(int i = 0; i < tamanho; i++){
            alunos[i]= alunos[i+1];
        }
        alunos[tamanho -1] = null;
        tamanho--;
    }

    public boolean verificarIndice(int indice){
        return indice >= 0 && indice < tamanho;
    }

    public void removerComIndice(int indice){
        if(tamanho == 0){
            throw new RuntimeException("Vetor Vazio");
        }
        if(verificarIndice(indice)){
            if(indice == 0){
                removerNoInicio();
            }else if(indice == tamanho -1){
                removerNoFinal();
            }else {
                for(int i = indice; i < tamanho; i++){
                    if(i + 1 != tamanho){
                        alunos[i] = alunos[i + 1];
                    } else if (i + 1 == tamanho) {
                        alunos[i] = null;
                    }
                }
                alunos[tamanho -1] = null;
                tamanho--;
            }
        }else {
            throw new RuntimeException("Indice Invalido");
        }
    }

    public void ordenarVetor(){
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                if(alunos[j].getCodigo() > alunos[i].getCodigo()){
                    Aluno temp = alunos[j];
                    alunos[j] = alunos[i];
                    alunos[i] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "CadastrarAlunos{" +
                "tamanho=" + tamanho +
                ", tamanhoMax=" + tamanhoMax +
                ", alunos=" + Arrays.toString(alunos) +
                '}';
    }
}
