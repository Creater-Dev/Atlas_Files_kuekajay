public class ClientProxyDP {
    public static void main(String[] args) {
        DBExecutor adminExecutor = new DBProxy("ADMIN");
        adminExecutor.runQuery("READ");
        adminExecutor.runQuery("UPDATE");
        adminExecutor.runQuery("DELETE");

        System.out.println("-----------------------------");

        DBExecutor managerExecutor = new DBProxy("MANAGER");
        managerExecutor.runQuery("READ");
        managerExecutor.runQuery("UPDATE");
        managerExecutor.runQuery("DELETE");
    }
}
