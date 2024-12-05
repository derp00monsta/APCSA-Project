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
        this.type = chooseType();
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
            case 2:
                theName = "Lenovo";
            case 3:
                theName = "Tina Turner";
            case 4:
                theName = "Entity";
            case 5:
                theName = "Stella";
            case 6:
                theName = "Haeiza";
            case 7:
                theName = "Git";
            case 8:
                theName = "Calypso";
            case 9:
                theName = "Micheal Jackson";
            case 10:
                theName = "Mikayla";
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
                theType = "felis catus"; // cat
                break;
            case 2:
                theType =  "canis lupus familiaris"; // dog
                break;
            case 3:
                theType = "subphylum vertebrata"; // fish
                break;
            case 4:
                theType = "oryctolagus cuniculus"; // bunny
                break;
            case 5:
                theType = "sciuridae"; // squirrel
                break;
            case 6:
                theType = "aves"; // bird
                break;
            case 7:
                theType = "testudines"; // turtle
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
                color = "red bean";
                break;
            case 2:
                color = "orangutan";
                break;
            case 3:
                color = "green bean";
                break;
            case 4:
                color = "yellow bellow";
                break;
            case 5:
                color = "bluehoo";
                break;
            case 6:
                color = "browntown";
                break;
            case 7:
                color = "black bean";
                break;
            case 8:
                color = "right";
                break;
            case 9:
                color = "igbtqla!";
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
    public void transferTo(PetShop shop) {
        this.shop = shop;
        numPets++;

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
        if (type.equals("felus caticus")) { // cat
            System.out.println(""); 
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀");
            System.out.println("⠀⠀⠀⠀⢀⡴⣆⠀⠀⠀⠀⠀⣠⡀⠀⠀⠀⠀⠀⠀⣼⣿⡗");
            System.out.println("⠀⠀⠀⣠⠟⠀⠘⠷⠶⠶⠶⠾⠉⢳⡄⠀⠀⠀⠀⠀⣧⣿");
            System.out.println("⠀⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣤⣤⣤⣤⣤⣿⢿⣄");
            System.out.println("⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀⠀⠀⠙⣷⡴⠶⣦");
            System.out.println("⠀⠀⢱⡀⠀⠉⠉⠀⠀⠀⠀⠛⠃⠀⢠⡟⠀⠀⠀⢀⣀⣠⣤⠿⠞⠛⠋");
            System.out.println("⣠⠾⠋⠙⣶⣤⣤⣤⣤⣤⣀⣠⣤⣾⣿⠴⠶⠚⠋⠉⠁");
            System.out.println("⠛⠒⠛⠉⠉⠀⠀⠀⣴⠟⢃⡴⠛⠋");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠛⠛⠋⠁");
            System.out.println(""); 
        }
        else if (type.equals("Canis lupus familiaris")) { //dog
            System.out.println(""); 
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠶⣶⣶⣶⡒⠶⣄⡀⠀⠀⠀⠀"); 
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢠⡞⠁⠀⠀⠘⡿⠛⠻⣆⠹⡏⢱⡄⠀⠀"); 
            System.out.println("⠀⠀⠀⠀⠀⠀⢀⣠⣿⣷⣤⠀⠀⠀⠀⢠⡶⣮⠀⡇⢸⠃⠀⠀"); 
            System.out.println("⠀⠀⠀⠀⠀⠀⡏⣄⢻⡏⠁⣀⣄⠀⠀⠘⠉⠙⢧⡇⣿⠀⠀"); 
            System.out.println("⠀⠀⠀⠀⠀⠀⣧⢻⣄⠱⡈⣿⠟⠀⢠⣶⣶⠀⠀⢹⣾⡧⠀"); 
            System.out.println("⠀⠀⠀⠀⠀⠀⢻⡄⠉⠙⠻⡇⡆⠀⠀⠙⢿⠴⣲⡏⠀⠀⠀⠀"); 
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠉⠉⢙⣶⣤⡗⠒⠀⠚⠓⠊⠹⣷⠀⠀⠀⠀"); 
            System.out.println("⠀⢀⣀⠀⠀⠀⠀⣠⡞⠉⠟⠀⠀⠀⠀⠀⠀⠀⠀⢿⡇⠀⠀⠀"); 
            System.out.println("⣴⡷⢋⣴⠆⢀⣾⢻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⠀⠀⠀"); 
            System.out.println("⠈⢀⣾⠁⢠⠟⠁⠈⢿⣆⠀⠀⠀⢀⣀⠀⠀⠀⠀⢈⢻⠀⠀⠀"); 
            System.out.println("⠀⢸⣿⢀⡟⠀⠀⠀⢸⣿⣦⠀⠀⠈⡟⠀⠀⠀⣠⡿⠀⢇⠀⠀"); 
            System.out.println("⠀⠀⠹⣿⣧⣠⣶⣶⣿⣿⣿⠆⠀⢀⣼⡿⠟⠉⡼⠀⠠⠾⢧⡀"); 
            System.out.println("⠀⠀⠀⠈⠻⡉⢀⠀⣄⢈⡇⠀⠛⠋⢁⢣⠀⠀⠱⣤⡀⣳⢱⣹"); 
            System.out.println("⠀⠀⠀⠀⠀⠉⠉⠁⠉⠁⠙⠲⠤⠼⠼⠟⠀⠀⠀⠀⠉⠉⠉⠀"); 
            System.out.println(""); 
        }
        else if (type.equals("subphylum vertebrata")) { //fish
            System.out.println(""); 
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"); 
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⣿⣿⣿⣿⣷⣀⠀⠀⠀⠀⠀⠀⠀⠀"); 
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⡀⠀⠀⠀⠀"); 
            System.out.println("⠈⣿⣶⣤⡀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀"); 
            System.out.println("⠀⢹⣿⣿⣿⣷⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀"); 
            System.out.println("⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣿⡀"); 
            System.out.println("⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃"); 
            System.out.println("⠀⢸⣿⣿⣿⣿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀"); 
            System.out.println("⠀⣿⣿⠿⠋⠁⠀⠀⠉⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀"); 
            System.out.println("⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⡿⠿⠟⠋⠉⠀⠀⠀⠀⠀"); 
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⠿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"); 
            System.out.println(""); 
        }
        else if (type.equals("oryctolagus cuniculus")) { //bunny
            System.out.println(""); 
            
            System.out.println(""); 
        }
        else if (type.equals("sciuridae")) { //squirrel
            System.out.println(""); 

            System.out.println(""); 
        }
        else if (type.equals("aves")) { //bird
            System.out.println(""); 

            System.out.println(""); 
        }
        else if (type.equals("testudines")) { //turtle
            System.out.println(""); 

            System.out.println(""); 
        }
        
        return name + " is a " + color + " " + type + " that is " + age + " years old " + " and weighs " + weight + " kilograms.";

    }
}

