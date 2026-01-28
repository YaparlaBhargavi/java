import java.util.*;
public class evenorodd {
  public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  System.out.println("enter the number to check whether even or odd:");
  int n=sc.nextInt();
  if(n%2==0){
    System.out.println(n+ "is a even number");
  }
  else{
    System.out.print(n+ "is not a even number");
  }
sc.close();

  }
}
