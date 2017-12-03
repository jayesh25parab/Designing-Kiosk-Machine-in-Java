
/**
 * Class LuckyDipGenerator having attribute lucky number (luckyNumber).
 * 
 * @author Jayesh Parab
 * @version V1 (27/08/2015)
 */
public class LuckyDipGenerator
{
   /**
    * Attributes of class LuckyDipGenerator
    */
   private int luckyNumber;
   
   /**
    * Default Constructor for objects of class LuckyDipGenerator
    */
   public LuckyDipGenerator()
   {
       luckyNumber = 0;
   }
   
   /**
    * Method used to get random number
    */
   public int getLuckyNumber()
   {
       return luckyNumber;
   }
   
   /**
    * Method used to set random number
    */
   public void setLuckyNumber( int maximumNumber )
   {
       luckyNumber = 1 + (int)(Math.random() * maximumNumber);
   }
     
}
 