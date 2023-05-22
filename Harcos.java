public class Harcos {
    private int eletero;

    public Harcos() {
        eletero = dobD6() + 3;
    }

    public int getEletero() {
        return eletero;
    }

    public void setEletero(int ujEletero) {
        eletero = ujEletero;
    }

    public void tamad(Varazslo varazslo) {
        int sebzes = dobD6();
        varazslo.setEletero(varazslo.getEletero() - sebzes);
    }

    private int dobD6() {
        return (int) (Math.random() * 6) + 1;
    }
}
