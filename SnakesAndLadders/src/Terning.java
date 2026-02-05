public class Terning {

    /**
     * Kaster terningen.
     *
     * @return et tilfeldig heltall mellom 1 og 6
     */
    public int trill() {
        return (int) (Math.random() * 6) + 1;
    }

}
