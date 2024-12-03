import java.util.*;
/** 
*Pet Shop Simulator
*Project Description - Short explanation of what your program does
*@author Hadizah Coulibaly
*@author ChrisTina Hague
*@version - the date the program was last updated
*/


public class Main {
     public static void main(String[] args) {
     
        // create scanner
          Scanner input = new Scanner(System.in);

          // ask if user wants to play
          System.out.println("Hello! Welcome to the Pet Shop Simulator. Would you like to play?");
          System.out.println("Y or N");
          String answer = input.nextLine();

          // start pet shop (assign starting balance and name)
          if (answer.equalsIgnoreCase("y")) {
               System.out.println("What is your players name?");
               String name = input.nextLine();
               double amount;
               while (true) {
                    System.out.println("How much money do you start with?");
                    amount = input.nextDouble();
                    if (amount <= 175,000 || amount >= 30,000) {
                         break;
                    }
                    else {
                         System.out.println("Please pick a reasonable amount (at most $175,000 and at least $30,000");
                    }
               }
               Finance game = new Finance(amount, name);

               // actually start pet simulator
               while(!Game.isBankrupted()) {
               
               }
          }

          System.out.println("Have a wonderful day!")

     }
}

// time class???
// is "Develop algorithms to perform operations with Strings." a requirement
