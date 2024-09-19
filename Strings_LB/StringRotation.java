public class StringRotation {
    static boolean Rotation(String str1, String str2) {

        /*
         * the line below checks for tha same length of 2 strings followed by:-
         * here concatination(series of things) is performed of the str1 with str1 and
         * later using indexOf we try to search for the str2 inside of the concatinated string.
         */
        
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }

    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";

        if (Rotation(str1, str2)) {
            System.out.println("Strings are rotation of each other.");
        } else {
            System.out.println("Strings are not rotation of each other.");
        }
    }
}
