/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.hashmap;
import java.util.*;
/**
 *
 * @author Ankit Mohla
 */
public class freqofcharinstring_HashMap {
    public static void main(String[] args) {  
    Map map=new HashMap();
    Scanner sc=new Scanner(System.in);
    String A=sc.nextLine();
    for(int i=0;i<A.length();i++){
        Integer count;
        count = (Integer) map.get(A.charAt(i));
        if(count!=null){
           map.put(A.charAt(i), count+1);
         } else {
          map.put(A.charAt(i),1);  
        }
    }
    Set set=map.entrySet();//Converting to Set so that we can traverse  
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }
    }
}
