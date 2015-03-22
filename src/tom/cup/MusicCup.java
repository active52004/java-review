package tom.cup;

import tom.cup.Cup;

/**
 * Created by tom on 21/03/15.
 */
public class MusicCup implements Cup, MusicPlayer {
    private int water = 0;
    public void addWater(int w){
        this.water += w;
    }
    public void drinkWater(int w){
        this.water -= w;
    }

    public int waterContent(){
        return this.water;
    }

    public void Play(){
        System.out.println("Hahahaha");
    }
}
