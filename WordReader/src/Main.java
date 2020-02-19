import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        WordReader wordReader = new WordReader("/Users/codecadet/workspace/WordReader/Shit/Cheese");

        for (String word : wordReader) {
            System.out.println(word);
        }

        Iterator<String> iterator = wordReader.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
