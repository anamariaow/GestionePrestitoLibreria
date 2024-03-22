import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        //libri aggiunti al catalogo
        Libro romanzo = new Romanzo("Cose che nessuno sa", "J.R.R. Tolkien", 2011,  "adolescenziale", "Margherita");
        Libro fantasy = new Fantasy("Harry Potter", "J.K. Rowling", 1997,  223);
        Libro storia = new Storia("Guerra e pace", "Lev Nikolaevic Tolstoj", 1867,  "Guerre Napoleoniche");

        libreria.aggiungiLibro(romanzo);
        libreria.aggiungiLibro(fantasy);
        libreria.aggiungiLibro(storia);


        libreria.visualizzaLibriDisponibili();

        try {
            libreria.prestaLibro(romanzo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        libreria.prestaLibro(romanzo);
        libreria.visualizzaLibriDisponibili();

        libreria.restituisciLibro(romanzo);
        libreria.visualizzaLibriDisponibili();


        List<Libro> libriDiRowling = libreria.cercaLibriPerAutore("J.K. Rowling");
        System.out.println("Libri di J.K. Rowling");
        for (Libro libro : libriDiRowling) {
            System.out.println(libro.getTitolo());
        }
    }
}