package tom.GenericsTest;

/**
 * Created by tom on 13/04/15.
 * Pair class has a generic type T for its attributes and methods
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }
    public Pair(T f, T s) {
        this.first = f;
        this.second = s;
    }

    public T getFirst(){
        return this.first;
    }
    public void setFirst(T newFirst){
        this.first = newFirst;
    }

    public T getSecond() {
        return this.second;
    }
    public void setSecond(T newSecond) {
        this.second = newSecond;
    }
}
