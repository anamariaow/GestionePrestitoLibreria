public class Storia extends Libro {
    private String civilta;
    public Storia(String titolo, String autore, int annoPub, String civilta) {
        super(titolo, autore, annoPub);
        this.civilta = civilta;
    }
    @Override
    public double calcolaPrezzo() {
        return 11;
    }
}
