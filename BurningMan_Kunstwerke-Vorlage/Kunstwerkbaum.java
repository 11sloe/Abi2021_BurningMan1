public class Kunstwerkbaum {
    private Baumelement wurzel;
    
    public Kunstwerkbaum()
    {
        wurzel = new Abschluss();
    }

 

    public void einfuegen(Kunstwerk k)
    {
        wurzel = wurzel.einfuegen(k);
    }

    
    public void ausgeben()
    {
        System.out.println();
        System.out.println("Alle Kunstwerke ausgeben: ");
        wurzel.ausgeben();
        System.out.println();
    }
    
}
