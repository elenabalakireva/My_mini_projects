import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min + 1;
        this.max = max + 1;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return new Random().nextInt(max - min) + min;
            }
        };
    }
}
