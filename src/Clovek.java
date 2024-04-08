public class Clovek extends Postava{


    public Clovek(String jmeno, Trida trida, int level, int expy, int zivoty, double sila, double inteligence, double odolnost, double obratnost) {
        super(jmeno, trida, level, expy, zivoty, sila*1.03, inteligence*1.03, odolnost, obratnost*1.04);
    }

    @Override
    public String toString() {
        return "Clovek{" +
                "jmeno='" + jmeno + '\'' +
                ", level=" + level +
                ", expy=" + expy +
                ", zivoty=" + zivoty +
                ", sila=" + sila +
                ", inteligence=" + inteligence +
                ", odolnost=" + odolnost +
                ", obratnost=" + obratnost +
                '}';
    }
}
