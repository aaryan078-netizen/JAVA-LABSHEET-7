import java.util.Scanner;
public class Q02_Array_Index_Out_Of_Bounds {
 public static void main(String[] args) { int[] values={10,20,30,40,50}; Scanner sc=new Scanner(System.in); try { System.out.print("Enter index (0-4): "); int i=sc.nextInt(); System.out.println("Value = "+values[i]); } catch(ArrayIndexOutOfBoundsException e) { System.out.println("Invalid index. Choose 0 through 4."); } finally { sc.close(); } }
}
