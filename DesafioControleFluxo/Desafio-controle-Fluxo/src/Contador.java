import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int parametroUm = t.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametroDois = t.nextInt();

        
        try {
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            // TODO Auto-generated catch block
            if (parametroUm>parametroDois){
                
                System.out.println("O segundo número deve ser maior que o primeiro");
            }
        }
        t.close();


   }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroDois<parametroUm) {
            throw  new ParametrosInvalidosException();
            
        }
        else{
    
            int contagem = parametroDois-parametroUm;
            System.out.println("Contando");
            for (int x = 0; x < contagem+1; x++)
            System.out.println(x);
        }
            //System.out.println("O numero 2 deve ser menor que o numero 1");
            
        }



    
}
