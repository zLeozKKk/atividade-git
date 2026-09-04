package colecionaveis;

public class CatalogoTest {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO O CATALOGO COMPLETO ---");

        // Instanciando o catálogo
        Catalogo catalogo = new Catalogo();

        // Criando itens de tipos diferentes
        Livro livro = new Livro("1", "Entendendo Algoritmos", "04/09/2026", "Novatec", 264);
        CD cd = new CD("2", "Dark Side of the Moon", "04/09/2026", "Pink Floyd", 10);

        // Adicionando ao catálogo
        catalogo.adicionarItem(livro);
        catalogo.adicionarItem(cd);

        // Listando todos os itens
        catalogo.listarItens();

        System.out.println("--- TESTE FINALIZADO COM SUCESSO ---");
    }
}