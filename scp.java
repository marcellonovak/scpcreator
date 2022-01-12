import java.util.*;

public class scp {

    static Random rand = new Random();
    public static void main(String[] args) {
        
        // t - total # of paragraphs
        // p - total # of sentences per paragraph
        // s - total # of words per sentence
        // w - total # of letters per word

        System.out.println(makeSCP());
        
    }

    public static String newWord() {
        String word = "";
        int wLength = rand.nextInt(10); // 0-9
        wLength += 1; // Bounds now 1-10 letters
        for (int i = 0; i <= wLength; i++) {
            word += "█";
        }
        word += " ";

        return word;
    }

    public static String newSentence() {
        String sentence = "";
        int sLength = rand.nextInt(16); // 0-15
        sLength += 5; // Bounds now 5-20 words
        for (int j = 0; j <= sLength; j++) {
            String addedWord = newWord();
            sentence += addedWord;
        }

        sentence += "\n";

        return sentence;
    }

    public static String newParagraph() {
        String paragraph = "";
        int pLength = rand.nextInt(5); // 0-4
        pLength += 2; // Bounds now 2-6 sentences

        for (int i = 0; i <= pLength; i++) {
            String addedSentence = newSentence();
            paragraph += addedSentence;
        }

        paragraph += "\n";
        return paragraph;
    }

    public static String makeSCP() {
        String SCP = "";
        int tLength = rand.nextInt(10); // 0-3
        tLength += 3; // Bounds now 3-6 paragraphs
        for (int i = 0; i <= tLength; i++) {
            String addedParagraph = newParagraph();
            SCP += addedParagraph;
        }

        return SCP;
    }
    
}