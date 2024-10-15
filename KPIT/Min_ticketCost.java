import java.util.Scanner;
import java.util.Stack;

public class Min_ticketCost {
    public static String minCost(String ticket, int k) {
        Stack<Character> stack = new Stack<>();

        for (char digit : ticket.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        result.reverse();

        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ticket price: ");
        String ticket = sc.next();
        System.out.println("Number of turns: ");
        int k = sc.nextInt();

        String result = minCost(ticket, k);
        System.out.println(result);
    }
}
