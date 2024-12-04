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
                    input.nextLine();
                    amount = input.nextDouble();
                    if (amount <= 175,000 || amount >= 30,000) {
                         break;
                    }
                    else {
                         System.out.println("Please pick a reasonable amount (at most $175,000 and at least $30,000");
                    }
               }
               // create the starting settings
               System.out.println("What would you like to name your first shop?");
               String shopName = input.nextLine();
               Game game = new Game(amount, name);
               PetShop shop1 = new PetShop(shopName);

               // actually start pet simulator
               while(!Game.isBankrupted()) {
                    System.out.println("It is day " + Game.getDay());
                    System.out.println("Your current balance is " + Game.getBalance());
                    Animal stray = new Animal();
                    System.out.println("Oh look! There's a stray! " + stray.toString());
                    System.out.println("Would you like to adopt it? (y/n)");
                    String reply = input.nextLine();
                    if("y" && PetShop.getNumPets() >= PetShop.getCapacity()) {
                         System.out.println("You have already reached capacity! Would you like to increase capacity? (y/n)");
                         reply = input.nextLine();
                         if (reply.equalsIgnoreCase("y")) {
                              System.out.println("How much would you like to increase capacity? It costs $50 to accommodate another animal. Please enter an integer.");
                              int num = input.nextInt();
                                   if (Game.getBalance() > PetShop.increaseCapacityCost(num)) {
                                        PetShop.increaseCapacity();
                                   }
                                   else if (Game.getBalance() < PetShop.increaseCapacityCost(num)) {
                                        System.out.println("You do not have enough money")
                                   }
                         }
                    }
                    stray.close();


                    if (answer.equalsIgnoreCase("y")){
                         System.out.println("Nice! You now have " + Animal.getNumPets());
                    }
                    
               }
          }

          System.out.println("Have a wonderful day!");

     }
}

// time class???
// is "Develop algorithms to perform operations with Strings." a requirement
