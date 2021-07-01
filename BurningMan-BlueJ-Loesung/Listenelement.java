public abstract class Listenelement {
    public abstract void ausgeben();
    public abstract Listenelement sortiertEinfuegen(Veranstaltung v);
    public abstract int anzahlGeben(int tag, int zeitfenster);
    
    public abstract Listenelement m(int tag, int zeitfenster);
   
}
