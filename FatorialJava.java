public class FatorialJava {

    public static int fatorial(int x ){
        if (x == 0){
            return 1;
        }else
        return x *fatorial(x-1);

    }
    public static void main(String[] args) {
        //fatorial(4);
        int aux = 1;
        //System.out.println(fatorial(6));
        for (int i = 6; i>=1; i--){
            aux = aux*i;
            System.out.println(i+".");

        }System.out.print(aux);
    }  
}
