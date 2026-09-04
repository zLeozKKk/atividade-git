package colecionaveis;

// VERSAO DO GITHUB
public class Livro extends Item {
    private String editora;

    public Livro(String id, String nome, String dataAquisicao, String editora) {
        super(id, nome, dataAquisicao);
        this.editora = editora;
    }

    @Override
    public void imprimirListagem() {
        System.out.println("LIVRO DO GITHUB: " + getNome());
    }
}
