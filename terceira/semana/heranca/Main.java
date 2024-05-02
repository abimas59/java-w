package terceira.semana.heranca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Motorista m = new Motorista();
        Vendedor v = new Vendedor();
        v.setNome("Abimael");
        v.setCpf("05989999577");
        v.setSalario(1800f);
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        System.out.println("O salario do vendedor é : "+v.calcularSalario());
        
        

    }
}
