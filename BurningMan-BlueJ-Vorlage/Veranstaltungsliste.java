public class Veranstaltungsliste {
    private Listenelement anfang;
    
    public Veranstaltungsliste()
    {
        anfang = new Abschluss();
    }

    public void vorneEinfuegen(Veranstaltung v)
    {
        Knoten k = new Knoten(v,anfang);
        anfang = k;
    }

    public void sortiertEinfuegen(Veranstaltung v)
    {
        // TODO
    }

    public void ausgeben()
    {
        System.out.println();
        System.out.println("Alle Veranstaltungen ausgeben: ");
        anfang.ausgeben();
        System.out.println();
    }
    
}
