/**
 * Created by tom on 24/03/15.
 */
public class NewThread extends Thread {
    private static int threadID = 0;

    public NewThread(){
        super("ID"+(++threadID));
    }

    public String toString(){
        return super.getName();
    }

    public void run(){
        System.out.println(this);//the NewThread obj is converted to a string
    }
}
