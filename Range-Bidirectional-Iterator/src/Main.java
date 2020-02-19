import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Range range = new Range( 5, 10);
        range.setDirection(Direction.BACK);
        Iterator<Integer> iterator = range.iterator();

        for(Integer i : range){
            System.out.println("Iteraded: " + i);
        }
    }
}
