package terceira.semana.exercicios.prontos;

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float aumento = 0;
        for (int i =0; i<=548;i++){
        System.out.println("Informe o nome do funcionario");
        String nome = t.next();
        System.out.println("Informe o salário do funcionario");
        float salarioFuncionario = t.nextFloat();
        System.out.println("informe o salário mínimo");
        float salarioMinimo = t.nextFloat();
        if (salarioFuncionario<= (3*salarioMinimo)){
            aumento = 0.50f;
        }else if ( salarioFuncionario <=(10*salarioMinimo)){
            aumento = 0.20f;
        }else if (salarioFuncionario <= (20*salarioMinimo)){
            aumento = 0.15f;
        }else {
            aumento = 0.10f;
        }
        float reajuste = salarioFuncionario*aumento;
        float novoSalario = salarioFuncionario+reajuste;
        float folhaPagamento =0;
        System.out.println("Funcionario: "+nome+"Reajuste de: "+reajuste+"Novo salário:R$"+novoSalario);
        folhaPagamento += novoSalario;
        System.out.println("Folha de pagamento atual -> total:R$"+folhaPagamento);
    }
        
    }

}
