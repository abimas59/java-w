import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int [] numeros = new int [5];
        int [] aux = new int [5];
        int i = 0;
        
        for (i = 0; i<5;i++){
            System.out.println("Informe o numero");    
            numeros[i] = t.nextInt();
        }
        mostrarVetor(numeros);
        dividir(numeros,aux,0,4);
        System.out.println();
        mostrarVetor(numeros);
        t.close();
    }
    public static void mostrarVetor(int[] vet) {
        for (int i = 0; i<5; i++){
            System.out.print(vet[i]+"|");
        }
    }
    public static void dividir(int vet[], int aux[],int comeco, int fim) {
        if(comeco<fim){
            int meio = (comeco+fim)/2;
            dividir(vet,aux,comeco, meio);
            dividir(vet,aux,meio+1, fim);
            juntar(vet,aux,comeco,meio,fim);
        }

    }
    public static void juntar(int []vet, int[] aux,int comeco, int meio, int fim){
        int esquerda,direita,contador;
        esquerda = comeco;
        direita = meio +1;
        contador = comeco;
        //carregar vetor
        for(int i = 0; i<5;i++) {
            aux[i]=vet[i];
        }

        while(esquerda<=comeco && direita<=fim){
            if(aux[esquerda]<aux[direita]){
                vet[contador] = aux[esquerda];
                esquerda++;
            }else {
                vet[contador] = aux[direita];
                direita++;
            }contador++;
        }
        
        while (esquerda<=meio) {
            vet[contador] = aux[esquerda];
            esquerda++;
            contador++;
            
        }
        while (direita<=fim) {
            vet[contador] = aux[direita];
            direita++;
            contador++;
        }
    }
}
