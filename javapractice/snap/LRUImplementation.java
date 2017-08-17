/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.snap;

/**
 *
 * @author Ankit Mohla
 */
public class LRUImplementation {
    public static void main(String srgs[]){
        LRUCache cache = new LRUCache( 3 /* capacity */ );

cache.put(1, 1);
cache.put(2, 2);
System.out.println(cache.get(1));       // returns 1
cache.put(3, 3);    // evicts key 2
System.out.println(cache.get(1));       // returns -1 (not found)
cache.put(4, 4);    // evicts key 1
System.out.println(cache.get(1));       // returns -1 (not found)
System.out.println(cache.get(2));       // returns 3
System.out.println(cache.get(4));
    }
}
