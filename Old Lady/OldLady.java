
/**
 * HW Day 9 Old Lady
 * 
 * Cristalle Kwok
 * 8/25/15
 */
public class OldLady
{
    public static void fly(){
        System.out.println("I don't know know why she swallowed a fly - perhaps she'll die");
    }
    
    public static void spider(){
        System.out.println("She swallowed the spider to catch the fly");
    }
    
    public static void bird(){
        System.out.println("She swallowed the bird to catch the spider");
    }
    
    public static void cat(){
        System.out.println("She swallowed the cat to catch the bird");
    }  
    
    public static void swallowed(){
        System.out.print("There was an old lady who swallowed a ");
    }
    
    public static void main(String[] args){
        swallowed();
        System.out.println("fly");
        fly();
        swallowed();
        System.out.println("spider");
        System.out.println("That wriggled and wiggled and tiggled inside her");
        spider();
        fly();
        swallowed();
        System.out.println("bird");
        System.out.println("How absurd to swallow a bird");
        bird();
        spider();
        fly();
        swallowed();
        System.out.println("cat");
        System.out.println("Fancy that to swallow a cat");
        cat();
        bird();
        spider();
        fly();
        swallowed();
        System.out.println("horse...");
        System.out.println("She's dead, of course");
    }
}
