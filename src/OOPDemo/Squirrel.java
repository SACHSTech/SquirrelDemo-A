package OOPDemo;

/**
 * Squirrel object definition
 */
public class Squirrel{

    // instance variable
    Double heightDouble;
    Double weightDouble;
    String colourString;
    String speciesString;
    String nameString;
    int healthInt;

    // constructor

    /**
     * Squirrel Constructor
     * @param newHeightDouble
     * @param newWeightDouble
     * @param newColourString
     * @param newSpeciesString
     * @param newNameString
     */
    public Squirrel(Double newHeightDouble, Double newWeightDouble, String newColourString, String newSpeciesString, String newNameString){

        this.healthInt = 100;
        this.heightDouble = newHeightDouble;
        this.weightDouble = newWeightDouble;
        this.colourString = newColourString;
        this.speciesString = newSpeciesString;
        this.nameString = newNameString;
    }

    // instance methods

    /** 
     * Store the nuts
     */
    public void storeNuts(){
        System.out.println("Store deez nuts");
    }

    /**
     * walk around
     */
    public void walk(){
        System.out.println("Walking ...");
    }

    /**
     * Climb a tree
     */
    public void climbTree(){
        System.out.print("Climb tree");
    }

    /**
     * get the health value
     * @return the health of the Squirrel
     * */
    public int getHealth(){
        return this.healthInt;
    }

    /**
     * Scramble around
     */
    public void scramble(){
        System.out.println("SCRAMBLE!!!");
    }

    /**
     * take hit to health
     */
    public void injury(){
        this.healthInt--;
    }
}