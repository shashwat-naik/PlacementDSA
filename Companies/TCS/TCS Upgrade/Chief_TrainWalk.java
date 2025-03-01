import java.util.Scanner;

public class Chief_TrainWalk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int Y = sc.nextInt();

            int[] x = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                x[i] = sc.nextInt();
            }

            int onlyWalk = Math.abs(x[B] - x[A]) * P;
            int aToC = Math.abs(x[C] - x[A]) * P;

            if (aToC <= Y) {
                int walkAndTrainTime = Y + (Math.abs(x[D] - x[C]) * Q) + (Math.abs(x[B] - x[D]) * P);
                System.out.println(Math.min(walkAndTrainTime, onlyWalk));
            } else {
                System.out.println(onlyWalk);
            }
        }
        sc.close();
    }
}
