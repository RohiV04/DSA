import java.util.*;

public class RightPyramid {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size  :");
    int len = sc.nextInt();
    int i, j;
    for (i = 1; i <= len; i++) {
      for (j = 1; j <= len - i; j++) {
        System.out.print("  ");
      }
      for(j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }
}
