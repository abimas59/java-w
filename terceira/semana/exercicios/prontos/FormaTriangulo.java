package terceira.semana.exercicios.prontos;

import java.util.Scanner;

public class FormaTriangulo {
    public static void main(String[] args) {
        int lado[]= new int [3];
        Scanner t = new Scanner(System.in);
        
        for(int i = 0; i<=2;i++){
            System.out.printf("Digite o tamanho do lado %d",i+1);
            lado[i] = t.nextInt();
        }
        if(lado[0]>(lado[1]+lado[2])||lado[1]>(lado[2]+lado[0])||lado[2]>(lado[1]+lado[0])){
            System.out.println("Não forma triangulo");
        }else if(lado[0]==lado[1] && lado[1]==lado[2]){
            System.out.println("Forma triangulo equilatero");
        }else if (lado[0]==lado[1] || lado[2]==lado[1]|| lado[0] == lado[2]){
            System.out.println("Forma isóceles");
        }else {
            System.out.println("Forma escaleno");
        }
        

    }

}
