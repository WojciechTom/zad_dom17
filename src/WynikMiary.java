public class WynikMiary {
    Double metry;
    Double centymetry;
    Double milimetry;

    public WynikMiary(Double metry, Double centymetry, Double milimetry) {
        this.metry = metry;
        this.centymetry = centymetry;
        this.milimetry = milimetry;
    }

    public Double getMetry() {
        return metry;
    }

    public void setMetry(Double metry) {
        this.metry = metry;
    }

    public Double getCentymetry() {
        return centymetry;
    }

    public void setCentymetry(Double centymetry) {
        this.centymetry = centymetry;
    }

    public Double getMilimetry() {
        return milimetry;
    }

    public void setMilimetry(Double milimetry) {
        this.milimetry = milimetry;
    }
}
