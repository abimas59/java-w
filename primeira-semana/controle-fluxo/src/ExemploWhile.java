import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            System.out.println("Doce de "+valorDoce+" R$, adicionado ao carrinho");
            mesada = mesada - valorDoce;
            
        }
        System.out.println("Gastou toda mesada com doces");
        
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,10);
    }
}
