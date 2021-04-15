package app.benc.flashcards;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Flashcard> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    public Deck(ArrayList<Flashcard> cards) {
        this.cards = cards;
    }

}
