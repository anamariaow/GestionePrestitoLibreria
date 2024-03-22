public class Fantasy extends Libro {
    private int pagine;
    public Fantasy(String titolo, String autore, int annoPub, int pagine) {
        super(titolo, autore, annoPub);
        this.pagine = pagine;
    }
    @Override
    public double calcolaPrezzo() {
        return 10;
    }
}

