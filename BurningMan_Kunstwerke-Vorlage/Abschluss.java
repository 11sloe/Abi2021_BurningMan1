public class Abschluss extends Baumelement{
    public void ausgeben(){}
    
    public Baumelement einfuegen(Kunstwerk ku)
    {
        Knoten k = new Knoten(ku,this,new Abschluss());
        return k;
    }

    
    
    
}
