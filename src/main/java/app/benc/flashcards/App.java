package app.benc.flashcards;

import java.util.ArrayList;

/**
 * Multiple methods for setting up flash cards they way I like!
 * 
 * @author bencarpenter
 */

public class App {
    public static void main(String[] args) {

        Flashcard f1 = new Flashcard("term", "term definition term definition termed term Hello, world. term");

        System.out.println(f1);
        f1.cleanCard();
        System.out.println(f1);

    }

    /**
     * Returns other answers for something like a Kahoot or Quizizz
     * 
     * @param flashcards
     * @param thisCard
     * @return
     */
    public static String[] otherAnswers(ArrayList<Flashcard> flashcards, Flashcard thisCard) {
        return new String[4];
    }
}