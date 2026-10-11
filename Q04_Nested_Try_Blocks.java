public class Q04_Nested_Try_Blocks {
 public static void main(String[] args) { int[] a={5,10,15}; try { try { System.out.println("Array value = "+a[5]); } catch(ArrayIndexOutOfBoundsException e) { System.out.println("Inner catch: invalid array index."); } int x=20,y=0; System.out.println(x/y); } catch(ArithmeticException e) { System.out.println("Outer catch: division by zero."); } }
}
