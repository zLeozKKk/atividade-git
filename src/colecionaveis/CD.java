package colecionaveis;

public class CD extends Item {
    private String artista;
    private int quantidadeFaixas;

    public CD(String id, String nome, String dataAquisicao, String artista, int quantidadeFaixas) {
        super(id, nome, dataAquisicao);
        this.artista = artista;
        this.quantidadeFaixas = quantidadeFaixas;
    }

    public String getArtista() {
        return artista;
    }

    public int getQuantidadeFaixas() {
        return quantidadeFaixas;
    }

    @Override
    public void imprimirListagem() {
        System.out.println("CD: " + getNome() + " | Artista: " + artista + " | Faixas: " + quantidadeFaixas);
    }
}