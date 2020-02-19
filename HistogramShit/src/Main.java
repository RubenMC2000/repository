import HistogramComposition.HistogramCp;
import HistogramInheritance.HistogramIn;

public class Main {

    public static void main(String[] args) {
        String words ="How many snacks " + "could a snack stacker stack , " + "if a snack stacker " + "snacked stacked snacks ?";
        //HistogramCp histogram = new HistogramCp(words);
        HistogramIn histogram = new HistogramIn(words);

        System.out.println("Histogram contains " + histogram.size() + " unique words.");

        for (String w: histogram) {
            System.out.println(w + ": " + histogram.get(w));
       }
    }

}
