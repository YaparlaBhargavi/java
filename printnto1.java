
import java.util.Scanner;

public class printnto1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number:");
    int n = sc.nextInt();
    int i = 1;
    while (i >= n) {
      System.out.println(i);
      i--;
    }

    sc.close();
  }
}
