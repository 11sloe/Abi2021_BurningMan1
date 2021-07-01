public class Knoten extends Listenelement{
    private Listenelement nachfolger;
    private Veranstaltung inhalt;

    public Knoten(Veranstaltung inhalt, Listenelement nachfolger)
    {
        this.inhalt = inhalt;
        this.nachfolger = nachfolger;
    }

    public void ausgeben()
    {
        inhalt.infosAusgeben();
        nachfolger.ausgeben();
    }

    public Listenelement sortiertEinfuegen(Veranstaltung v)
    {
        if (inhalt.istKleiner(v))
        {
            nachfolger = nachfolger.sortiertEinfuegen(v);
            return this;
        }
        else
        {
            Knoten k = new Knoten(v,this);
            return k;
        }
    }
    
    public int anzahlGeben(int tag, int zeitfenster)
    {
        if(inhalt.findetStattAm(tag,zeitfenster))
        {
            return nachfolger.anzahlGeben(tag,zeitfenster) + 1;
        }
        else
        {
            return nachfolger.anzahlGeben(tag,zeitfenster);
        }
    }
    
    public Listenelement m(int tag, int zeitfenster)
    {
        int meinTag = inhalt.tagGeben();
        int meinZeitfenster = inhalt.zeitfensterGeben();
        nachfolger = nachfolger.m(meinTag,meinZeitfenster);
        if(tag == meinTag && zeitfenster == meinZeitfenster)
        {
            return nachfolger;
        }
        else
        {
            return this;
        }
    }

}
