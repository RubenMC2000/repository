import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class UniqueWord implements Iterable{

    //PROPERTIES
    private Set<String> set;
    private String[] words;

    //CONSTRUCTOR
    public UniqueWord(String word){
        words = word.split(" ");
        set = new HashSet<>();

        for (String wordss : this.words){
            set.add(wordss);
        }
    }

    //METHODS
    @Override
    public Iterator<String> iterator() {
        return set.iterator();
    }
/*
    //MY FUCKING ITERATOR
    private class MyIterator implements Iterator<String>{

        @Override
        public boolean hasNext() {
            while(set.iterator().hasNext()){
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            String result = set.iterator().next();
            set.remove(set.iterator().next());
            return result;
        }
    }*/
}
