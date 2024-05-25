
import java.util.Scanner;
class Reserva {

    private int numeroAviao;
    private String nomePassageiro;
}

public class GerenciamentoAereo {
    static Scanner t = new Scanner(System.in);
    //atributos
    private int numeroAviao;
    private String nomePassageiro;
     
    public int getNumeroAviao() {
        return numeroAviao;
    }

    public void setNumeroAviao(int numeroAviao) {
        this.numeroAviao = numeroAviao;
    }
    public String getNomePassageiro() {
        return nomePassageiro;
    }
    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }
    public static void registrarAviao(int [] plane) {
        for (int i = 0; i<=3; i++){
            System.out.printf("Informe o numero do %s aviao: ",i+1);
            plane[i] = t.nextInt();
        }
    }
    public static void registrarAssentos(int [] sit ) {

        for (int j = 0; j<=3; j++){
            System.out.printf("Informe a quantidade de assentos do aviao %s ",j+1);
            sit[j] = t.nextInt();

        }
    }
    public static void fazerReserva(int[] plane,int [] sit,int a,int b, int c, int d,GerenciamentoAereo[] checkin) {
        System.out.println("Informe o numero do aviao: ");
        int nVoo = 0;
        nVoo = t.nextInt();

        if ((nVoo == plane[0]) && (a <sit[0])) {
            System.out.println("Informe o nome do passageiro: ");
            checkin[a].nomePassageiro = t.next();            //this.r[a].setNomePassageiro(t.next());;
            checkin[a].numeroAviao = 1;
            sit[0]--;
            a++;
        }else if((nVoo == plane[1]) && (b <sit[1]+5)) {
            System.out.println("Informe o nome do passageiro");
            checkin[b].nomePassageiro = t.next();
            checkin[b].numeroAviao = 2;
            sit[1]--;
            b++;
        }else if ((nVoo == plane[2]) && (c < sit[2]+10)){
            System.out.println("Informe o nome do passageiro");
            checkin[c].nomePassageiro = t.next();
            checkin[c].numeroAviao = 2;
            sit[2]--;
            c++;
        }else if((nVoo == plane[3]) && (d < sit[3]+15)){
            System.out.println("Informe o nome do passageiro");
            checkin[d].nomePassageiro = t.next();
            checkin[d].numeroAviao = 1;
            sit[3]--;
            d++;
        }else
            System.out.println("Este avião não existe! Ou está Lotado!");

    }
    public static void consultarAviao(int[] plane,GerenciamentoAereo[] checkin) {
        System.out.println("Informe o número do avião: ");
        int nPlane = t.nextInt();
        System.out.println("RESERVAS");

        if ((nPlane == plane[0])){
            if(checkin[0].nomePassageiro == "" && checkin[4].nomePassageiro.equalsIgnoreCase("")){
                System.out.println("Não há reservas realizadas para este avião!: ");
            }
            for (int i = 0; i<=4; i++){
                if(checkin[i].nomePassageiro.equalsIgnoreCase("")){
                   
                }else{
                    System.out.println("Nome: "+checkin[i].getNomePassageiro());
                }
            }
        } else if((nPlane == plane[1])){
            if(checkin[5].nomePassageiro.isEmpty() && checkin[9].nomePassageiro.isEmpty()){
                System.out.println("Não há reservas realizadas para este avião!");
            }
            for (int i = 5; i<=9; i++) {
                if (checkin[i].nomePassageiro.isEmpty()) {
                   
                } else {
                    System.out.println("Nome: " + checkin[i].nomePassageiro);
                }
            }
            }else if((nPlane == plane[2])){
            if(checkin[10].nomePassageiro.isEmpty() && checkin[14].nomePassageiro.isEmpty()){
                System.out.println("Não há reservas realizadas para este avião!");
            }
            for (int i = 10; i<=14; i++) {
                if (checkin[i].nomePassageiro.isEmpty()) {
                    
                } else {
                    System.out.println("Nome: " + checkin[i].nomePassageiro);
                }
            }
        }else if((nPlane == plane[3])){
            if(checkin[15].nomePassageiro.isEmpty() && checkin[19].nomePassageiro.isEmpty()){
                System.out.println("Não há reservas realizadas para este avião!");
            }
            for (int i = 15; i<=19; i++) {
                if (checkin[i].nomePassageiro.isEmpty()) {
                   
                } else {
                    System.out.println("Nome: " + checkin[i].nomePassageiro);
                }
            }
        }else {
            System.out.println("Este avião não existe!");
        }

    }
    public static void consultarPassageiro(GerenciamentoAereo[] checkin) {
            String nome ="";    
            System.out.println("Informe o nome do passageiro");
            nome = t.next();
            for (int i = 0; i<=19; i++){
            if(nome.equalsIgnoreCase(checkin[i].nomePassageiro)){
                System.out.println("Reserva encontrada");
                System.out.println("Avião "+checkin[i].numeroAviao+"| Passageiro: "+checkin[i].nomePassageiro);
            }else if (checkin[i].nomePassageiro.equalsIgnoreCase("")){

            }else {
                System.out.println("Não há reservas realizadas para este passageiro!");
            }
            }
    }
    public static  void assentosDisponiveis(int [] sit) {
        int soma=0;// = sit[0]+sit[1]+sit[2]+sit[3];
        for(int i = 0; i<=3; i++){
            soma=soma+sit[i];
        }
        if (soma == 0){
        }else {
            System.out.println(soma+" Lugares disponíveis");
            System.out.println("Voo I: "+sit[0]+"Voo II: "+sit[1]+"Voo III: "+sit[2]+
                    "Voo IV: "+sit[3]);
        }
    }

    public static void main(String[] args) {
        //GerenciamentoAereo robjeto = new GerenciamentoAereo();
        GerenciamentoAereo [] checkin = new GerenciamentoAereo[20];
        for (int i = 0; i<=19; i++){
            checkin[i] = new GerenciamentoAereo();
            checkin[i].nomePassageiro = "";
        }
        int a = 0,b=5,c =10,d=15;
        int [] plane = new int[4];
        int [] sit = new int [4];
        int opcao =0;
        do {
            System.out.println("MENU:");
            assentosDisponiveis(sit);
            System.out.println("[1]Registrar o número de cada avião\n[2]Registrar o" +
                    " quantitativo de assentos disponíveis em cada avião.\n[3]Reservar passagem aérea." +
                    "\n[4]Realizar consulta por avião.\n[5]Realizar consulta por passageiro\n[6]" +
                    "Encerrar");
            opcao = t.nextInt();
            switch (opcao) {
                case 1:
                    //robjeto.registrarAviao(plane);
                    registrarAviao(plane);
                    break;
                case 2:
                    registrarAssentos(sit);
                    break;
                case 3:
                    fazerReserva(plane, sit, a, b, c, d,checkin);
                    break;
                case 4:
                    consultarAviao(plane,checkin);
                    break;
                case 5:
                    consultarPassageiro(checkin);
                    break;
                case 6:
                    System.out.println("Encerrando! Obrigado por usar!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(opcao != 6);
    }
    t.close();
}
