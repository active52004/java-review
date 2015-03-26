package tom.human;
import  tom.cup.*;
/**
 * Created by tom on 21/03/15.
 */
public class Human {
    private int height;

    private static int population=0;
    public static boolean isMammal = false;//boolean type: default value is false;

    public Human(){
        Human.population++;
    }
    public Human(int h){
        this.height = h;
        Human.population++;
    }


    public int getHeight(){
        return this.height;
    }

    public void growHeight(int h){
        this.height += h;
    }

    private void breath(){
        System.out.println("hu........hu");
    }

    public void breath(int rep){
        int i=0;
        for(i=0;i<rep;i++){
            this.breath();
        }
    }

    public static int getPopulation(){
        return Human.population;
    }

    /*
    public void drink(MusicCup aCup, int w){
        aCup.drinkWater(w);
    }
    */
    public class Cup{
        private double water = 1.0;
        public double getWater(){
            return  this.water;
        }
        public void drinkWater(double w){
            this.water -= w;
        }
        public String whosCup(){
            return name;//inner class access outer field
        }
    }

    private Cup myCup;
    private String name;
    public Human(String n){
        this.myCup = new Cup();
        this.name = n;
        Human.population++;
    }
    public void drinkWater(double w){
        myCup.drinkWater(w);
        System.out.println(myCup.getWater());
    }
    public void changeName(String n){
        this.name = n;
    }

    public static class Chinese{
        public void speak(){
            System.out.println("Ni hao");
        }
    }

}
