package org.academiadecodigo.papabelosbugsters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class FileAnalyzer {

    public static void main(String[] args) {
        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        fileAnalyzer.readFile();
    }

    private File file = new File("file");
    private BufferedReader bufferedReader;

    public FileAnalyzer() {
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void countWords(){

        Stream.of(bufferedReader)
                .map(lines -> lines.readLine())
                //.map(lines -> lines.split(" "))
                .forEach(lines -> System.out::println);
    }

    public void readFile(){
        Stream.of
    }

    public void findWordByNumberChar(){

    }

    public void findLongestWord(){

    }
}
