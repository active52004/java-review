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
        try{
            test(p);
        }
        catch (Exception e){
            System.out.println("catch exception");
            System.out.println(e.getMessage());
            p=0.0;
        }

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

    private void test(double p) throws Exception {//here should be throws
        if(p<0){
            Exception e = new Exception("p must be positive");
            throw e;
        }
    }
}
