public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        //jeep.ligar();
        jeep.setChassi("6565464");
        Moto z750 = new Moto();
       

        Veiculo barril = z750;
        barril.ligar();

    }
    
}
