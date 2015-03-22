import tom.cup.MusicCup;
import tom.human.Human;

/**
 * Created by tom on 17/03/14.
 */

import tom.human.*;

public class Test {
    public static void main(String[] args){
        System.out.println("Hello from IEDA");
        Human aPerson = new Human(170);
        aPerson.breath(2);
        aPerson.growHeight(2);
        System.out.println("height"+aPerson.getHeight());

        MusicCup mc = new MusicCup();
        mc.addWater(10);
        mc.Play();

        /*
        Torch newT = new Torch();
        newT.charge(10);
        newT.showPower();
        newT.turnOn(3);
        newT.showPower();
        newT.turnOn(6);
        newT.showPower();
        newT.turnOn(2);
        newT.showPower();
        */
        Woman newW = new Woman(20);
        Human newBaby = newW.giveBirth();
        System.out.println(newBaby.getHeight());

        newBaby.growHeight(120);
        Human dummy = newBaby;
        newBaby.growHeight(20);
        System.out.println(dummy.getHeight());

        newW.breath();

        System.out.println(Human.getPopulation());

        //Define as Food, create as Corn
        Food a1 = new Corn();
        a1.eat();
    }
}
