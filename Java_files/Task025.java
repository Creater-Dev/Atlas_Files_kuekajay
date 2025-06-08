//// Code for showing error "ArrayIndexOutOfBoundsException"
public class Task025 {
    public static void main(String[] args) {
        int[] arr = new int[5]; 
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        // Attempting to access an index that is out of bounds
        System.out.println("Trying to access an out-of-bounds index: 5"); 
        System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
    }
}