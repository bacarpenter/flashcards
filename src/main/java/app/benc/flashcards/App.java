package app.benc.flashcards;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Holder of the main method
 * 
 * @author bencarpenter
 */

public class App {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        // Open file
        try {
            File cardFile = new File("./cards.txt");
            Scanner input = new Scanner(cardFile);

            while (input.hasNextLine()) {
                String term = input.nextLine();
                String def = input.nextLine();

                Flashcard currentCard = new Flashcard(term, def);
                deck1.addCard(currentCard);
            }

            input.close();
        } catch (Exception FileNotFoundException) {
            System.out.println("Error. cards.txt is not in this directory.");
            System.exit(1);
        }

        for (int i = 0; i < deck1.size(); i++) {
            System.out.println(deck1.get(i));
        }

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