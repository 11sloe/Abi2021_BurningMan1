public class App {
    public static void main(String[] args) throws Exception {
        // Test
        
       Veranstaltungsliste liste = new Veranstaltungsliste();

       Veranstaltung v1 = new Veranstaltung(1, 1, "Konzert");
       Veranstaltung v2 = new Veranstaltung(3, 2, "Lesung");
       Veranstaltung v3 = new Veranstaltung(2, 3, "Vortrag");
       Veranstaltung v4 = new Veranstaltung(1,3,"Noch ein Konzert");

       liste.vorneEinfuegen(v1);
       liste.vorneEinfuegen(v2);
       liste.vorneEinfuegen(v3);
       liste.vorneEinfuegen(v4);

       liste.ausgeben();
    }
}
