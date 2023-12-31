import java.util.*;

public class Rev {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String Str1 = sc.nextLine();
        int len = Str1.length();
        for (int i = 0; i < len / 2; i++) {
            char temp = Str1.charAt(i);
            Str1 = Str1.substring(0, i) + Str1.charAt(len - i - 1) + Str1.substring(i + 1, len - i - 1) + temp + Str1.substring(len - i);
        }
        System.out.println(Str1);
    }
}