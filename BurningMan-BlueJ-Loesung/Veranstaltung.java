public class Veranstaltung {
    int tag;
    int zeitfenster;
    String name;

    public Veranstaltung(int tag, int zeitfenster, String name)
    {
        this.tag = tag;
        this.zeitfenster = zeitfenster;
        this.name = name;
    }

    public int getTag()
    {
        return tag;
    }

    public int getZeitfenster()
    {
        return zeitfenster;
    }

    public String getName()
    {
        return name;
    } 

    public void infosAusgeben()
    {
        System.out.println(name + " " + tag + " | " + zeitfenster);
    }

    public boolean istKleiner(Veranstaltung v)
    {
        if(tag < v.tag){
            return true;
        }
        else{
            if (tag == v.tag && zeitfenster < v.getZeitfenster()){
                return true;
            }
        }
        return false;
    }

    public boolean findetStattAm(int tag_, int zeitfenster_)
    {
        if(tag == tag_ && zeitfenster == zeitfenster_)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int tagGeben()
    {
        return tag;
    }
    
    public int zeitfensterGeben()
    {
        return zeitfenster;
    }
}
