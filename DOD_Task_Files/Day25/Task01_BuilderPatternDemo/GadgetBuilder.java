public interface GadgetBuilder {
    GadgetBuilder buildStorage(int storage);

    GadgetBuilder buildMemory(int memory);

    Gadget build();
}