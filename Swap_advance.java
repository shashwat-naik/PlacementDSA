public class Swap_advance {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println("Before: " + x + " " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After: " + x + " " + y);
    }
}
