package terceira.semana.exercicios.prontos;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int numeros[] = new int [3];
        int aux = 0;
        for(int i =0; i<=2; i++){
            System.out.printf("Digite o %d numero",i+1);
            numeros[i] = t.nextInt();
           
         }
         for (int j =0;j<=2;j++){
            for (int k = 0; k<=2;k++){
                if(numeros[j]<numeros[k]){
                    aux = numeros[k];
                    numeros[k] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
         for (int i = 0 ; i<=2; i++){
            System.out.print(numeros[i]+" ");
         }
    }

}
