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
import java.util.*;
class blackBox{
    ArrayList<Integer> l=new ArrayList();
      
    
    
    
    void put(int x){
        l.add(x);
        //Collections.sort(l);
    }
    
    int rank(int x){
        if(l.size()==0) return 0;
        if(l.contains(x)){
            int count=0;
            for(int i:l){
                if(i<x)
                    count=count+1;
            }
            return count+1;
        }
        return 0;
        }
            
    public static void main(String args[]){
        blackBox bb=new blackBox();
        bb.put(3);
        bb.put(5);
        System.out.println(bb.rank(5));
        bb.put(4);
        System.out.println(bb.rank(5));
    }

}