package typygeneryczne;

import java.util.ArrayList;


public class TypyGeneryczne 
{
    public static void main(String[] args) 
    {
        //zabezpieczenie się przed przyjęciem danych innych niż String
        ArrayList<String> a = new ArrayList<String>();
        
        a.add(new String("lala"));
        a.add(new String("lalala"));
        a.add(new String("lalalala"));
        a.add(new String("lalalalala"));
        a.add(new String("lalalalalala"));
        //a.add(new Integer(4));
        
        for(int i= 0; i < a.size(); i++)
            System.out.println((String)a.get(i));
        
        for(String stringus : a)
            System.out.println(stringus);
        
        Zwykla<String> nazwaZmiennej = new Zwykla<>();
        nazwaZmiennej.nadajWartosc("cosik");
        System.out.println(nazwaZmiennej.zwroc());
    }
    
}

class Zwykla <COKOLWIEK> //klasa obsługująca zmienne generyczne
{
    public void nadajWartosc(COKOLWIEK wartosc)
    {
        this.nazwaZmiennejTypuCokolwiek = wartosc;
    }
    public COKOLWIEK zwroc()
    {
        return this.nazwaZmiennejTypuCokolwiek;
    }
    COKOLWIEK nazwaZmiennejTypuCokolwiek;
}