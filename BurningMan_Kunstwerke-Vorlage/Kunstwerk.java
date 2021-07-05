public class Kunstwerk {

    private String name;
    private Ort ort;

    public Kunstwerk(String name, Ort ort)
    {
        this.name = name;
        this.ort = ort;
    }

    public String getName()
    {
        return name;
    } 

    public void infosAusgeben()
    {
        System.out.println(name + " " + ort.getName() );
    }

    public boolean istKleiner(Kunstwerk k)
    {
        if(name.compareTo(k.name)<0){
            return true;
        }
        
        return false;
    }

    
   
}
