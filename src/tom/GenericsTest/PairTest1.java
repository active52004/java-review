package tom.GenericsTest;

/**
 * Created by tom on 13/04/15.
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Tom", "Adele","are","couples"};
        //the type of T is casted during the calling of method minMax
        Pair<String> mm = ArrayAlg.minMax(words);
        if(mm != null) {
            System.out.println(mm.getFirst());
            System.out.println(mm.getSecond());
        }
    }
}
