import java.util.Scanner;

public class Jatek {

    public static void main(String[] args) {
        String[] jatekTer = new String[3];
        Harcos harcos = new Harcos();
        Varazslo varazslo = new Varazslo();
        
        System.out.println("Kezdeti állapot:");
        kiirjatekTer(jatekTer);
        kiirAllas(harcos, varazslo);
        
        while (harcos.getEletero() > 0 && varazslo.getEletero() > 0) {
            int random = (int) (Math.random() * 2);
            if (random == 0) {
                harcos.tamad(varazslo);
            } else {
                varazslo.tamad(harcos);
            }
            
            System.out.println("Következő állapot:");
            kiirAllas(harcos, varazslo);
        }
        
        System.out.println("Harc vége.");
    }
    
    private static void kiirAllas(Harcos harcos, Varazslo varazslo) {
        System.out.println("H: " + harcos.getEletero() + ", V: " + varazslo.getEletero());
    }

    private static void kiirjatekTer(String[] jatekTer)
    {
        for(String i : jatekTer)
        {
            if(i == null)
            {
                System.out.print("_");
            }
            else
            {
                System.out.print(i);
            }
        }
        System.out.println();
    }

    private static void frissitjatekTer(String[] jatekTer, Harcos harcos, Varazslo varazslo)
    {
        for(int i = 0; i < jatekTer.length; i++)
        {
            jatekTer[i] = null;
        }
    }
}
