public class Terning {

    private int sider;

    public Terning(int sider) {
        this.sider = sider;
    }

    public int trill() {
        return (int) (Math.random() * 6) + 1;
    }

}
