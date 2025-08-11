package AbstractFactoryDP;

public class Driver {
    public static void main(String[] args) {
        // Using NoteBookFactory
        BookFactory notebookFactory = new NoteBookFactory();
        NoteBook longNote = notebookFactory.createLongBook();
        NoteBook shortNote = notebookFactory.createShortBook();

        if (longNote != null)
            longNote.writing();
        if (shortNote != null)
            shortNote.writing();

        // Using TextBookFactory
        BookFactory textBookFactory = new TextBookFactory();
        TextBook longText = textBookFactory.createLongTextBook();
        TextBook shortText = textBookFactory.createShortTextBook();

        if (longText != null)
            longText.reading();
        if (shortText != null)
            shortText.reading();
    }
}
