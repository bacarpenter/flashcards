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

    /**
     * Add card to top of deck
     * 
     * @param card
     */
    public void addCard(Flashcard card) {
        cards.add(card);
    }

    /**
     * Get card from index in deck
     * 
     * @param i
     * @return
     */
    public Flashcard get(int i) {
        return cards.get(i);
    }

    /**
     * Get ArrayList of cards
     * 
     * @return
     */
    public ArrayList<Flashcard> getAll() {
        return cards;
    }

    /**
     * Delete card at index
     * 
     * @param i
     */
    public void deleteCard(int i) {
        cards.remove(i);
    }

    /**
     * Delete card at top of deck
     */
    public void deleteCard() {
        cards.remove(cards.size() - 1);
    }

    /**
     * Clean all cards in cards
     */
    public void cleanAll() {
        for (Flashcard card : cards) {
            card.cleanCard();
        }
    }

    /**
     * Get index of all flaged cards in the deck
     * 
     * @return
     */
    public ArrayList<Integer> getFlagged() {
        ArrayList<Integer> flaggedCards = new ArrayList<>();

        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).isFlagged()) {
                flaggedCards.add(i);
            }
        }

        return flaggedCards;
    }

}
