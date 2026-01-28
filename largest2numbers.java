import java.util.Scanner;

public class largest2numbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a : ");
    long a = sc.nextLong();
    System.out.println("Enter b : ");
    long b = sc.nextLong();
    if (a > b) {
      System.out.print(a + "is a largest number");
    } else {
      System.out.println(b + "is a largest number");
      sc.close();
    }
  }
}
