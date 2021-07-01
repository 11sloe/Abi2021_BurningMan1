public class Abschluss extends Listenelement{
    public void ausgeben(){}
    public Listenelement sortiertEinfuegen(Veranstaltung v)
    {
        Knoten k = new Knoten(v,this);
        return k;
    }

    public int anzahlGeben(int tag, int zeitfenster)
    {
        return 0;
    }
    
    public Listenelement m(int tag, int zeitfenster)
    {
        return this;
    }
    
    
    
}
