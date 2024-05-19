import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        //int vet [] = new int [9];
        int vet [] = {1,5,6,7,8,4,3,5,10};
        dividir(0, 9, vet);
        for (int i = 0; i<=vet.length;i++){
            System.out.println(vet[i]);
        }
    }

    public static int  dividir(int comeco, int fim){
        int meio =0;

        meio = (comeco+fim)/2;
        System.out.println(meio);
        dividir(comeco, meio);
        dividir(meio+1, fim);
        
        return (comeco, meio,fim) ;
    }
    public static void juntar(int vet[],int comeco, int meio, int fim){
        int esquerda = comeco,direita = meio+1,contador=comeco;
        int aux [] = new int [9];
        for (int i = 0; i<= 9; i++){
            
            aux[i]= vet[i]; 
        }
        while (esquerda<=meio && direita<=fim){
            if(vet[esquerda]<vet[direita]){
            aux[contador] = vet[esquerda];
            esquerda++;
            }aux[contador] = vet[direita];
            direita++;
        }contador++;

        while (esquerda<=meio) {
            vet[esquerda] = aux[contador];
            esquerda++;
            contador++;
        }
        while (direita<=fim) {
           vet[direita] = aux[contador];
           direita++;
           esquerda++; 
        }
    }
    
    
}
