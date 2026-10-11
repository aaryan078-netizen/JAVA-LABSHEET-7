public class Q09_Finally_Versus_Return {
 static int getValue() { try { System.out.println("Inside try: preparing return."); return 42; } finally { System.out.println("Inside finally: runs before the method returns to caller."); } }
 public static void main(String[] args) { System.out.println("Returned value = "+getValue()); }
}
