package AbstractFactoryDP;

public class NoteBookFactory implements BookFactory {

    public NoteBook createLongBook() {
        return new LongNoteBook();
    }

    public NoteBook createShortBook() {
        return new ShortNoteBook();
    }

    public TextBook createLongTextBook() {
        return null; // Not handled here
    }

    public TextBook createShortTextBook() {
        return null; // Not handled here
    }
}
