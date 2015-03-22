package tom.cup;

/**
 * Created by tom on 22/03/15.
 */
public class BrokenCup extends MusicCup {
    public void addWater(int w){
        System.out.println("a broken cup");
    }

    public void drinkWater(int w){
        System.out.println("cannot drink");
    }

}
