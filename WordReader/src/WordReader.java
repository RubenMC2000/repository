import java.io.*;
import java.util.Iterator;

public class WordReader implements Iterable<String> {

    FileReader fileReader;
    BufferedReader bReader;

    WordReader(String filePath){
        try {
            bReader = new BufferedReader((fileReader = new FileReader(filePath)));
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
            System.exit(1);
            close();
        }
    }

    private void close(){
        try {
            bReader.close();
            fileReader.close();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    @Override
    public Iterator iterator() {
        return new WordIterator();
    }

    private class WordIterator implements Iterator<String> {

        private String[] words;
        private int index = 0;
        private String sentence;

        public WordIterator() {
           invokeLine();
        }

        public void invokeLine(){
            try {
                sentence = bReader.readLine();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            if (sentence != null) {
                words = sentence.split("[.,\\s\\n\\r\\t#/!;?:\"']+");

            }

        }

        @Override
        public boolean hasNext() {
            while(index <= words.length){
                if(index == words.length){
                    index = 0;
                    invokeLine();
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            while (index != words.length) {
                int indextemp = index;
                index++;
                return words[indextemp];
            }
            return words[index++];
        }

        @Override
        public void remove() {
            //--------
        }
    }
}
