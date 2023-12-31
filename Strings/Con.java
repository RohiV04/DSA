import java.util.*;

public class Con {
    public static void main(String args[]) {
        // String str="Hello";
        // System.out.println(str.length());
        Scanner sc = new Scanner(System.in);
        String Str1 = sc.nextLine();

        int cnt=0;
        for(int i=0;i<Str1.length();i++){
           if(Str1.charAt(i)==' ' || Str1.charAt(i)=='\n'){
               cnt++;
           }
        }
        System.out.println(cnt+1);
    }
}
