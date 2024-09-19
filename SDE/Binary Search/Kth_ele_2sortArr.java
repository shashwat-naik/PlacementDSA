import java.util.ArrayList;

public class Kth_ele_2sortArr {
    public static int kthEle(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int m, int n, int k) {
        if (m > n)
            return kthEle(arr2, arr1, n, m, k);

        int leftHalf = k;
        int low = Math.max(0, k - n), high = Math.min(k, m);
        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = leftHalf - mid1;

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if (mid1 < m)
                r1 = arr1.get(mid1);
            if (mid2 < n)
                r2 = arr2.get(mid2);
            if (mid1 - 1 >= 0)
                l1 = arr1.get(mid1 - 1);
            if (mid2 - 1 >= 0)
                l2 = arr2.get(mid2 - 1);

            if (l1 <= r2 && l2 <= r1)
                return Math.max(l1, r2);
            else if (l1 > r2)
                high = mid1 - 1;
            else
                low = mid1 + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(6);
        a.add(7);
        a.add(9);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(4);
        b.add(8);
        b.add(10);

        System.out.println("The k-th element of two sorted arrays is: " + kthEle(a, b, a.size(), b.size(), 5));
    }
}
