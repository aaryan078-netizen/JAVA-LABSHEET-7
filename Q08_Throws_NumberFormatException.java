import java.util.Scanner;
public class Q08_Throws_NumberFormatException {
 static int readNumber(String text) throws NumberFormatException { return Integer.parseInt(text); }
 public static void main(String[] args) { Scanner sc=new Scanner(System.in); try { System.out.print("Enter a whole number: "); String input=sc.nextLine(); System.out.println("Number = "+readNumber(input)); } catch(NumberFormatException e) { System.out.println("Input is not a valid integer."); } finally { sc.close(); } }
}
