import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
	Scanner leitor = new Scanner(System.in);
    System.out.println("digite quantas vezes");
    	int N = leitor.nextInt();
    	String jogador1, jogador2;
// TODO: complete os espaços em branco com sua solução para o problema
    	for (int i = 0; i < N; i++) {
            System.out.println("primeira jogada");
    		jogador1 = leitor.next();
    		jogador2 = leitor.next();
    		if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) {System.out.println("Aniquilacao mutua");}
    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
    		else if (jogador1.equalsIgnoreCase("ataque")&& jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
    		else if (jogador1.equalsIgnoreCase("ataque")&& jogador2.equalsIgnoreCase("pedra")) System.out.println("Jogador 1 venceu");
    		else if (jogador1.equalsIgnoreCase("papel")&& jogador2.equalsIgnoreCase("pedra")) System.out.println("Jogador 2 venceu");
    		else if (jogador1.equalsIgnoreCase("papel")&& jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
    		else if (jogador1.equalsIgnoreCase("pedra")&& jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador2 venceu");
    		else if (jogador1.equalsIgnoreCase("pedra")&& jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
    		else if (jogador1.equalsIgnoreCase("pedra")&& jogador2.equalsIgnoreCase("pedra")) System.out.println("Sem ganhador");
    		//else System.out.println("Sem ganhador");
    		    }
}
}
