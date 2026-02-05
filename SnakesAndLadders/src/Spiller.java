public class Spiller {

    private String navn;
    private int posisjon;
    private boolean tur;
    private boolean vinner;

    /**
     * Oppretter en ny spiller.
     *
     * @param navn navn til spilleren
     * @param posisjon posisjonen til spilleren
     * @param tur true hvis det er spillerens tur
     * @param vinner true hvis spilleren har vunnet
     */
    public Spiller(String navn, int posisjon, boolean tur, boolean vinner) {
        this.navn = navn;
        this.posisjon = posisjon;
        this.tur = tur;
        this.vinner = vinner;
    }

    /**
     *
     * @return spillerens navn
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Sjekker om spilleren har vunnet.
     *
     * @return true hvis spilleren er vinner, ellers false
     */
    public boolean getVinner() {
        return vinner;
    }

    /**
     * Setter spilleren som vinner.
     */
    public void setVinner() {
        this.vinner = true;
    }

    /**
     * Sjekker om det er spillerens tur.
     *
     * @return true hvis det er spillerens tur
     */
    public boolean isTur() {
        return tur;
    }

    /**
     * Setter om det er spillerens tur.
     *
     * @param tur true hvis det er spillerens tur
     */
    public void setTur(boolean tur) {
        this.tur = tur;
    }

    /**
     * Setter navnet til spilleren.
     *
     * @param navn nytt navn på spilleren
     */
    public void setNavn(String navn) {
        this.navn = navn;
    }

    /**
     * Returnerer spillerens posisjon.
     *
     * @return spillerens posisjon
     */
    public int getPosisjon() {
        return posisjon;
    }

    /**
     * Setter spillerens posisjon.
     *
     * @param posisjon ny posisjon
     * @return den nye posisjonen
     */
    public int setPosisjon(int posisjon) {
        this.posisjon = posisjon;
        return posisjon;
    }
}
