/**
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/

/**

@author 24craft
*/
import java.util.Scanner;
public class Main 
{
   static Scanner input = new Scanner(System.in);
   public static void main(String [] args){
      
      System.out.println("Are you a bitch? 'Y' or 'N'");
      char choice = input.next().charAt(0);
      if(choice == 'Y')
         System.out.println("Disregard woman, aquire currency");
      if(choice == 'N')
         System.out.println("Fuck bitches get money");
      else
         System.out.println("Motha fucka how hard is it to answer Y or N?");
   }
}
