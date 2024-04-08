public class Elf extends Postava{
    public Elf(String jmeno,Trida trida, int level, int expy, int zivoty, double sila, double inteligence, double odolnost, double obratnost) {
        super(jmeno,trida, level, expy, zivoty, sila, inteligence*1.06, odolnost, obratnost*1.04);
    }

    @Override
    public String toString() {
        return "Elf{" +
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
