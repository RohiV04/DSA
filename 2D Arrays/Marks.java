import java.util.*;

public class Marks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t>0){
        // t--;
        // }
        for (int i = 0; i < 5; i++) {
            int max = 0;
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter marks of student " + (i + 1) + " in subject " + (j + 1));
                int marks = sc.nextInt();
                if (marks > max)
                    max = marks;
            }
            System.out.println("Max marks of student " + (i + 1) + " is " + max);
        }

    }
}
