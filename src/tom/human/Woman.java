package tom.human;

/**
 * Created by tom on 22/03/15.
 */
public class Woman extends Human {
    public Human giveBirth(){
        Human tmp = new Human(20);
        return tmp;
    }

    public Woman(int h){
        super(h);
    }

    public void breath(){
        super.breath(2);
        System.out.println("su.....su");
    }

}
