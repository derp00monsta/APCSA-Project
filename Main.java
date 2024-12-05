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
                    input.nextLine();
                    if (amount >= 175000 || amount <= 30000) {
                         System.out.println("Please pick a reasonable amount (at most $175,000 and at least $30,000)");
                    }
                    else {
                         break;
                    }
               }
               // create the starting settings
               System.out.println("What would you like to name your first shop?");
               String shopName = input.nextLine();
               Game.setName(name);
               Game.setBalance(amount);
               PetShop.setName(shopName);

               // actually start pet simulator
               while(!Game.isBankrupt()) {
                    // day starts
                    System.out.println("It is day " + Game.getDay());
                    System.out.println("Your current balance is " + Game.getBalance());
                    // first occurrence of a stray
                    Animal stray = new Animal();
                    System.out.println("Oh look! There's a stray! " + stray.toString());
                    System.out.println("Would you like to adopt it? (y/n)");
                    String reply = input.nextLine();
                    if (reply.equalsIgnoreCase("y") && (Animal.getNumPets() >= PetShop.getCapacity())) {
                         System.out.println("You have already reached capacity! Would you like to increase capacity? (y/n)");
                         reply = input.nextLine();
                         if (reply.equalsIgnoreCase("y")) {
                              System.out.println("How much would you like to increase capacity? It costs $50 to accommodate another animal. Please enter an integer.");
                              int num = input.nextInt();
                                   if (Game.getBalance() > PetShop.increaseCapacityCost(num)) {
                                        PetShop.increaseCapacity(num);
                                   }
                                   else if (Game.getBalance() < PetShop.increaseCapacityCost(num)) {
                                        System.out.println("You do not have enough money");
                                   }
                         }
                    }
                    stray = null;


                    if (answer.equalsIgnoreCase("y")){
                         System.out.println("Nice! You now have " + Animal.getNumPets() + " pets!");
                    }

                    // end of day sequence
                    System.out.println("Congratulations! You've made it to the end of Day " + Game.getDay() + ".");
                    System.out.println("How many days forward would you like to move forward by? Enter 0 to end the game.");
                    int num = input.nextInt();
                    if (num > 0) {
                         break;
                    }
                    else {
                         Game.moveForward(num);
                    }

               }

               if (Game.isBankrupt()) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("~~~~~~~~~~~~~~~~~~ BREAKING NEWS ~~~~~~~~~~~~~~~~~~");
                    System.out.println(Game.getName() + "'s " + PetShop.getName() + " was open for " + Game.getDay() + " days.");
                    System.out.println(PetShop.getName() + " helped " + Animal.getPetsAdopted() + " pets get adopted!");
                    System.out.println("Unfortunately " + PetShop.getName() + " recently went bankrupt and has shut down.");
                    System.out.println("What new adventures await " + Game.getName() + "?");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

               }
               else {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("~~~~~~~~~~~~~~~~~~ BREAKING NEWS ~~~~~~~~~~~~~~~~~~");
                    System.out.println(Game.getName() + "'s " + PetShop.getName() + " has been open for " + Game.getDay() + " days and have raised $" + Game.getBalance() + "!");
                    System.out.println("So far, " + PetShop.getName() + " has helped " + Animal.getPetsAdopted() + " pets get adopted!");
                    System.out.println("They still have " + Animal.getNumPets() + " adorable pets waiting to be taken to a loving home.");
                    System.out.println("Thank you " + Game.getName() + "!" + " We are all wondering what you'll do next!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Pet~~~~~~~~~~~~~~~~~~~");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

               }

               System.out.println("Thanks for playing Pet Shop Simulator. Have a wonderful day!");

          }

          // end simulator
          System.out.println("Have a wonderful day!");
          input.close();

     }
}

// time class???
