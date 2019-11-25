import java.util.ArrayList;

public class Katsed {
    public static void main(String[] args) {
        Tund esimeneTund = new Tund();
        esimeneTund.aine = "Mobiilirakendus";
        esimeneTund.algus = "03:30";
        esimeneTund.grupp = "VS18";
        esimeneTund.lopp = "10:00";
        esimeneTund.ruum = "407";
        esimeneTund.opetaja = "Ly Otsa";
        esimeneTund.tund = "1";

        Tund teineTund = new Tund();
        teineTund.aine = "Mobiilirakendus";
        teineTund.algus = "10:15";
        teineTund.grupp = "VS18";
        teineTund.lopp = "11:45";
        teineTund.ruum = "411";
        teineTund.opetaja = "Ly Otsa";
        teineTund.tund = "2";

        Tund kolmasTund = new Tund();
        kolmasTund.aine = "JAVA";
        kolmasTund.algus = "11:55";
        kolmasTund.grupp = "VS18";
        kolmasTund.lopp = "14:00";
        kolmasTund.ruum = "411";
        kolmasTund.opetaja = "Anna Karutina";
        kolmasTund.tund = "3";

        Tund neljasTund = new Tund();
        neljasTund.aine = "JAVA";
        neljasTund.algus = "13:55";
        neljasTund.grupp = "VS18";
        neljasTund.lopp = "15:00";
        neljasTund.ruum = "411";
        neljasTund.opetaja = "Anna Karutina";
        neljasTund.tund = "4";

        Tund viiesTund = new Tund();
        viiesTund.aine = "JAVA";
        viiesTund.algus = "15:00";
        viiesTund.grupp = "VS18";
        viiesTund.lopp = "17:00";
        viiesTund.ruum = "411";
        viiesTund.opetaja = "Anna Karutina";
        viiesTund.tund = "5";

        //loo päev
        Paev esmaspaev = new Paev();
        esmaspaev.kuupaev = "2019-11-18";
        esmaspaev.tundideNimekiri = new ArrayList<Tund>;
        //lisame tunnid päevale
        esmaspaev.tundideNimekiri.add(esimeneTund);
        esmaspaev.tundideNimekiri.add(teineTund);
        esmaspaev.tundideNimekiri.add(kolmasTund);
        esmaspaev.tundideNimekiri.add(neljasTund);
        esmaspaev.tundideNimekiri.add(viiesTund);

        System.out.println(esimeneTund);
        System.out.println(teineTund);
        System.out.println(kolmasTund);
        System.out.println(neljasTund);
        System.out.println(viiesTund);

    }
}
