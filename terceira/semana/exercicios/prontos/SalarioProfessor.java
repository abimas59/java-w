package terceira.semana.exercicios.prontos;

import java.util.Scanner;

public class SalarioProfessor {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int qtdHora =0;
        int nivelProfessor=0;
        float valorHora =0;
        System.out.println("Digite as horas trabalhadas");
        qtdHora = t.nextInt();
        System.out.println("Digite o nível do professor");
        nivelProfessor = t.nextInt();

        if(nivelProfessor == 1){
            valorHora = 12;
        }else if(nivelProfessor==2){
            valorHora = 17;
        }else if (nivelProfessor == 3 ){
            valorHora = 25;
        }
       
        float salario = valorHora*qtdHora;
        //System.out.print("Salário do professor nivel"+nivelProfessor+"salario: "+salario);
        System.out.printf("O salário do professor nivel %s, é de R$ %.2f",nivelProfessor,salario);

    }
}
