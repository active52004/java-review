package tom.GenericsTest;

/**
 * Created by tom on 13/04/15.
 */
public class ArrayAlg {
    /**
     * Get the min and max of a array whose elements are type T
     * @param a type T array
     * @return a pair with min and max or null
     * T extends compariable should be put before return type
     */
    public static <T extends  Comparable> Pair<T> minMax(T[] a) {
        if( a==null || a.length == 0) {return null;}
        T min = a[0];
        T max = a[0];
        //to compare two string , do not use < or >, use stringA.compareTo(stringB) and see whether this value
        // is creater than 0 or not
        for(int i=1;i<a.length;i++) {
            if(max.compareTo(a[i])<0) {
                max = a[i];
            }

            if(min.compareTo(a[i])>0) {
                min = a[i];
            }
        }

        return new Pair<T>(min, max);
    }


}
