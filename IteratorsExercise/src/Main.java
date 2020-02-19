import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Range range = new Range(5, 10);

        Iterator<Integer> iterator = range.iterator();
/*
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
*/
        for (Integer i : range) {
            System.out.println("Iteraded: " + i);
        }

    }

}
