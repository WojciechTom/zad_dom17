public class WynikWagi {
    Double kilogramy;
    Double gramy;
    Double miligramy;

    public WynikWagi(Double kilogramy, Double gramy, Double miligramy) {
        this.kilogramy = kilogramy;
        this.gramy = gramy;
        this.miligramy = miligramy;
    }

    public Double getKilogramy() {
        return kilogramy;
    }

    public void setKilogramy(Double kilogramy) {
        this.kilogramy = kilogramy;
    }

    public Double getGramy() {
        return gramy;
    }

    public void setGramy(Double gramy) {
        this.gramy = gramy;
    }

    public Double getMiligramy() {
        return miligramy;
    }

    public void setMiligramy(Double miligramy) {
        this.miligramy = miligramy;
    }

    @Override
    public String toString() {
        return "WynikWagi{" +
                "kilogramy=" + kilogramy +
                ", gramy=" + gramy +
                ", miligramy=" + miligramy +
                '}';
    }
}
