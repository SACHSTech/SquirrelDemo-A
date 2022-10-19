package OOPDemo;

import java.beans.Beans;

import OOPDemo.Squirrel;

public class SquirrelDemo {

    public static void main(String[] args) {
        Squirrel walterSquirrel;
        Squirrel jesseSquirrel;
        Squirrel beanSquirrel;
        Squirrel alvinSquirrel;

        walterSquirrel = new Squirrel(20.3, 10.5, "brown", "Brown", "Walter");
        jesseSquirrel = new Squirrel(25.1, 2.6, "Gray", "Western Gray Squirrel", "Jesse");
        beanSquirrel = new Squirrel(43.8, 15.1, "Black", "Black Squirrel", "Beans");
        alvinSquirrel = new Squirrel(12.3, 5.2 , "Brown", "Chipmunk", "Alvin");


        walterSquirrel.walk();
        jesseSquirrel.storeNuts();
        beanSquirrel.scramble();
        alvinSquirrel.injury();

        System.out.println("Alvin's Health:" + alvinSquirrel.getHealth());

    }


    
}
