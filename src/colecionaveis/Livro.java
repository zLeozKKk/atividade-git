package colecionaveis;

public class Livro extends Item {
    private String editora;
    private int numeroPaginas;

    public Livro(String id, String nome, String dataAquisicao, String editora, int numeroPaginas) {
        super(id, nome, dataAquisicao);
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void imprimirListagem() {
        System.out.println("LIVRO LOCAL: " + getNome() + " | Editora: " + editora);
    }
}
