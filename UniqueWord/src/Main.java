public class Main {

    public static void main(String[] args) {

        String words = "rui rui rui campelo campelo campelo test abc abc";
        UniqueWord wc = new UniqueWord(words);

        for (Object word: wc) {
            System.out.println(word);
        }

    }

}
