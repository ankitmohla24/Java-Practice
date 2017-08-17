/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Ankit Mohla
 */
public class StringReverse {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
  String B="";
   for(int i=A.length()-1;i>=0;i--)
        {
        B+=A.charAt(i);
    }
    System.out.print(B);
}
}
