import java.util.Objects;

public class DBProxy implements DBExecutor {
    private String id;
    private DB db;

    public DBProxy(String id) {
        this.id = id;
        this.db = new DB();
    }

    @Override
    public void runQuery(String type) {
        if (type.equalsIgnoreCase("DELETE") && !Objects.equals(this.id, "ADMIN")) {
            System.out.println("Sorry, access denied for user [" + id + "] to execute " + type + " query.");
            return;
        }
        db.runIt(type, this.id);
    }
}
