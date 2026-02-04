public abstract class Flytt {
    private int fra;
    private int til;
    private Stige stige;
    private Slange slange;

    public Flytt(int fra, int til) {
        this.fra = fra;
        this.til = til;
    }


    public int getFra() {
        return fra;
    }

    public void setFra(int fra) {
        this.fra = fra;
    }

    public int getTil() {
        return til;
    }

    public void setTil(int til) {
        this.til = til;
    }
}

