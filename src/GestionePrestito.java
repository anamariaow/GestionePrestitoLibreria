public interface GestionePrestito {
    void prestaLibro();
    void restituisciLibro();

    void prestaLibro(Libro libro);

    void restituisciLibro(Libro libro);
}
