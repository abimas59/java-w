
import java.util.Scanner;

public class Reserva {
    static Scanner t = new Scanner(System.in);
    //atributos
    private int numeroAviao;
    private String nomePassageiro;
    public Reserva [] r = new Reserva[19];

    public void registrarAviao(int [] plane) {
        for (int i = 0; i<=3; i++){
            System.out.printf("Informe o numero do %s aviao",i+1);
            plane[i] = t.nextInt();
        }
    }
    public void registrarAssentos(int [] sit ) {

        for (int i = 0; i<=3; i++){
            System.out.printf("Informe a quantidade de assentos do aviao %s",i+1);
            sit[i] = t.nextInt();

        }
    }
    public void fazerReserva(int[] plane,int [] sit,int a,int b, int c, int d) {
        System.out.println("Informe o numero do aviao");
        int nVoo = t.nextInt();

        if ((nVoo == plane[0]) && (a <=4)) {
            System.out.println("Informe o nome do passageiro");
            r[a].nomePassageiro = t.next();
            r[a].numeroAviao = 1;
            sit[0]--;
            a++;
        }else if((nVoo == plane[1]) && (b <= 9)) {
            System.out.println("Informe o nome do passageiro");
            r[b].nomePassageiro = t.next();
            r[b].numeroAviao = 2;
            sit[1]--;
            b++;
        }else if ((nVoo == plane[2]) && (c <= 14)){
            System.out.println("Informe o nome do passageiro");
            r[c].nomePassageiro = t.next();
            r[c].numeroAviao = 2;
            sit[2]--;
            c++;
        }else if((nVoo == plane[3]) && (d <= 19)){
            System.out.println("Informe o nome do passageiro");
            r[d].nomePassageiro = t.next();
            r[d].numeroAviao = 1;
            sit[3]--;
            d++;
        }else
            System.out.println("Este avião não existe! Ou está Lotado!");

    }
    public void consultarAviao(int[] plane) {
        System.out.println("Informe o número do avião");
        int nPlane = t.nextInt();
        System.out.println("RESERVAS");
        if ((nPlane == plane[0])){
            if(r[0].nomePassageiro.isEmpty() && r[4].nomePassageiro.isEmpty()){
                System.out.println("Não há reservas realizadas para este avião!");
            }
            for (int i = 0; i<=4; i++){
                if(r[i].nomePassageiro.isEmpty()){
                    System.out.println();
                }else{
                    System.out.println("Nome: "+r[i].nomePassageiro);
                }
            }
        } else if((nPlane == plane[1])){
            if(r[5].nomePassageiro.isEmpty() && r[9].nomePassageiro.isEmpty()){
                System.out.println("Não há reservas realizadas para este avião!");
            }
            for (int i = 5; i<=9; i++) {
                if (r[i].nomePassageiro.isEmpty()) {
                    System.out.println();
                } else {
                    System.out.println("Nome: " + r[i].nomePassageiro);
                }
            }
            }else if((nPlane == plane[2])){
            if(r[10].nomePassageiro.isEmpty() && r[14].nomePassageiro.isEmpty()){
                System.out.println("Não há reservas realizadas para este avião!");
            }
            for (int i = 10; i<=14; i++) {
                if (r[i].nomePassageiro.isEmpty()) {
                    System.out.println();
                } else {
                    System.out.println("Nome: " + r[i].nomePassageiro);
                }
            }
        }else if((nPlane == plane[3])){
            if(r[15].nomePassageiro.isEmpty() && r[19].nomePassageiro.isEmpty()){
                System.out.println("Não há reservas realizadas para este avião!");
            }
            for (int i = 15; i<=19; i++) {
                if (r[i].nomePassageiro.isEmpty()) {
                    System.out.println();
                } else {
                    System.out.println("Nome: " + r[i].nomePassageiro);
                }
            }
        }else {
            System.out.println("Este avião não existe!");
        }

    }
    public void consultarPassageiro() {

    }
    public  void assentosDisponiveis(int [] sit) {
        int soma = sit[0]+sit[1]+sit[2]+sit[3];
        if (soma== 0){
            System.out.println();
        }else {
            System.out.println(soma+" Lugares disponíveis");
            System.out.println("Voo I: "+sit[0]+"Voo II: "+sit[1]+"Voo III: "+sit[2]+
                    "Voo IV: "+sit[3]);
        }
    }

    public static void main(String[] args) {
        Reserva r = new Reserva();
        int a = 0,b=5,c =10,d=15;
        int [] plane = new int[4];
        int [] sit = new int [4];
        int [] checkin = new int[20];
        int opcao =0;
        do {
            System.out.println("MENU:");
            r.assentosDisponiveis(plane);
            System.out.println("[1]Registrar o número de cada avião\n[2]Registrar o+" +
                    " quantitativo de assentos disponíveis em cada avião.\n[3]Reservar passagem aérea." +
                    "\n[4]Realizar consulta por avião.\n[5]Realizar consulta por passageiro\n[6]" +
                    "Encerrar");
            opcao = t.nextInt();
            switch (opcao) {
                case 1:
                    r.registrarAviao(plane);
                    break;
                case 2:
                    r.registrarAssentos(sit);
                    break;
                case 3:
                    r.fazerReserva(plane, sit, a, b, c, d);
                    break;
                case 4:
                    r.consultarAviao(plane);
                    break;
                case 5:
                    r.consultarPassageiro();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(opcao != 6);
    }
}


