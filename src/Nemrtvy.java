public class Nemrtvy extends Postava{
    public Nemrtvy(String jmeno,Trida trida, int level, int expy, int zivoty, double sila, double inteligence, double odolnost, double obratnost) {
        super(jmeno,trida, level, expy, zivoty, sila, inteligence*1.1, odolnost, obratnost);
    }

    @Override
    public String toString() {
        return "Nemrtvy{" +
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
