public class Game {
    private double balance;
    private String name;
    private int day;

    /**
     * Creates a new game
     * 
     * @param balance double amount of how much money the player has
     * @param name name of the player
     */
    public Game(double balance, String name) {
        this.balance = balance;
        this.name = name;
        day = 0;

    }

    /**
     * Checks if the player is bankrupt. The player is bankrupt if their balance is 0
     * 
     * @return returns true if balance is 0
     */
    public boolean isBankrupt() {
        if (balance =< 0) {
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
    public void moveForward() {
        day++;
    }

    /**
     * Moves forward in time by a given number of days
     * 
     * @param days how many days the game moves forward by
     */
    public void moveForward(int days) {
        day += days;
    }

    /**
     * Returns the day in the simulator
     * 
     * @return day
     */
    public int getDay() {
        return day;
    }

    /**
     * Returns the how much money the user has
     * 
     * @return balance
     */
    public int getBalance() {
        return balance;
    }

}