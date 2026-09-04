package colecionaveis;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {
    private String id;
    private String nome;
    private String dataAquisicao;
    private List<String> autores;

    public Item(String id, String nome, String dataAquisicao) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.autores = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void adicionarAutor(String autor) {
        this.autores.add(autor);
    }

    public abstract void imprimirListagem();
}