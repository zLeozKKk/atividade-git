package colecionaveis;

public class ItemTest {

    // Subclasse simples só para instanciar a classe abstrata Item
    private static class ItemExemplo extends Item {
        public ItemExemplo(String id, String nome, String dataAquisicao) {
            super(id, nome, dataAquisicao);
        }

        @Override
        public void imprimirListagem() {
            System.out.println("Item: " + getNome() + " | ID: " + getId());
        }
    }

    public static void main(String[] args) {
        System.out.println("--- INICIANDO TESTE DO ITEM ---");

        // Criando o item
        ItemExemplo item = new ItemExemplo("1", "Livro de Java", "04/09/2026");
        item.adicionarAutor("Deitel");

        // Imprimindo para testar se deu certo
        item.imprimirListagem();
        System.out.println("Autor: " + item.getAutores().get(0));
        System.out.println("Data: " + item.getDataAquisicao());

        System.out.println("--- TESTE CONCLUIDO COM SUCESSO ---");
    }
}