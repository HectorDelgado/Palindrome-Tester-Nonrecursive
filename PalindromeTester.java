import java.util.Scanner;

public class PalindromeTester
{
   public static void main(String[] args)
   {
      PalindromeEvaluator check = new PalindromeEvaluator();
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Type a word and hit enter to check if it is a palindrome!");
      System.out.println("Or just hit enter to quit.");
      String s = keyboard.nextLine();

      while(!s.isEmpty())
      {
         if(check.isPalindrome(s))
         {
            System.out.println("\n" + s + " is a palindrome!\n");
         }

         else
         {
            System.out.println("\n" + s + " is not a palindrome\n");
         }

         System.out.println("Type a word and hit enter to check if it is a palindrome!");
         System.out.println("Or just hit enter to quit.");
         s = keyboard.nextLine();
      }
   }
}
