public class FatorialJava {

    public static int fatorial(int x ){
        if (x == 0){
            return 1;
        }else
        return x *fatorial(x-1);

    }
    public static void main(String[] args) {
        //fatorial(4);
        System.out.println(fatorial(6));
    }
}
