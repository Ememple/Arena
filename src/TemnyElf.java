public class TemnyElf extends Postava{
    public TemnyElf(String jmeno,Trida trida, int level, int expy, int zivoty, double sila, double inteligence, double odolnost, double obratnost) {
        super(jmeno,trida, level, expy, zivoty, sila, inteligence*1.04, odolnost, obratnost*1.06);
    }

    @Override
    public String toString() {
        return "TemnyElf{" +
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
