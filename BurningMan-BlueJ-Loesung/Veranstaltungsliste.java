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
        anfang = anfang.sortiertEinfuegen(v);
    }

    public int anzahlGeben(int tag, int zeitfenster)
    {
        return anfang.anzahlGeben(tag,zeitfenster);
    }
    
    public void ausgeben()
    {
        System.out.println();
        System.out.println("Alle Veranstaltungen ausgeben: ");
        anfang.ausgeben();
        System.out.println();
    }
    
    public void m()
    {
        anfang = anfang.m(0,0);
    }
    
}
