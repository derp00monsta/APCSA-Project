public class Animal {
    //primary object
    private String type;
    private int age;
    private double weight;
    private String color;
    private boolean isAlive;
    // private int health;
    // private double hunger;
    private PetShop shop;
    private String name;
    private static int numPets = 0;
    private static int petsAdopted = 0;

    /**
     * Creates a new animal with random attributes
     * 
     * @param type
     * @param name
     * @param shop 
     */
    public Animal(String type, String name, PetShop shop) {
        this.type = type;
        this.name = name;
        weight = chooseWeight();
        age = chooseAge();
        hunger = chooseHunger();
        health = chooseHealth();
        color = chooseColor();
        this.shop = shop;
                
    }

    /**
     * Creates a new animal with random attributes
     * 
     * @param name
     * @param shop
     */
    public Animal(String name) {
        this.type = chooseType();
        this.name = name;
        weight = chooseWeight();
        age = chooseAge();
        hunger = chooseHunger();
        health = chooseHealth();
        color = chooseColor();
        shop = null;
    
    }
    
    /**
    * Chooses a type at random for the animal
    * 
    * @return random type
    */
    private String chooseType() {
        int random = (int) (Math.random() * (7) + 1);
        switch(random){
            case 1:
                return "cat!";
                break;
            case 2:
                return "dog!";
                break;
            case 3:
                return "fish!";
                break;
            case 4:
                return "bunny!";
                break;
            case 5:
                return "squirrel!";
                break;
            case 6:
                return "bird!";
                break;
            case 7:
                return "turtle!";
                break;
        }

    }

    /**
    * Chooses an age at random for the animal
    * 
    * @return randomAge
    */
    private int chooseAge() {
        int randomAge = (int) (Math.random() * (15) + 1);
        return randomAge;
        
    }
    
    /**
     * Chooses a random weight of the animal in kg
     * 
     * @return random weight
    */
    private double chooseWeight() {
        int chance = (int) (Math.random() * (5) + 1);
        switch(chance){
            case 1:
                return 4.5;
                break;
            case 2:
                return 2.7;
                break;
            case 3:
                return 8.9;
                break;
            case 4:
                return 3.6;
                break;
            case 5:
                return 1.0;
                break;
        }

    }

    // /**
    // * Chooses at random the health of the animal
    // * 
    // * @return randomHealth
    // */
    // private int chooseHealth() {
    //     int randomHealth = (int) (Math.random() * (100) + 1);
    //     return randomHealth;
    // }

    // /**
    // * Chooses at random how hungry the animal is
    // * 
    // * @return randomHunger
    // */
    // private double chooseHunger() {
    //     int randomHunger = (int) (Math.random() * (49) + 1);
    //     return randomHunger;
    // }

    /**
     * Chooses at random what color the animal is
     * 
     * @return random String representing a color
     */
    private String chooseColor() {
        int randomizer = (int) (Math.random() * (9) + 1);
        switch(randomizer) {
            case 1:
                return "red";
                break;
            case 2:
                return "orange";
                break;
            case 3:
                return "green";
                break;
            case 4:
                return "yellow";
                break;
            case 5:
                return "blue";
                break;
            case 6:
                return "brown";
                break;
            case 7:
                return "black";
                break;
            case 8:
                return "white";
                break;
            case 9:
                return "multicolor!";
                break;
                
        }

    }

    /**
    * Gets the weight of the animal
    * 
    * @return weight
    */
    public double getWeight() {
        return weight;

    }

    /**
    * Gets the type of animal the animal is
    * 
    * @return type
    */
    public String getType() {
        return type;

    }

    /**
    * Gets the age of the animal
    * 
    * @return age
    */
    public int getAge() {
        return age;

    }

    /**
    * Gets the color of the animal
    * 
    * @return color
    */
    public double getColor() {
        return color;

    }

    /**
    * Gets the name of the animal
    * 
    * @return name
    */
    public String getName() {
        return name;

    }

    /**
    * Gets the shop the animal is at
    * 
    * @return shop
    */
    public PetShop getShop() {
        return shop;

    }

    /**
     * Gets how many pets there are
     * 
     * @return numPets
     */
    public static int getNumPets() {
        return numPets;

    }

    /**
     * Gets how many pets have been adopted
     * 
     * @return petAdopted
     */
    public static int getPetsAdopted() {
        return petsAdopted

    }

    /**
    * Sets the name of the animal
    * 
    * @param name
    */
    public void setName(String name) {
        this.name = name;

    }

    /**
    * Simulates the transfer of an animal to another shop
    * 
    * @param shop
    */
    public void transferTo(PetShop shop) {
        this.shop = shop;
        numPets++;

    }

    /**
    * Closes the animal object and removes it from memory
    * 
    */
    public void close() {
        this = null;

    }

    /**
     * Simulates a pet adoption by decreasing how many pets there are and increasing how many have been adopted
     * 
     */
    public static void adopt() {
        numPets--;
        petsAdopted++;

    }

    /**
     * String representation of the Animal
     * 
     * @return string description of animal
     */
    public String toString() {
        return name + " is a " + color + " " + type + " that is " + age + " years old " + " and weighs " + weight + " kilograms."

    }
}