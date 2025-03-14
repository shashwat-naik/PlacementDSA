import java.util.Scanner;

public class NQT_myQues {

    // Q1 Total exercise time
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] exer = new String[7];

        for (int i = 0; i < 7; i++) {
            exer[i] = sc.nextLine();
        }
        int totalTime = 0;
        for (String day : exer) {
            String num = day.replaceAll("[^0-9]", ""); // Extract digits only
            totalTime += Integer.parseInt(num);
        }

        double averageTime = totalTime / 7.0;
        System.out.printf("Total exercise duration: %d minutes\n", totalTime);
        System.out.printf("Average daily exercise duration: %.2f minutes\n", averageTime);
        sc.close();
    }
}
