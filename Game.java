public class Game {
    private static double balance;
    private static String name;
    private static int day;

    /**
     * Checks if the player is bankrupt. The player is bankrupt if their balance is 0
     * 
     * @return returns true if balance is 0
     */
    public static boolean isBankrupt() {
        if (balance <= 0) {
            return true;
        }
        else {
            return false;
        }

    }

    /**
     * Moves forward in time by one day
     * 
     */
    public static void moveForward() {
        day++;
        System.out.println("Moving forward by 1 day");

    }

    /**
     * Moves forward in time by a given number of days
     * 
     * @param days how many days the game moves forward by
     */
    public static void moveForward(int days) {
        day += days;
        System.out.println("Moving forward by" + days + "day");

    }

    /**
     * Returns the day in the simulator
     * 
     * @return day
     */
    public static int getDay() {
        return day;

    }

    /**
     * Returns the how much money the user has
     * 
     * @return balance
     */
    public static double getBalance() {
        return balance;

    }

    /**
     * Adds
     * 
     * @param money
     */
    public static void addToBalance(double money) {
        balance += money;

    }

    /**
     * Returns the players name
     * 
     * @return name
     */
    public static String getName() {
        return name;

    }

    /**
     * sets the player's balance
     * 
     * @param newBalance
     */
    public static void setBalance(double newBalance) {
        balance = newBalance;

    }

    /**
     * sets the player's name
     * 
     * @param newName
     */
    public static void setName(String newName) {
        name = newName;

    }

    /**
     * prints random dialogue for a worker 
     * 
     */
    public static void workerTalks() {
        int randoming = (int) (Math.random() * (9) + 1);
        switch(randoming) {
            case 1:
                System.out.println("Worker: Sup boss, when we getting paid?");
                break;
            case 2:
                System.out.println("Worker: Can I go on break yet? I wanna play Brawlstars!");
                break;
            case 3:
                System.out.println("Worker: Why can't I get the day off? It shouldn't matter if I got 3 days off last week!");
                break;
            case 4:
                System.out.println("Worker: What do you mean?? I wasn't on BlockBlast I was working on our website!");
                break;
            case 5:
                System.out.println("Worker: I said to GIVE ME A MINUTE BOSS, I'm talking to my grandma!");
                break;
            case 6:
                System.out.println("Worker: Hello welcome to the best (only) pet shop in town! How may you waste my time? Oh boss, I didn't see you there, I was just um answering the phone!");
                break;
            case 7:
                System.out.println("Worker: Hello World!");
                break;
            case 8:
                System.out.println("Worker: *On the phone*: No sir, we don't sell gorillas, I don't care if you toured Kenya twice!");
                break;
            case 9:
                System.out.println("Worker: Hey boss, I know I just started but I was wondering if I could get premoted to CEO, my dad's the CEO of Pinapple so you shouldn't have a problem with it");
        }
    
    }

    /**
     * prints options
     * 
     */
    public static void menu() {
        System.out.println("What would you like to do?");
        System.out.println("1 - Buy a new animal for $30");
        System.out.println("2 - Increase capacity ");
        System.out.println("3 - Spend $100 to increase the adoption rate by 5%");
        System.out.println("4 - Check expenses and statistics");
        System.out.println("5 - Converse with workers");
        System.out.println("6 - Wait");

    }
    
    /**
     * Pays for the expenses of a month
     */
    public static void payBills() {
        if (day % 30 == 0) {
            addToBalance(calculateBills());
        }
    }

    /**
     * Calculates how much the monthly bill costs
     * 
     * @return
     */
    public static double calculateBills() {
        return -(Animal.getNumPets() * 30) - 320;
    }

}
