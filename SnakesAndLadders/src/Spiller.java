public class Spiller {

    private String navn;
    private int posisjon;
    private boolean tur;

    public Spiller(String navn, int posisjon, boolean tur) {
        this.navn = navn;
        this.posisjon = posisjon;
        this.tur = tur;
    }

    public String getNavn() {
        return navn;

 }

    public boolean isTur() {
        return tur;
    }

    public void setTur(boolean tur) {
        this.tur = tur;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getPosisjon() {
        return posisjon;
    }

    public int setPosisjon(int posisjon) {
        this.posisjon = posisjon;
        return posisjon;
    }
}
