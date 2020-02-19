import java.util.Iterator;

public class Range implements Iterable<Integer> {

    private int initialNumber;
    private int finalNumber;
    private int currentNumber;

    public Range(int initialNumber, int finalNumber) {
        this.initialNumber = initialNumber;
        this.finalNumber = finalNumber;
        currentNumber = initialNumber -1;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    private class MyIterator<T> implements Iterator<Integer> {


        @Override
        public boolean hasNext() {
            while (currentNumber != finalNumber) {
                return true;
            }
            return false;
        }

        @Override
        public Integer next() {
            while (currentNumber != finalNumber) {
                currentNumber++;
                return currentNumber;

            }
            return currentNumber;
        }

        @Override
        public void remove() {

        }

    }
}
