/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Ankit Mohla
 */
public class Directory_Hashmap {
    public static void main(String[] args) {  
    
      Map map=new HashMap();
    Scanner sc=new Scanner(System.in);
    
       int i=sc.nextInt();
    for(int a=0;a<i;a++){
        String name=sc.nextLine();
        String phone=sc.nextLine();
        map.put(name,phone);
    }
   String query=sc.nextLine();
    if(map.containsKey(query)){System.out.println(query+"="+map.get(query));}
    else System.out.println("Not Found");
    }
}
