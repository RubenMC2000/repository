import java.util.Iterator;

public class Range implements Iterable<Integer> {

    //PROPERTIES
    private int initialNumber;
    private int finalNumber;
    private int currentNumber;
    private Direction direction;
    private boolean cantStop = true;

    //CONSTRUCTOR
    public Range(int initialNumber, int finalNumber) {
        this.initialNumber = initialNumber;
        this.finalNumber = finalNumber;
        }

    //METHODS
    public void setDirection(Direction direction) {
        this.direction = direction;

        switch (direction) {
            case FRONT:
                currentNumber = initialNumber -1;
                break;

            case BACK:
                currentNumber = finalNumber +1;
                break;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iterator;

        switch (direction) {
            case FRONT:
                
                iterator = new Iterator() {
                    @Override
                    public boolean hasNext() {
                        while(currentNumber != finalNumber){
                            return true;
                        }
                        return false;
                    }

                    @Override
                    public Integer next() {
                        while(currentNumber != finalNumber){
                            currentNumber++;
                            return currentNumber;
                        }
                        return currentNumber;
                    }
                };
                break;
                
            case BACK:
                iterator = new Iterator() {
                    @Override
                    public boolean hasNext() {
                        while(currentNumber != initialNumber){
                            return true;
                        }
                        return false;
                    }

                    @Override
                    public Integer next() {
                        while(currentNumber != initialNumber){
                            currentNumber--;
                            return currentNumber;
                        }
                        return currentNumber;
                    }
                };
                break;

            default:
                throw new IllegalStateException();
        }
       return iterator; 
    }
}