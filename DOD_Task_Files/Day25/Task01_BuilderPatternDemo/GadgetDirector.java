public class GadgetDirector {
    private GadgetBuilder gadgetBuilder;

    public GadgetDirector(GadgetBuilder gadgetBuilder) {
        this.gadgetBuilder = gadgetBuilder;
    }

    public Gadget constructGadget() {
        return gadgetBuilder
                .buildStorage(512)
                .buildMemory(16)
                .build();
    }
}