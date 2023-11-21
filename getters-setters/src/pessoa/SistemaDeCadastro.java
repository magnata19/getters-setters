package pessoa;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("123", "Davidson");

        pessoa.setEndereco("RUA DAS ÁGUAS");

        System.out.println(pessoa.getNome() + "-" + pessoa.getCpf());
    }
}
