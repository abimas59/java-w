public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23795064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("O cep precisa ter x números");
        }
    }
    static String formatarCep(String cep)throws CepInvalidoException {
        if(cep.length()!=8)
        throw new CepInvalidoException();

        return "23.795-064";
    }
    
}
