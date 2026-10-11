import java.util.Scanner;
public class Q01_Divide_By_Zero_ArithmeticException {
 public static void main(String[] args) { Scanner sc=new Scanner(System.in); try { System.out.print("Enter numerator and denominator: "); int a=sc.nextInt(), b=sc.nextInt(); System.out.println("Result = "+(a/b)); } catch(ArithmeticException e) { System.out.println("Cannot divide by zero."); } finally { System.out.println("Division attempt finished."); sc.close(); } }
}
