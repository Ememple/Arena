public class Trpaslik extends Postava{
    public Trpaslik(String jmeno,Trida trida, int level, int expy, int zivoty, double sila, double inteligence, double odolnost, double obratnost) {
        super(jmeno,trida, level, expy, zivoty, sila*1.07, inteligence, odolnost, obratnost*1.03);
    }

    @Override
    public String toString() {
        return "Trpaslik{" +
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
