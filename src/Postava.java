public class Postava{
    public enum Trida{
        VALECNIK,
        MAG,
        PRUZKUMNIK
    }
    //jméno, level, sílu, inteligenci, obratnost, odolnost a zkušenostní body
    protected String jmeno;
    protected Trida trida;
    protected int level;
    protected int expy;
    protected int zivoty;
    protected double sila;
    protected double inteligence;
    protected double odolnost;
    protected double obratnost;

    public Postava(String jmeno, Trida trida, int level, int expy, int zivoty, double sila, double inteligence, double odolnost, double obratnost) {
        this.jmeno = jmeno;
        this.trida = trida;
        this.level = level;
        this.expy = expy;
        this.zivoty = zivoty;
        this.sila = sila;
        this.inteligence = inteligence;
        this.odolnost = odolnost;
        this.obratnost = obratnost;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExpy() {
        return expy;
    }

    public void setExpy(int expy) {
        this.expy = expy;
    }

    public int getZivoty() {
        return zivoty;
    }

    public void setZivoty(int zivoty) {
        this.zivoty = level*10;
    }

    public double getSila() {
        return sila;
    }

    public void setSila(double sila) {
        this.sila = sila;
    }

    public double getInteligence() {
        return inteligence;
    }

    public void setInteligence(double inteligence) {
        this.inteligence = inteligence;
    }

    public double getOdolnost() {
        return odolnost;
    }

    public void setOdolnost(double odolnost) {
        this.odolnost = odolnost;
    }

    public double getObratnost() {
        return obratnost;
    }

    public void setObratnost(double obratnost) {
        this.obratnost = obratnost;
    }

    //člověk +3% síla, +3% inteligence, +4% obratnost
    //elf +6% inteligence, +4% obratnost
    //trpaslík +7% síla, +3% obratnost
    //troll +10% síla
    //temný elf +4% inteligence, +6% obratnost
    //nemrtví +10% inteligence


}
