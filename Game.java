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

}