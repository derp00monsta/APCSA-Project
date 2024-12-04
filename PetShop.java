public class PetShop {
    private String name;
    // private int numPets;
    private int capacity;
    // private static int totalPets = 0;
    // private static int numShops = 0;

    /**
     * Creates a new pet shop
     * 
     * @param name the name of the shop
     */
    public PetShop(String name) {
        this.name = name;
        capacity = 10;
        numPets = 0;
        numShops++;
        
    }

    /**
     * cost of increasing capacity
     * 
     */
    public double increaseCapacityCost(int newCapacity) {
        capacity = newCapacity;
        balance -= (newCapacity - capacity) * 50;
        return (newCapacity - capacity) * 50;
        // should throw an exception if too expensive
    }

    /**
     * Increases the capacity of the pet shop by the given amount
     * 
     */
    public void increaseCapacity(int newCapacity) {
        capacity = newCapacity;
        balance -= (newCapacity - capacity) * 50;
        // should throw an exception if too expensive
    }

    /**
     * Closes the shop and deletes the object
     */
    public void closeShop() {
        this = null;
        numShops--;
        numPets -= this

        //should throw an exception if there are still animals at the shelter
    }

    /**
     * Returns how many pets live in the shop
     * 
     * @return number of pets
     */
    public int getNumPets() {
        return numPets;
    }

    /**
     * Returns how many shops have been created and are still open
     * 
     * @return total number of shops opened
     */
    public static int getNumShops() {
        return numShops;
    }

    /**
     * Returns how many pets are in all shops
     * 
     * @return total number of pets
     */
    public static int getTotalPets() {
        return totalPets;
    }

    /**
     * Adds a pet to the shop
     * 
     */
    public void addPet() {
        numPets++;
        totalPets++;
    }


    /**
     * Returns how many pets are in all shops
     * 
     * @return capacity
     */
    public static int getCapacity() {
        return capacity;
    }
    

}