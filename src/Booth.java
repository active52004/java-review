/**
 * Created by tom on 24/03/15.
 */
public class Booth extends Thread {
    private static int threadID =0;

    private Reservior release;

    private int count = 0;

    public Booth(Reservior r){
        super("ID"+(++threadID));
        this.release = r;
        this.start();
    }

    public String toString(){
        return super.getName();
    }

    public void run(){
        while (true){
            if(this.release.sellTicket()){
                this.count++;
                System.out.println(this.getName()+":sell 1 ticket"); // this booth sold a ticket
                try{
                    sleep((int) Math.random()*100);//what is done by sleep?
                }
                catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
            else{
                break;//if all tickets are sold, jump out of the while loop
            }
        System.out.println(this.getName()+"I sold:"+this.count);
        }
    }
}
