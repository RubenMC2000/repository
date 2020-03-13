package org.academiadecodigo.papabelosbugsters;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FileAnalyzer {

    public static void main(String[] args) {
        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        try {
            fileAnalyzer.countWords();
            fileAnalyzer.findWordByNumberChar();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stream<String> readFile() throws IOException {
        return Files.lines(Paths.get("file"))
                .filter(lines -> !lines.equals(""))
                .map(lines -> lines.split(" "))
                .flatMap(words -> Arrays.stream(words));
    }


    public Stream<String> readFileBuffer() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("file"));

        return bufferedReader.lines
    }

    public void countWords() throws IOException {
        System.out.println(readFile().count());
    }

    public void findWordByNumberChar() throws IOException {
                readFile()
                .filter(words -> words.)
    }

    public void findLongestWord(){
                readFile()
                .filter(words -> words.)
    }
}
