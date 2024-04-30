package terceira.semana.exercicios.prontos;

import java.util.Scanner;

public class OperacoesAritimeticas {
    public static void main(String[] args) {
        try{
        Scanner t = new Scanner(System.in);
        double a =0;
        double b = 0;
        char operador;

        System.out.println("Digite o primeiro numero");
        a = t.nextDouble();
        System.out.println("Digite o segundo número");
        b = t.nextDouble();
        System.out.println("Digite a operação");
        operador = t.next().toLowerCase().charAt(0);
        if (operador == 'x'){
            System.out.println(a*b);
        }else if(operador =='/'){
           System.out.println(dividir(a,b)); 
        }else if (operador == '-'){
            System.out.println(subtrair(a, b));
            
        }else if (operador =='+'){
            System.out.println(somar(a, b)); 
        }else {
            System.out.println("Operador não definido");
        }
        }catch(ArithmeticException e){
            System.err.println("Erro "+e.getMessage());
            
        }
    }
    public static double dividir(double a,double b)throws ArithmeticException{
       if(b == 0){
        throw new ArithmeticException("Dividir por zero");
       }else{
        return a/b;
       }
    }
    public static double somar(double a,double b){
        return a+b;
    }
    public static double subtrair(double a, double b){
        return a-b;
    }
}
