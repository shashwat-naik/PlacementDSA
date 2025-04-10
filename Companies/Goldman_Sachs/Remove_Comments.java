import java.util.ArrayList;
import java.util.List;

public class Remove_Comments {
    public static List<String> removeComm(String[] str) {
        List<String> result = new ArrayList<>();
        boolean mode = false; // are we inside a block comment?
        StringBuilder store = new StringBuilder();

        for (String s : str) {
            int i = 0;
            while (i < s.length()) {
                if (!mode) {

                    if (i < s.length() - 1 && s.charAt(i) == '/' && s.charAt(i + 1) == '/')
                        break;
                    else if (i < s.length() - 1 && s.charAt(i) == '/' && s.charAt(i + 1) == '*') {
                        mode = true;
                        i += 2;
                    } else {
                        store.append(s.charAt(i));
                        i++;
                    }
                } else {
                    if (i < s.length() - 1 && s.charAt(i) == '*' && s.charAt(i + 1) == '/') {
                        mode = false;
                        i += 2;
                    } else {
                        i++;
                    }
                }
            }

            if (!mode && store.length() > 0) {
                result.add(store.toString());
                store = new StringBuilder();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] source = {
                "int main() {",
                "  // initialize",
                "  int x = 1;",
                "  /* block",
                "     comment */",
                "  return x;",
                "}"
        };

        List<String> output = removeComm(source);
        for (String line : output) {
            System.out.println(line);
        }
    }
}
