abstract class Libro {
    private String titolo;
    private String autore;
    private int annoPubblicazione;

    public Libro(String titolo, String autore, int annoPubblicazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public abstract double calcolaPrezzo();


    public void setStatoLibro(StatoLibro statoLibro) {

    }

    public String getStato() {
        return getStato();
    }

    public void setStato(StatoLibroEnum statoLibroEnum) {
    }
}
