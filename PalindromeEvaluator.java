/*
 * File: PalindromeEvaluator.java
 * Author: Hector Delgado
 * Description: Test whether a string is a palindrome by pushing/adding
 * its characters onto a stack (FILO) and queue (FIFO), then uses the
 * peek method of each data structure to compare the first and last
 * characters in the string for equality
 */

import java.util.*;

public class PalindromeEvaluator
{
   public static boolean isPalindrome(String s)
   {
      boolean passes = false;

      // Remove whitespace and convert to lowercase
      s = s.replaceAll("[^A-Za-z]+", "").toLowerCase();

      // Instantiate stack and queue
      Stack<Character> myStack = new Stack<Character>();
      Queue<Character> myQueue = new LinkedList<Character>();

      // Add characters of string to stack and queue
      for(int i = 0; i < s.length(); i++)
      {
         myStack.push(s.charAt(i));
         myQueue.add(s.charAt(i));
      }

      while(s.length() >= 0)
      {
         // If strings length is 1 or 0, palindrome test passed
         if(s.length() == 0 || s.length() == 1)
         {
            passes = true;
            return passes;
         }

         // If the top of stack/queue are equal, remove top character from both
         // data structures, then remove first/last character from string.
         // Otherwise return false
         if(myStack.peek() == myQueue.peek())
         {
            myStack.pop();
            myQueue.remove();
            s = s.substring(1, s.length() - 1);
         }
         else
         {
            passes = false;
            return passes;
         }
      }
      return passes;
   }
}
