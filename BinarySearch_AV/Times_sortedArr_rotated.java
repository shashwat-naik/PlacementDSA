

class Times_sortedArr_rotated {
    public static int count(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        int next = (mid + 1) % arr.length;
        int prev = (mid + arr.length - 1) % arr.length;

        while (start <= end) {

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev])
                return mid;

            if (arr[start] <= arr[mid])
                start = mid + 1;
            else if (arr[mid] <= arr[end])
                end = mid - 1;
        }
        return count(arr, mid + 1, end);
    }

    public static void main(String[] args) {
        int arr[] = { 15, 18, 2, 3, 6, 12 };
        int N = arr.length;

        System.out.println(count(arr, 0, N - 1));
    }
}