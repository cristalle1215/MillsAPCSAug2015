
/**
 * HW Day 9 Old Lady
 * 
 * Cristalle Kwok
 * 8/25/15
 */
public class OldLady
{
    public static void Fly(){
        System.out.println("I don't know know why she swallowed a fly - perhaps she'll die");
    }
    
    public static void Spider(){
        System.out.println("She swallowed the spider to catch the fly");
    }
    
    public static void Bird(){
        System.out.println("She swallowed the bird to catch the spider");
    }
    
    public static void Cat(){
        System.out.println("She swallowed the cat to catch the bird");
    }  
    
    public static void main(String[] args){
        System.out.println("There was an old lady who swallowed a fly");
        Fly();
        System.out.println("There was an old lady who swallowed a spider");
        System.out.println("That wriggled and wiggled and tiggled inside her");
        Spider();
        Fly();
        System.out.println("There was an old lady who swallowed a bird");
        System.out.println("How absurd to swallow a bird");
        Bird();
        Spider();
        Fly();
        System.out.println("There was an old lady who swallowed a cat");
        System.out.println("Fancy that to swallow a cat");
        Cat();
        Bird();
        Spider();
        Fly();
        System.out.println("There was an old lady who swallowed a horse...");
        System.out.println("She's dead, of course");
    }
}
