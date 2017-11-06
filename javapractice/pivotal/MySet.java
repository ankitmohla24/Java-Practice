/*
 A common misconception about TDD is that TDD drives the entire design of a software project, 
that a complete software architecture naturally emerges from writing tests and getting them to pass.
That's not how TDD works. You still have to design your software.
So, to begin writing a data structure for a Set using TDD, you would first determine what sort of data 
will be stored, how that data might be represented in memory conceptually, and then figure out what sort 
of behaviors you will need to store, retrieve and manipulate that data.
That should be more than enough information to begin writing tests for methods and code that implement 
your Set data structure.
 */
package javapractice.pivotal;


/**
 * @author Ankit Mohla
 * @param <T>
 */
import java.util.HashMap;


public class MySet<T> {
 private HashMap map;

  public MySet() {
     map = new HashMap();
  }

  public void add(T key) {
      map.put(key, key);
  }

  public void delete(T key) {
      map.remove(key);
  }

  public boolean isEmpty() {
     return map.isEmpty();
  }

  public int size() {
      return map.size();

  }

  public boolean existsKey(T key) {
      return map.containsKey(key);

  }

  public void display() {
      for (Object name: map.keySet()) {
          String key =name.toString();
          System.out.println(key);
  }

}

  public static void main(String[] args) {
      MySet ob = new MySet();
      ob.add(1);
      ob.add(2);
      System.out.println(ob.size());
      System.out.println(ob.existsKey(1));
      ob.display();
      System.out.println(ob.isEmpty());

  }

 }
