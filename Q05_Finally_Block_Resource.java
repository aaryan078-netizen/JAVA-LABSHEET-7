public class Q05_Finally_Block_Resource {
 public static void main(String[] args) { try { System.out.println("File/resource opened."); int result=10/0; System.out.println(result); } catch(ArithmeticException e) { System.out.println("An operation failed."); } finally { System.out.println("Resource closed."); } }
}
