/**
 * Created by tom on 21/03/15.
 */
public class Torch {
    /*
    private int volume;

    public void turnOn(int time){
        if(this.volume >= time) this.volume -= time;
        else this.volume = 0;
    }

    public void charge(int time){}
*/
    private Battery newB = new Battery();

    public void turnOn(int hours){
        boolean usable;
        usable = this.newB.use(hours*0.1);
        if(!usable){
            System.out.println("please charge");
        }
    }
    public void charge(int hours) {
        this.newB.charge(hours * 0.2);
    }

    public void showPower(){
        System.out.println("power left "+this.newB.getPower());
    }
}
