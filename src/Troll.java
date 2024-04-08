public class Troll extends Postava{
    public Troll(String jmeno,Trida trida, int level, int expy, int zivoty, double sila, double inteligence, double odolnost, double obratnost) {
        super(jmeno,trida, level, expy, zivoty, sila*1.1, inteligence, odolnost, obratnost);
    }

    @Override
    public String toString() {
        return "Troll{" +
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
