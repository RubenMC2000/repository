package org.academiadecodigo.parabelosbugsters;

import java.util.stream.Stream;

public class HolyTrinity {

    public static void main(String[] args){
        HolyTrinity holyTrinity = new HolyTrinity();
        holyTrinity.removeGarbage();
    }

    private String message = "I'll send an SOS to the garbage world, " +
            "I hope that someone garbage gets my message in a garbage bottle.";

    public void removeGarbage(){
        System.out.println(Stream.of(message)
                .map(word -> word.replaceAll("garbage", ""))
                .map(String::toUpperCase)
                .reduce("", (acc, elem) -> acc + elem));
    }
}
