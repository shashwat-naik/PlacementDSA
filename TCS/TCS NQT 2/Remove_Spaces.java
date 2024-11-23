public class Remove_Spaces {
    public static String modify(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);
            if (n != ' ')
                str.append(n);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "geeks  for geeks";
        String output = modify(s);
        System.out.println(output);
    }
}
