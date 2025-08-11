public class Main {
    public static void main(String[] args) {
        GadgetBuilder builder = new MobileGadgetBuilder();
        GadgetDirector director = new GadgetDirector(builder);

        Gadget mobile = director.constructGadget();
        mobile.showSpecs();
    }
}