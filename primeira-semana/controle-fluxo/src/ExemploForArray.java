public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE","JONAS","JULIA","JOÃO"};
        /*
        for (int x = 0; x <alunos.length; x++){
            System.out.println("O aluno no índice x: "+x+" é "+alunos[x]);

        } */
        for (String aluno : alunos){
            System.out.println("nome do aluno é "+aluno);
        }
        
    }
    
}
