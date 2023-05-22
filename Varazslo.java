public class Varazslo {
    private int eletero;

    public Varazslo() {
        eletero = dobD6() + 3;
    }

    public int getEletero() {
        return eletero;
    }

    public void setEletero(int ujEletero) {
        eletero = ujEletero;
    }

    public void tamad(Harcos harcos) {
        int sebzes = dobD6();
        harcos.setEletero(harcos.getEletero() - sebzes);
    }

    private int dobD6() {
        return (int) (Math.random() * 6) + 1;
    }
}
