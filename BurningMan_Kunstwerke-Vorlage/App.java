public class App {
    public static void main(String[] args) throws Exception {
        // Test
        Ort o1 = new Ort("Ort1");
        Ort o2 = new Ort("Ort2");
        
        Kunstwerk k1 = new Kunstwerk("K",o1);
        Kunstwerk k2 = new Kunstwerk("S",o1);
        Kunstwerk k3 = new Kunstwerk("O",o1);
       Kunstwerk k4 = new Kunstwerk("A",o1);
       
       Kunstwerkbaum baum = new Kunstwerkbaum();
       baum.einfuegen(k1);
       baum.einfuegen(k2);
       baum.einfuegen(k3);
       baum.einfuegen(k4);
       
       baum.ausgeben();
       
    }
}
