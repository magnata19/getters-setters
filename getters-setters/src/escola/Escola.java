package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Davidson");
        aluno.setIdade(23);
        System.out.println("Nome do aluno: " + aluno.getNome() + "\nIdade do aluno: " + aluno.getIdade());

    }
}