package colecionaveis;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Item> itens;

    public Catalogo() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void listarItens() {
        System.out.println("=== CATALOGO DE COLECIONAVEIS ===");
        if (itens.isEmpty()) {
            System.out.println("O catalogo esta vazio.");
            return;
        }
        for (Item item : itens) {
            item.imprimirListagem();
        }
        System.out.println("=================================");
    }
}