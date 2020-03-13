package org.academiadecodigo.parabelosbugsters;

import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args){
        PerfectNumbers perfectNumbers = new PerfectNumbers();
    }

    public Main2() {
        //System.out.println(sumDivisors(76764685));
        checkPerfects(1, 999999999);
    }

    public int sumDivisors(int n){
        return IntStream.range(1, n)
                .filter(x -> n % x == 0)
                //.peek(System.out::println)
                .sum();
    }

    public void checkPerfects(int min, int max){
        IntStream.rangeClosed(min, max)
                .filter(x -> sumDivisors(x) == x).parallel().forEach(System.out::println);
    }

}
