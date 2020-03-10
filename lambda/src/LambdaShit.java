import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaShit {

    private List<Integer> numbers = Arrays.asList(8, 9, 200, 0, -1, 345);

    public void sortNumbers(){
        Collections.sort(numbers, (i1, i2) -> i1 - i2);
    }

    public void print(){
        for(int i = 0; i < numbers.size(); i++)
            System.out.println(numbers.get(i));
    }

    public static void main(String[] args){

        LambdaShit lambdaShit = new LambdaShit();
        lambdaShit.sortNumbers();
        lambdaShit.print();

    }
}
