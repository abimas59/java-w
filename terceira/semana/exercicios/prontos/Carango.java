package terceira.semana.exercicios.prontos;

import java.util.Scanner;

public class Carango {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double desconto = 0;
        double margem = 0;
        System.out.println("Digite o valor do veículo");
        double valorVeiculo = t.nextDouble();
        double totalPago;
        System.out.println("Digite o tipo do veículo");
        char tipoCombustivel = t.next().toUpperCase().charAt(0);
        
        if(tipoCombustivel =='G'){
            margem = (0.21f);
        }else if (tipoCombustivel =='A'){
            margem = (0.25f);
        }else if (tipoCombustivel =='D'){
            margem = (0.14f);
        }

        desconto = valorVeiculo*margem;
        
        
        totalPago = (valorVeiculo-desconto);
       
        System.out.printf("O valor a ser pago é%.2f com %.2f %% de desconto",totalPago,desconto);


    }

}
