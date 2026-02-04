public class Rute {
    private int nummer;
    private Flytt flytt;
    public Rute(int nummer){
        this.nummer = nummer;
    }
    public int getNummer(){
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public Flytt getFlytt() {
        return flytt;
    }

    public void setFlytt(Flytt flytt) {
        this.flytt = flytt;
    }
}
