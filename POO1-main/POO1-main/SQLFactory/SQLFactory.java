public class SQLFactory{
    public static void main(String[] args){

        Aluno aluno = new Aluno();
        
        if (Database.abrirID(aluno, 2)) {
           System.out.println("Nome: " + aluno.nome + ", Idade: " + aluno.idade + ", Cidade: " + aluno.cidade + ", UF" + aluno.uf );
        }
        //Aluno aluno1 = new Aluno();

        //if (Database.abrirID(aluno1, 1)) {
        //     System.out.println("Nome: " + aluno1.nome + ", Idade: " + aluno1.idade + ", Cidade: " + aluno1.cidade + ", UF" + aluno1.uf );      
        //}


        
    }
}