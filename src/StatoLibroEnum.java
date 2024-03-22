enum StatoLibroEnum {
    DISPONIBILE("Disponibile"),
    IN_PRESTITO("In Prestito"),
    IN_RESTAURO("In restauto");

    private String descrizione;

    StatoLibroEnum(String descrizione) {
        this.descrizione = descrizione;
    }
}
