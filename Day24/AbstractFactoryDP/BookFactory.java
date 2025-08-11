package AbstractFactoryDP;

public interface BookFactory {
    NoteBook createLongBook();

    NoteBook createShortBook();

    TextBook createLongTextBook();

    TextBook createShortTextBook();
}
