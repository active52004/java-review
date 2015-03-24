/**
 * Created by tom on 24/03/15.
 */
public class Reservior {
    private int total;

    public Reservior(int t){
        this.total = t;
    }

    public synchronized boolean sellTicket(){
        if(this.total >0){
            this.total--;
            return true;
        }
        else {
            return false;
        }
    }
}

