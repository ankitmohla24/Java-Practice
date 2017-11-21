/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author Ankit Mohla
 */
public class HashAndUnHash {
    public static long hash(String s)
    {
      long hash = 7;
      String letters = "acdfgilmnoprstuw";
      for(int i = 0; i < s.length(); i++)
      {
            hash = (hash * 23 + letters.indexOf(s.charAt(i)));
      }
      return hash;
    }
    public static String unhash(long h){
        String letters = "acdfgilmnoprstuw";
        StringBuilder s=new StringBuilder();
        while(h>7){
            s = s.append(letters.charAt((int) (h%23))) ;
            h=h/23;
        }
        s=s.reverse();
        return s.toString();
    }
    
    public static void main(String args[]){
        String s="crowdgifts";
        System.out.println(hash(s));
        System.out.println(unhash(hash(s)));
    }
}
