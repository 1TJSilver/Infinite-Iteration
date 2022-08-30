import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterable<Integer>{
    private Random random;
    int min, max;
    public RandomIterator (int min, int max){
        random = new Random();
        this.min = min;
        this.max = max;
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
                return random.nextInt(min, max + 1);
            }
        };
    }

}
