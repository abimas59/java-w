import java.util.Scanner;

/**
 *
 * @author britt
 */
public class Pilha {

    
    public static boolean estaVazia(int topo){
        if (topo==0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean estaCheia(int topo){
        if(topo== 5){
            return true;
        }else {
            return false;
        }
    }
    public static void empilhar(String nome, String[]pilha, int indice){
        
        pilha[indice] = nome;
    }
    public static int desempilhar(String[]pilha, int topo){
        pilha[topo] = "";
        topo --;
        return topo;
    }
    public static void listar(int topo,String[]pilha){
        for( int indice = 0; indice<topo; indice++){
            if (pilha[indice]== ""){
                System.out.println("");
            }else {
                System.out.println("Nome: "+pilha[indice]+" posição: "+(indice+1));
            }
        }
    }
    public static void limparTodos(String[]pilha,int topo){
        for (int indice = 0; indice<topo; indice++){
            pilha[indice] = "";
        }
    }
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        String pilha[] = new String[5];
        int topo = 0, indice = 0, opcao = 0;
        String nome = "";
        boolean cheia, vazia;
        
        do{
        System.out.println("Escolha a opção");
        System.out.println("1 - EMPILHAR");
        System.out.println("2 - Desempilhar");
        System.out.println("3 - Limpar");
        System.out.println("4 - Listar");
        System.out.println("5 - Status");
        System.out.println("6 - Sair");
        opcao = t.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Digite o nome ");
                nome = t.next();
                empilhar(nome,pilha,indice);
                indice++;
                topo = indice;
               
                break;
            case 2:
                System.out.println("Desempilhando");
                topo = desempilhar(pilha,topo);
                indice --;
                
                break;
            case 3:
                System.out.println("Limpando");
                limparTodos(pilha,topo);
                indice = 0;
                break;
            case 4:
                System.out.println("Listando");
                listar(topo,pilha);
                break;
            case 5:
                System.out.println("Status");
                System.out.println("Vazia: "+estaVazia(topo));
                System.out.println("Cheia: "+estaCheia(topo));
                break;
            case 6:
                System.out.println("Encerrando programa");
                break;
            default:
                System.out.println("Opção inválida");
                
                    
        }
        }while (opcao != 6);
        
        
    }
    
}
