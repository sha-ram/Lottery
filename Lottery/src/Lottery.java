
import java.util.Random;
import java.util.Scanner;

public class Lottery {
 
  public static int[] generateLotteryNumber()
  {
      /* array of five integers named lotteryNumbers*/
      int []lotteryNumbers=new int[5];
     
      /* Random is java method that use for generate random number*/
      Random rand = new Random();
      /* random number generation method is rand.nextInt((max - min) + 1) + min;
      * here max is maximum value and min is minimum value
      */
     
      for(int i=0;i<5;i++)
      { /* generate five random number between 0 to 9 and put in lotteryNumbers array*/
          lotteryNumbers[i]=rand.nextInt((99) + 1) + 0;
          System.out.println("Generated lotteryNumbers[i] is:"+lotteryNumbers[i]);
      }
       
      /* retun lotteryNumbers array method*/
      return lotteryNumbers;
     
  }
  /*This method is to compare the corresponding elements in the two arrays and
  * return the number of digits that match.*/
  public static int compareNumbers(int[] lottery, int[] picks)
  {
      /* initially define integer variable match with value 10*/
  int match = 10;
  int i;
   
  /*using for loop compare the corresponding elements in the two arrays
  * here compare first lottery number to picks one,
  * compare Second lottery number to picks second,
  * compare third lottery number to picks third,
  * compare fourth lottery number to picks fourth,
  * compare five lottery number to picks five*/
  for(i=0;i<5;i++)
  {
      if(lottery[i]==picks[i])
      {
          /*if lottery number[i] is equal to picks[i] then return it*/
          match=picks[i];
          return match;
      }
     
  }
      return match;
 
  }
 
  public static void main(String[] args)
  {
             
  //  System.out.println("lottery number is"+ lotteryNumbers[]);
      Scanner sc=new Scanner(System.in);
      int []picks=new int[5];
      int i;
      int matchNumber;
      System.out.println("Enter 5 numbers for lottery picks between 0 to 99 ");
      for(i=0;i<5;i++)
      {
          picks[i]=sc.nextInt();
      }
     
      /*it call generateLotteryNumber method*/
      int []lotteryNumbers=generateLotteryNumber();
     
      /*it call compareNumbers method*/
      matchNumber=compareNumbers(lotteryNumbers,picks);
     
      if(matchNumber==10)
      {
  System.out.println("Sorry, No number matach from Lottery number!! please Try Again");
      }
      else
      {
          System.out.println("The number of digits that match is : "+ matchNumber);
      }
     
             
     
  }
}
