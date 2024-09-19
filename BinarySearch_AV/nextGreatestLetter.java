public class nextGreatestLetter {
    public char greatestLetter(char[] letter, char target) {
        int low = 0;
        int high = letter.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (letter[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return letter[low % letter.length];
    }
    public static void main(String[] args) {
        nextGreatestLetter solution = new nextGreatestLetter();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(solution.greatestLetter(letters, target)); 

        target = 'c';
        System.out.println(solution.greatestLetter(letters, target)); 

        target = 'd';
        System.out.println(solution.greatestLetter(letters, target)); 

        target = 'j';
        System.out.println(solution.greatestLetter(letters, target)); 
    }
}
