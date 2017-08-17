/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.snap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ankit Mohla
 */
public class LogStorageSystem {
    HashMap<Integer,String>hm=new HashMap();
    void put(int n, String s){
        hm.put(n, s);
    }
    List<Object> retrieve(String start,String end,String gran){
        List<Object> l=new LinkedList();
        int i=0;
        switch(gran){
            case "Year":i=4;break;
            case "Month":i=7;break;
            case "Date":i=10;break;
            case "Hour":i=13;break;
            case "Mins":i=16;break;
            case "Secs":i=19;break;    
        }
        for(Object o:hm.keySet()){
            String s=hm.get(o);
            if(start.substring(0, i).compareTo(s.substring(0, i))<=0 
                    && s.substring(0, i).compareTo(end.substring(0, i))<=0){
                l.add(o);
            }
            
        }
        return l;
    }
    
    public static void main(String args[]){
        LogStorageSystem ls=new LogStorageSystem();
        ls.put(1, "2017:01:01:23:59:59");
        ls.put(2, "2017:01:01:22:59:59");
        ls.put(3, "2016:01:01:00:00:00");
        System.out.println(ls.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Year").toString());
        System.out.println(ls.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Hour").toString());
    }
}
