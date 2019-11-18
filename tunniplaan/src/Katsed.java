public class Katsed {
    public static void main(String[] args) {
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

        System.out.println(kolmasTund);
        System.out.println(neljasTund);

    }
}
