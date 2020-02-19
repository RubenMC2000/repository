package HistogramInheritance;

import java.util.HashMap;
import java.util.Iterator;

public class HistogramIn extends HashMap<String,Integer> implements Iterable<String> {

    //PROPERTIES

    //CONSTRUCTOR
    public HistogramIn(String word){
        for (String key: word.split(" ")) {
            int result = containsKey(key) ? get(key) : 0;
            put(key, result +1);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return keySet().iterator();
    }

    //METHODS
}
