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
               while(!Game.isBankrupt() && Game.play()) {
                    PetShop.resetAdoptions();
                    System.out.println("It is day " + Game.getDay());
                    System.out.println("Your current balance is " + Game.getBalance());
                    for (int i = 0; i < 3; i++) {
                         // day starts
                         // first occurrence of a stray
                         PetShop shop = new PetShop();
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
                                             System.out.println(PetShop.getName() + " can now fit " + PetShop.getCapacity() + " pets!");
                                        }
                                        else if (Game.getBalance() < PetShop.increaseCapacityCost(num)) {
                                             System.out.println("You do not have enough money");
                                        }
                              }
                         }
                         else if (reply.equalsIgnoreCase("y")) {
                              stray.transferTo(shop);
                              System.out.println("Nice! You know have " + Animal.getNumPets() + " pet(s)!");
                         }
                         else if (reply.equalsIgnoreCase("n")) {
                              System.out.println("Aight...");
                         }
                         stray = null;
                         Animal.adopt();
                         Animal.adopt();
                         Animal.adopt();
                         int num;
                         while (true) {
                              Game.menu();
                              num = input.nextInt();
                              if (num == 0) {
                                   i += 100;
                                   Game.playGame(false);
                                   break;
                              }
                              else if (num == 1) {
                                   Animal.addPet();
                                   Game.addToBalance(-30);
                                   System.out.println(PetShop.getName() + " now has " + Animal.getNumPets() + " pets!");
                                   System.out.println("Do you wish to return to the menu? (y/n)");
                                   reply = input.nextLine();
                                   if (reply.equalsIgnoreCase("n")) {
                                        break;
                                   }

                              }
                              else if (num == 2) {
                                   System.out.println("How much would you like to increase capacity? It costs $50 to accommodate another animal. Please enter an integer.");
                                   num = input.nextInt();
                                   if (Game.getBalance() > PetShop.increaseCapacityCost(num)) {
                                        PetShop.increaseCapacity(num);
                                        System.out.println(PetShop.getName() + " can now fit " + PetShop.getCapacity() + " pets!");

                                   }
                                   else if (Game.getBalance() < PetShop.increaseCapacityCost(num)) {
                                        System.out.println("You do not have enough money");

                                   }
                                   System.out.println("Do you wish to return to the menu? (y/n)");
                                   reply = input.nextLine();
                                   if (reply.equalsIgnoreCase("n")) {
                                        break;
                                   }

                              }
                              else if (num == 3) {
                                   if (Game.getBalance() < 100) {
                                        System.out.println("You do not have enough money");

                                   }
                                   else if (Animal.getAdoptionRate() >= 80) {
                                        System.out.println("Can not increase adoption rate more than 80%");

                                   }
                                   else if (Game.getBalance() < 80) {
                                        Animal.increaseRate();
                                        System.out.println(PetShop.getName() + "'s' adoption rate is now " + Animal.getAdoptionRate() + "%!");

                                   }
                                   System.out.println("Do you wish to return to the menu? (y/n)");
                                   reply = input.nextLine();
                                   if (reply.equalsIgnoreCase("n")) {
                                        break;
                                   }

                              }
                              else if (num == 4) {
                                   System.out.println();
                                   System.out.println("It is has been " + Game.getDay() + " day's since " + PetShop.getName() + " has opened.");
                                   System.out.println("Every month you spend " + Game.calculateBills() + " per month on animal food, grooming, medication, bills, and staffing.");
                                   System.out.println("You currently have $" + Game.getBalance() + " and shelter " + Animal.getNumPets() + " pets.");
                                   System.out.println("You have helped " + Animal.getPetsAdopted() + " pets get adopted and " + PetShop.getName() + "'s adoption rate is " + Animal.getAdoptionRate() + "%!");
                                   System.out.println();
                                   System.out.println("Do you wish to return to the menu? (y/n)");
                                   reply = input.nextLine();
                                   if (reply.equalsIgnoreCase("n")) {
                                        break;
                                   }

                              }
                              else if (num == 5) {
                                   Game.workerTalks();
                                   System.out.println("What do you want to say?");
                                   System.out.print(Game.getName() + ": ");
                                   input.nextLine();
                                   input.nextLine();
                                   System.out.println("Worker: Meh");
                                   System.out.println("Do you wish to return to the menu? (y/n)");
                                   reply = input.nextLine();
                                   if (reply.equalsIgnoreCase("n")) {
                                        break;
                                   }
                              }
                         }
                    }

                    Animal.adopt();
                    // end of day sequence
                    if (Game.play()) {
                         System.out.println("Congratulations! You've made it to the end of Day " + Game.getDay() + ".");
                         System.out.println(PetShop.petsAdoptedToday() + " pets were adopted today!");
                         Game.moveForward();
                         Game.payBills();
                    }
                    else if (!Game.play()) {
                         System.out.println("GAME OVER");
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
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Pet~~~~~~~~~~~~~~~~");
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
// add exception handling for arithmetic exceptions and to prevent unrealistic statistics