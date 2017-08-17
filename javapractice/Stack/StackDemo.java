
package javapractice.Stack;
import java.util.*;
public class StackDemo {

   static void showpop(Stack st) {
      System.out.print("pop -> ");
      Integer a = (Integer) st.pop();
      System.out.println(a);
      System.out.println("stack: " + st);
   }

   public static void main(String args[]) {
      Stack st = new Stack();
      System.out.println("stack: " + st);
      st.push(42);
      System.out.println("stack: " + st);
      st.push(66);
      System.out.println("stack: " + st);
      st.push(99);
      System.out.println("stack: " + st);
      System.out.println(st.search(4));
      System.out.println((Integer) st.pop());
      System.out.println(st.peek());
      System.out.println((Integer) st.pop());
      System.out.println((Integer) st.pop());
      if(st.empty()) System.out.println("Empty Stack");
      //peek() shows the top element without removing it from the stack
      //search returns -1 if not found else returns its offset.
      try {
         showpop(st);
      }catch (EmptyStackException e) {
         System.out.println("empty stack");
      }
   }
}