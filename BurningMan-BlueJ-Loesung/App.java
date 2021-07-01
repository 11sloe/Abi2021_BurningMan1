public class App {
    public static void main(String[] args) throws Exception {
        // Test
        
       Veranstaltungsliste liste = new Veranstaltungsliste();

       Veranstaltung v1 = new Veranstaltung(1, 1, "Konzert");
       Veranstaltung v2 = new Veranstaltung(3, 2, "Lesung");
       Veranstaltung v3 = new Veranstaltung(2, 3, "Vortrag");
       Veranstaltung v4 = new Veranstaltung(1,3,"Noch ein Konzert");
       Veranstaltung v5 = new Veranstaltung(2,3, "Konzert2");
       Veranstaltung v6 = new Veranstaltung(2,3, "Konzert3");

       /* Test1
       liste.sortiertEinfuegen(v1);
       liste.sortiertEinfuegen(v2);
       liste.sortiertEinfuegen(v3);
       liste.sortiertEinfuegen(v4);
       liste.sortiertEinfuegen(v5);
       liste.sortiertEinfuegen(v6);
       
       liste.ausgeben();

       System.out.println(liste.anzahlGeben(1,3));
       System.out.println(liste.anzahlGeben(2,3));
       System.out.println(liste.anzahlGeben(3,3));
       */
      
       // Test2
       Veranstaltung v7 = new Veranstaltung(1,3,"1001 Nights");
       Veranstaltung v8 = new Veranstaltung(1,3, "5th dim");
       Veranstaltung v9 = new Veranstaltung (1,3,"Drummer");
       
       liste.sortiertEinfuegen(v9);
       liste.sortiertEinfuegen(v8);
       liste.sortiertEinfuegen(v7);
      
       liste.ausgeben();
       System.out.println("Anzahl der Veranstaltungen an (1,3):");
       System.out.println(liste.anzahlGeben(1,3));
       
       liste.m();
       liste.ausgeben();
       
    }
}
