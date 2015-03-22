/**
 * Created by tom on 22/03/15.
 */
public class Battery {
    private double power = 0.0;

    public void charge(double p){
        if(this.power < 1.){ //1. means 1 is a double, not a int
            this.power += p;
            if(this.power > 1.){
                this.power = 1.;
            }
        }
    }

    public boolean use(double p){
        if(this.power >= p){
            this.power -= p;
            return true;
        }
        else{
            this.power = 0;
            return false;
        }
    }
    public double getPower(){
        return this.power;
    }
}
