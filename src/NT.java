/**
 * Created by tom on 24/03/15.
 */
public class NT implements Runnable {
    public String toString(){
        return Thread.currentThread().getName();
    }

    public void run(){
        System.out.println(this);
    }
}
