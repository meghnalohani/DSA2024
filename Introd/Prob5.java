import java.util.Scanner;
 
class Prob5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n == 1) {
      System.out.println(1);
      return;
    }
    if (n <= 3) {
      System.out.println("NO  SOLUTION");
      return;
    }
    
    for (int i = 2; i <= n; i+=2) {
      System.out.print(i + " ");
    }
    for (int i = 1; i <= n; i+=2) {
      System.out.print(i + " ");
    }
  }
}
