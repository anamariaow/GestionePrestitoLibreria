public class Romanzo extends Libro {
    private String genere;
    public Romanzo(String titolo, String autore, int annoPubblicazione, String genere, String margherita) {
        super(titolo, autore, annoPubblicazione);
        this.genere = genere;
    }

    @Override
    public double calcolaPrezzo() {
        return 12;
    }
}
