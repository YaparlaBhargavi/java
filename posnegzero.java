import java.util.Scanner;

public class posnegzero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number to check even or odd or zero:");
    long n = sc.nextLong();
    if (n == 0) {
      System.out.print(n + " it is a zero");
    } else if (n > 0) {
      System.out.println(n + "is a positive number");
    } else {
      System.out.println(n + "is a negative number");
    }
    sc.close();

  }
}
