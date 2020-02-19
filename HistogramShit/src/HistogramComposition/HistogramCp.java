package HistogramComposition;

import java.util.*;

public class HistogramCp implements Iterable<String> {

    //PROPERTIES
    private Map<String,Integer> hashMap;

    //CONSTRUCTOR
    public HistogramCp(String word) {
        hashMap = new LinkedHashMap<>();

        for (String key: word.split(" ")) {
            int result = hashMap.containsKey(key) ? hashMap.get(key) : 0;
            hashMap.put(key,result +1);
        }
        }
    //METHODS

    public int size(){
        return hashMap.size();
    }

    public int get(String key){
        return hashMap.get(key);
    }

    @Override
    public Iterator iterator() {
        return hashMap.keySet().iterator()  ;
    }
}
