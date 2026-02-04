public class Brett {

    private final int storrelse;
    private Rute rute;
    public Brett(int storrelse){
        this.storrelse = storrelse;
    }

    public Rute getRute() {
        return rute;
    }

    public void setRute(Rute rute) {
        this.rute = rute;
    }

    public int getStorrelse() {
        return storrelse;
    }

}
