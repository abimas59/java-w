import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int parametroUm = t.nextInt();
        int parametroDois = t.nextInt();

        
        try {
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            // TODO Auto-generated catch block
            if (parametroUm>parametroDois){
                
                System.out.println("O número 2 deve ser menor que o numero 1");
            }
        }
        


   }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm<parametroDois){
            int contagem = parametroDois-parametroUm;
            for (int x = 0; x < contagem+1; x++)
            System.out.println(x);
        }else{
            //System.out.println("O numero 2 deve ser menor que o numero 1");
            
        }



    }
}
