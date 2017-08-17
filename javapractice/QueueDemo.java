package javapractice;

import java.util.LinkedList;
import java.util.Queue;
 
public class QueueDemo
{
  public static void main(String[] args)
  {
    Queue<Integer> q = new LinkedList<>();
 
    // Adds elements {0, 1, 2, 3, 4} to queue
    for (int i=0; i<5; i++)
     q.add(i);   //add(i) returns true on success   //Offer(i) inserts but does not return
 
    // Display contents of the queue.
    System.out.println("Elements of queue-"+q);
 
    // To remove the head of queue.
    int removedele = q.remove();        //Throws NoSuchElementException when queue is impty.   also poll(), element()
    System.out.println("removed element-" + removedele);
 
    System.out.println(q);
 
    // To view the head of queue
    int head = q.peek();                // element() Throws NoSuchElementException when queue is impty
    System.out.println("head of queue-" + head);
 
    // Rest all methods of collection interface, Like size and contains can be used with this implementation.
    int size = q.size();
    System.out.println("Size of queue-" + size);
  }
}