public class PetShop {
    private static String name;
    // private int numPets;
    private static int capacity;
    // private static int totalPets = 0;
    // private static int numShops = 0;

    /**
     * Returns the cost of increasing capacity
     * 
     * @param newCapacity of pet shop
     * @return cost of increasing capacity
     */
    public static double increaseCapacityCost(int newCapacity) {
        capacity = newCapacity;
        return (newCapacity - capacity) * 50;

    }

    /**
     * Increases the capacity of the pet shop by the given amount
     * 
     * @param newCapacity of pet shop
     */
    public static void increaseCapacity(int newCapacity) {
        capacity = newCapacity;
        Game.addToBalance((newCapacity - capacity) * 50);

    }

    // /**
    //  * Closes the shop and deletes the object
    //  * 
    //  */
    // public void closeShop() {
    //     this = null;
    //     // numShops--;
    //     // numPets -= this

    // }

    // /**
    //  * Returns how many shops have been created and are still open
    //  * 
    //  * @return total number of shops opened
    //  */
    // public static int getNumShops() {
    //     return numShops;

    // }

    // /**
    //  * Returns how many pets are in all shops
    //  * 
    //  * @return total number of pets
    //  */
    // public static int getTotalPets() {
    //     return totalPets;

    // }

    // /**
    //  * Adds a pet to the shop
    //  * 
    //  */
    // public void addPet() {
    //     numPets++;
    //     totalPets++;

    // }


    /**
     * Returns how many pets the shop can hold
     * 
     * @return capacity
     */
    public static int getCapacity() {
        return capacity;

    }

    /**
     * Returns the name of the shop
     * 
     * @return name
     */
    public static String getName() {
        return name;
    }

    /**
     * sets the shop's name
     * 
     * @param newName
     */
    public static void setName(String newName) {
        name = newName;

    }
    

}