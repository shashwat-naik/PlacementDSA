public class PrepInsta_Q5 {
    public static int countValley( String path) {
        int seaLevel = 0;
        int valleys = 0;

        for (char ch : path.toCharArray()) {
            if (ch == 'U') {
                seaLevel++;
            } else {
                seaLevel--;
            }

            if (ch == 'U' && seaLevel == 0) {
                valleys++;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        String path = "DUUUUDDD";  
        
        int result = countValley(path);
        System.out.println(result);
    }
}
