import java.util.Scanner;
public class Q03_Multiple_Catch_Blocks {
 public static void main(String[] args) { Scanner sc=new Scanner(System.in); try { System.out.print("Enter two integers: "); String a=sc.next(), b=sc.next(); System.out.println("Result = "+(Integer.parseInt(a)/Integer.parseInt(b))); } catch(NumberFormatException e) { System.out.println("Please enter valid integers."); } catch(ArithmeticException e) { System.out.println("Denominator cannot be zero."); } finally { sc.close(); } }
}
