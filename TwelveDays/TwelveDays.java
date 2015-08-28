
/**
 * HW Day 10 Twelve Days of Christmas
 * 
 * Cristalle Kwok
 * 8/27/15
 */
public class TwelveDays
{
    public static void TrueLove(){
        System.out.println("my true love sent to me");
        System.out.println(" ");
    }
    
    public static void FirstDay(){
        System.out.println("a partridge in a pear tree.");
    }

    public static void SecondDay(){
        System.out.println("two turtle doves, and");
        FirstDay();
    }

    public static void ThirdDay(){
        System.out.println("three French hens,");
        SecondDay();
    }

    public static void FourthDay(){
        System.out.println("four calling birds");
        ThirdDay();
    }

    public static void FifthDay(){
        System.out.println("five golden rings,");
        FourthDay();
    }

    public static void SixthDay(){
        System.out.println("six geese a-laying,");
        FifthDay();
    }

    public static void SeventhDay(){
        System.out.println("seven swans a-swimming,");
        SixthDay();
    }

    public static void EighthDay(){
        System.out.println("eight maids a-milking,");
        SeventhDay();
    }

    public static void NinthDay(){
        System.out.println("nine ladies dancing,");
        EighthDay();
    }

    public static void TenthDay(){
        System.out.println("ten lords a-leaping,");
        NinthDay();
    }

    public static void EleventhDay(){
        System.out.println("eleven pipers piping,");
        TenthDay();
    }

    public static void TwelfthDay(){
        System.out.println("twelve drummers drumming,");
        EleventhDay();
}

    public static void main(String[] args){
        System.out.println("On the first day of Christmas,");
        TrueLove();
        FirstDay();
        System.out.println("On the second day of Christmas,");
        TrueLove();
        SecondDay();
        System.out.println("On the third day of Christmas,");
        TrueLove();
        ThirdDay();
System.out.println("On the fourth day of Christmas,");
        TrueLove();
        FourthDay();
        System.out.println("On the fifth day of Christmas,");
        TrueLove();
        FifthDay();
        System.out.println("On the sixth day of Christmas,");
        TrueLove();
        SixthDay();
        System.out.println("On the seventh day of Christmas,");
        SeventhDay();
        System.out.println("On the eighth day of Christmas,");
        EighthDay();
        System.out.println("On the ninth day of Christmas,");
        NinthDay();
        System.out.println("On the tenth day of Christmas,");
        TenthDay();
        System.out.println("On the eleventh day of Christmas,");
        EleventhDay();
        System.out.println("On the twelfth day of Christmas,");
        TwelfthDay();
    }
}

    
