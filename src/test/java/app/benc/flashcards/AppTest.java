package app.benc.flashcards;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Test Flashcard methods
     */
    @Test
    public void cardCleaner1() {
        Flashcard f1 = new Flashcard("term", "definition term definition");
        f1.cleanCard();
        assertEquals("definition [this] definition", f1.getDefinition());

    }

    @Test
    public void cardCleaner2() {
        Flashcard f1 = new Flashcard("term", "definition term definition term Hello, world. term");
        f1.cleanCard();
        assertEquals("definition [this] definition [this] Hello, world. [this]", f1.getDefinition());

    }

    @Test
    public void cardCleaner3() {
        Flashcard f1 = new Flashcard("term", "definition term definition term Hello, world. term");
        f1.cleanCard();
        assertEquals("definition [this] definition [this] Hello, world. [this]", f1.getDefinition());

    }

    @Test
    public void cardCleaner4() {
        Flashcard f1 = new Flashcard("term", "definition term definition term Hello, world. term");
        f1.cleanCard();
        assertEquals("definition [this] definition [this] Hello, world. [this]", f1.getDefinition());

    }

    @Test
    public void flagged1() {
        Flashcard f1 = new Flashcard("term", "definition term definition term Hello, world. term");
        f1.cleanCard();
        assertTrue(f1.isFlagged());

    }

    @Test
    public void flagged2() {
        Flashcard f1 = new Flashcard("term", "definition term definition termed term Hello, world. term");
        f1.cleanCard();
        assertTrue(f1.isFlagged());

    }

    @Test
    public void flagged3() {
        Flashcard f1 = new Flashcard("term", "definition definition  Hello, world.");
        f1.cleanCard();
        assertFalse(f1.isFlagged());

    }

    @Test
    public void deck1() {
        Flashcard f1 = new Flashcard("term", "definition definition  Hello, world.");
        Deck deck1 = new Deck();
        deck1.addCard(f1);

        assertEquals(f1, deck1.get(0));
    }

    @Test
    public void deck2() {
        Flashcard f1 = new Flashcard("term", "definition definition Hello, world.");
        Flashcard f2 = new Flashcard("term", "definition term definition termed term Hello, world. term");

        Deck deck1 = new Deck();
        deck1.addCard(f1);
        deck1.addCard(f2);

        deck1.cleanAll();

        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(1);

        assertEquals(numList, deck1.getFlagged());
    }

}
