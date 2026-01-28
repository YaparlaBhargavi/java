import java.util.Scanner;
public class largest3numbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a : ");
    long a = sc.nextLong();
    System.out.println("Enter b : ");
    long b = sc.nextLong();
    System.out.println("Enter c :");
    long c=sc.nextLong();
    if (a > b && a>c) {
      System.out.print(a + "is a largest number");
    } else if(b>a && b>c ) {
      System.out.println(b + "is a largest number");
    }
    else {
      System.out.println(c + " is a largest number");
      sc.close();
    }
  }
}


