package AbstractFactoryDP;

public class TextBookFactory implements BookFactory {

    public NoteBook createLongBook() {
        return null; // Not handled here
    }

    public NoteBook createShortBook() {
        return null; // Not handled here
    }

    public TextBook createLongTextBook() {
        return new LongTextBook();
    }

    public TextBook createShortTextBook() {
        return new ShortTextBook();
    }
}
