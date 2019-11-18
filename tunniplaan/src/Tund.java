public class Tund {
    public String tund;
    public String algus;
    public String lopp;
    public String aine;
    public String ruum;
    public String grupp;
    public String opetaja;

    @Override
    public String toString() {
        return  "Tund: '" + tund +
                "\nAlgus: '" + algus +
                "\nLopp: '" + lopp +
                "\nAine: '" + aine +
                "\nRuum: '" + ruum +
                "\nGrupp: '" + grupp +
                "\nÕpetaja: '" + opetaja
                ;
    }
}
