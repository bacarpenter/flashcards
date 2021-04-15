package app.benc.flashcards;

/**
 * Flashcard class built with the build-class python script
 * https://github.com/bacarpenter/build-class
 */

public class Flashcard {
    private String term;
    private String definition;
    private boolean flag;

    // Constructors
    public Flashcard(String newTerm, String newDefinition) {
        term = newTerm;
        definition = newDefinition;
        flag = false;
    }

    // Accessor Methods
    public String getTerm() {
        return term;
    }

    public String getDefinition() {
        return definition;
    }

    public boolean isFlagged() {
        return flag;
    }

    // Setter Methods
    public void setTerm(String newTerm) {
        term = newTerm;
    }

    public void setDefinition(String newDefinition) {
        definition = newDefinition;
    }

    public void setFlag(boolean newFlag) {
        flag = newFlag;
    }

    // My methods
    public void cleanCard() {
        // Test if \space term \space exists
        if (definition.indexOf(term) != -1) {
            flag = true;
        }
        definition = definition.replaceAll(term, "[this]");
        return;
    }

    @Override
    public String toString() {
        return "Flash Card = term: " + term + " def: " + definition + " flagged: " + flag;
    }
}