public class Knoten extends Baumelement{
    private Baumelement naechsterLinks;
    private Baumelement naechsterRechts;
    private Kunstwerk inhalt;

    public Knoten(Kunstwerk inhalt, Baumelement naechsterLinks, Baumelement naechsterRechts)
    {
        this.inhalt = inhalt;
        this.naechsterLinks = naechsterLinks;
        this.naechsterRechts = naechsterRechts;
    }

    public void ausgeben()
    {
        naechsterLinks.ausgeben();
        inhalt.infosAusgeben();
        naechsterRechts.ausgeben();
    }

    public Baumelement einfuegen(Kunstwerk k)
    {
        if (inhalt.istKleiner(k))
        {
            naechsterRechts = naechsterRechts.einfuegen(k);
            return this;
        }
        else
        {
            naechsterLinks = naechsterLinks.einfuegen(k);
            return this;
        }
    }
    


}
