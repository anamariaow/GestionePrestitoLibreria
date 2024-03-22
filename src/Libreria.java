import java.util.ArrayList;
import java.util.List;

public class Libreria implements GestionePrestito {
    public ArrayList<Libro> libri = new ArrayList<>();


    public Libreria() {
    }
    public ArrayList getLibri() {
        return libri;
    }
    public void setLibri(ArrayList libri) {
        this.libri = libri;
    }
    public String statoLibro (Libro libro) {
        libro.setStatoLibro(StatoLibro.IN_PRESTITO);
        for (Libro libro1: libri) {
            if (libro.getTitolo().equals(libro1.getTitolo())) {
                libro.setStatoLibro(StatoLibro.DISPONIBILE);
                return StatoLibro.DISPONIBILE.toString();
            }
        }
        return "Il libro non è disponibile";
    }

    public void aggiungiLibro(Libro romanzo) {

    }

    public void visualizzaLibriDisponibili() {
    }


    public List<Libro> cercaLibriPerAutore(String s) {
        return null;
    }


    @Override
    public void prestaLibro(Libro libro) {
        for (Libro libro1 : libri) {
            if (libri.contains(libro)) {
                if (libro1.getStato() == StatoLibroEnum.DISPONIBILE) {
                    libro1.setStato(StatoLibroEnum.IN_PRESTITO);
                }
            }
        }

    }

    @Override
    public void restituisciLibro(Libro libro) {
        for (Libro libro1 : libri) {
            if (libri.contains(libro)) {
                libro1.setStato(StatoLibroEnum.DISPONIBILE);
            }
        }
    }
}