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

    
}
