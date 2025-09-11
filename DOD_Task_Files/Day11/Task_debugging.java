public class Task_debugging {
    public static void main(String args[]) {
      System.out.println(debugging());
    }
    
    public static int debugging() {
        int num = investigate();
        num++;
        return num;
    }
    
    public static int investigate() {
        int found = 5;
        return found;
    }}
