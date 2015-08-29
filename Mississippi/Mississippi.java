
/**
 * HW Day 11 Mississippi Revision
 * 
 * Cristalle Kwok 
 * 8/28/15
 */
public class Mississippi
{
    public static void letterM(){
        System.out.println("M     M");
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("MM M MM");
        System.out.println("M     M");
        System.out.println("M     M");
        System.out.println("M     M");
    }
    
    public static void letterI(){
        System.out.println("IIIII");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("IIIII");
    }
    
    public static void letterP(){
        System.out.println("PPPPPP ");
        System.out.println("P     P");
        System.out.println("P     P");
        System.out.println("PPPPPP ");
        System.out.println("P      ");
        System.out.println("P      ");
        System.out.println("P      ");
    }
    
    public static void letterS(){
        System.out.println(" SSSSS ");
        System.out.println("S     S");
        System.out.println("S      ");
        System.out.println(" SSSSS ");
        System.out.println("      S");
        System.out.println("S     S");
        System.out.println(" SSSSS ");
    }
    
    public static void letterISS(){
        letterI();
        letterS();
        letterS();
    }
           
    
    public static void main(String[] args){
       letterM();
       letterISS();
       letterISS();
       letterI();
       letterP();
       letterP();
       letterI();
    }
}
