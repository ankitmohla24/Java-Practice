/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.snap;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author Ankit Mohla
 */
public class LRUCache {
    HashMap<Integer,Integer> ham=new HashMap();
    Deque<Integer> recent=new LinkedList();
    int capacity;
    LRUCache(int capacity){
        this.capacity=capacity;
    }
    
    int get(int key){
        if(ham.containsKey(key)){
            if(Objects.equals(recent.getFirst(), ham.get(key))){
                recent.addLast(recent.removeFirst());
            }
            return ham.get(key);
        }
        else return -1;
    }
    void put(int key, int value){
        ham.put(key, value);
        recent.add(ham.get(key));
        if (ham.size()>capacity){
            ham.remove(recent.removeFirst());
        }
    }
}
