public class WynikTekst {
int liczbaSlow;
int liczbaZnakow;
int liczbaZnakowBezSpacji;
boolean czyPal;

    public WynikTekst(int liczbaSlow, int liczbaZnakow, int liczbaZnakowBezSpacji, boolean czyPal) {
        this.liczbaSlow = liczbaSlow;
        this.liczbaZnakow = liczbaZnakow;
        this.liczbaZnakowBezSpacji = liczbaZnakowBezSpacji;
        this.czyPal = czyPal;
    }

    public int getLiczbaSlow() {
        return liczbaSlow;
    }

    public void setLiczbaSlow(int liczbaSlow) {
        this.liczbaSlow = liczbaSlow;
    }

    public int getLiczbaZnakow() {
        return liczbaZnakow;
    }

    public void setLiczbaZnakow(int liczbaZnakow) {
        this.liczbaZnakow = liczbaZnakow;
    }

    public int getLiczbaZnakowBezSpacji() {
        return liczbaZnakowBezSpacji;
    }

    public void setLiczbaZnakowBezSpacji(int liczbaZnakowBezSpacji) {
        this.liczbaZnakowBezSpacji = liczbaZnakowBezSpacji;
    }

    public boolean isCzyPal() {
        return czyPal;
    }

    public void setCzyPal(boolean czyPal) {
        this.czyPal = czyPal;
    }
}
