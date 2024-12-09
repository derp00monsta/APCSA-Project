public class Animal {
    //primary object
    private String type;
    private int age;
    private double weight;
    private String color;
    // private boolean isAlive;
    // private int health;
    // private double hunger;
    private PetShop shop;
    private String name;
    private static int numPets = 0;
    private static int petsAdopted = 0;
    private static int adoptionRate = 40;

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
        // hunger = chooseHunger();
        // health = chooseHealth();
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
        // hunger = chooseHunger();
        // health = chooseHealth();
        color = chooseColor();
        shop = null;
    
    }

        /**
     * Creates a new animal with random attributes
     * 
     * @param shop
     */
    public Animal() {
        type = chooseType();
        name = chooseName();
        weight = chooseWeight();
        age = chooseAge();
        // hunger = chooseHunger();
        // health = chooseHealth();
        color = chooseColor();
        shop = null;
    
    }
    
    private String chooseName(){
        int randoming = (int) (Math.random() * (10) + 1);
        String theName = "";
        switch(randoming) {
            case 1:
                theName = "Nova";
                break;
            case 2:
                theName = "Lenovo";
                break;
            case 3:
                theName = "Tina Turner";
                break;
            case 4:
                theName = "Entity";
                break;
            case 5:
                theName = "Stella";
                break;
            case 6:
                theName = "Haeiza";
                break;
            case 7:
                theName = "Git";
                break;
            case 8:
                theName = "Calypso";
                break;
            case 9:
                theName = "Micheal Jackson";
                break;
            case 10:
                theName = "Mikayla";
                break;
        }

        return theName;
    }

    /**
    * Chooses a type at random for the animal
    * 
    * @return random type
    */
    private String chooseType() {
        int random = (int) (Math.random() * (7) + 1);
        String theType = "";
        switch(random) {
            case 1:
                theType = "felis catus (cat)"; // cat
                break;
            case 2:
                theType =  "canis lupus familiaris (dog)"; // dog
                break;
            case 3:
                theType = "subphylum vertebrata (fish)"; // fish
                break;
            case 4:
                theType = "oryctolagus cuniculus (bunny)"; // bunny
                break;
            case 5:
                theType = "sciuridae (squirrel)"; // squirrel
                break;
            case 6:
                theType = "aves (bird)"; // bird
                break;
            case 7:
                theType = "testudines (turtle)"; // turtle
                break;
        }

        return theType;

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
        double weight = 0.0;
        switch(chance){ 
            case 1:
                weight = 4.5;
                break;
            case 2:
                weight = 2.7;
                break;
            case 3:
                weight = 8.9;
                break;
            case 4:
                weight = 3.6;
                break;
            case 5:
                weight = 1.0;
                break;
        }
        return weight;

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
        String color = "";
        switch(randomizer) {
            case 1:
                color = "red";
                break;
            case 2:
                color = "orange";
                break;
            case 3:
                color = "green";
                break;
            case 4:
                color = "yellow bellow";
                break;
            case 5:
                color = "bluehoo";
                break;
            case 6:
                color = "brown";
                break;
            case 7:
                color = "black";
                break;
            case 8:
                color = "white";
                break;
            case 9:
                color = "multicolor";
                break;
                
        }
        return color;

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
    public String getColor() {
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
        return petsAdopted;

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
    public void transferTo(PetShop shop) throws Exception {
        if (Animal.getNumPets() >= PetShop.getCapacity()) {
            throw new Exception("You have already reached capacity! Would you like to increase capacity? (y/n)");
        }
        this.shop = shop;
        numPets++;

    }

    /**
     * Simulates a pet adoption by decreasing how many pets there are and increasing how many have been adopted
     * 
     */
    public static void adopt() {
        int random = (int)(Math.random() * 101 + 1);
        if (random > adoptionRate && numPets > 0) {
            numPets--;
            petsAdopted++;
            Game.addToBalance((int)(Math.random() * (64) + 1));
            PetShop.petAdopted();
        }

    }

    /**
     * increases adoption rate by 5
     * 
     */
    public static void increaseRate() throws Exception {
        if (Game.getBalance() < 100) {
            throw new Exception("You do not have enough money.");
        }
        adoptionRate += 5;
        Game.addToBalance(-100);

        }


    /**
     * returns the adoption rate
     * 
     * @return adoptionRate
     */
    public static int getAdoptionRate() {
        return adoptionRate;
    }

    // /**
    //  * changes the value for paying for food
    //  * 
    //  */
    // public static void feed() {
    //     Game.addToBalance(-(getNumPets() * 15));

    // }

    /**
    * Adds a pet to the shop
    * 
    */
    public static void addPet() {
        numPets++;

    }

    /**
     * String representation of the Animal
     * 
     * @return string description of animal
     */
    public String toString() {        
        return name + " is a " + color + " " + type + " that is " + age + " year(s) old and weighs " + weight + " kilograms.";

    }
}