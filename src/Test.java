import tom.cup.BrokenCup;
import tom.cup.MusicCup;
import tom.human.Human;

/**
 * Created by tom on 17/03/14.
 */

import tom.human.*;
import java.io.*;

public class Test {
    public static void main(String[] args){

        Reservior r = new Reservior(100);
        Booth b1 = new Booth(r);
        Booth b2 = new Booth(r);
        Booth b3 = new Booth(r);

        /*
        NewThread thread1 = new NewThread();
        NewThread thread2 = new NewThread();

        thread1.start();
        thread2.start();

        Thread t1 = new Thread(new NewThread(), "first");    //check the manual of Thread class
        Thread t2 = new Thread(new NewThread(), "second");

        t1.start();
        t2.start();
        */
        /*
        String name = "Tom Lau";
        System.out.println("Hello from IEDA");

        Human aPerson = new Human(170);
        Class c1 = aPerson.getClass();
        System.out.println(c1.getName());//c1 contains the properties of the class of aPerson

        aPerson.breath(2);
        aPerson.growHeight(2);
        System.out.println("height"+aPerson.getHeight());

        MusicCup mc = new MusicCup();
        mc.addWater(10);
        mc.Play();

        BrokenCup aB = new BrokenCup();
        mc = aB;
        mc.addWater(10);
        aPerson.drink(aB, 10);


        //Class c2 = Class.forName("Human");   //this way needs excepiton handling to ensure the class name exists
        //System.out.println(c2.getName());

        Class c3 = Woman.class;
        System.out.println(c3.getName());
        */

        /*
        //read content from filePath
        String filePath = "file.txt";//if place the file under project dir(idea_test), do not need absolute path
        String line = "";
        try{

            //BufferedReader br = new BufferedReader(new FileReader(filePath));
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        //write content to a file
        try{
            String content = "Tom loves Adele.";
            String filename = "new.txt";
            File f = new File(filename);

            if(!f.exists()){
                f.createNewFile();
            }

            FileWriter fw = new FileWriter(f.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
        */
        /*
        Torch newT = new Torch();
        newT.charge(10);
        newT.showPower();
        newT.turnOn(-1);
        newT.showPower();
        newT.turnOn(6);
        newT.showPower();
        newT.turnOn(2);
        newT.showPower();
        */

        /*
        Woman newW = new Woman(20);
        Human newBaby = newW.giveBirth();
        System.out.println(newBaby.getHeight());

        newBaby.growHeight(120);
        Human dummy = newBaby;
        newBaby.growHeight(20);
        System.out.println(dummy.getHeight());

        newW.breath();

        System.out.println(Human.getPopulation());

        //Define as Food, create as Corn
        Food a1 = new Corn();
        a1.eat();
        */
    }
}
