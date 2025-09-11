import java.util.Hashtable;

public class CloneOfHuman {
    private static Hashtable<String, HumanBeing> sizeMap = new Hashtable<>();

    public static HumanBeing getSize(String sizeId) {
        HumanBeing cachedHuman = sizeMap.get(sizeId);
        return (HumanBeing) cachedHuman.clone();
    }

    public static void loadCache() {
        SpiderMan spider = new SpiderMan();
        spider.setName("Peter Parker");
        sizeMap.put("1", spider);

        BatMan bat = new BatMan();
        bat.setName("Bruce Wayne");
        sizeMap.put("2", bat);

        IronMan iron = new IronMan();
        iron.setName("Tony Stark");
        sizeMap.put("3", iron);
    }
}