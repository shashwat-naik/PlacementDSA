import java.util.Stack;

public class Remove_ConsecutiveChar {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<String> store = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char x : s.toCharArray()) {
            if (!store.isEmpty() && store.peek().equals(String.valueOf(x)))
                store.pop();
            else
                store.push(String.valueOf(x));
        }

        while (!store.isEmpty()) {
            ans.insert(0, store.pop());
        }
        System.out.println(ans.toString());
    }
}