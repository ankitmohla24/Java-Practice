/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Ankit Mohla
 */
public class paranthesisStack {
    public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      Stack<Character> stack = new Stack<Character>();
      while (sc.hasNext()) {
         String input=sc.next();
         char c;
            for(int i=0;i<input.length();i++)
            {
                c=input.charAt(i);
             switch (c) {
                 case '(':
                     stack.push(c);
                     break;
                 case '{':
                     stack.push(c);
                     break;
                 case '[':
                     stack.push(c);
                     break;    
                 case ')':
                     if(stack.empty())
                         System.out.println(false) ;
                     else if(stack.peek() == '(')
                         stack.pop();
                     else
                         System.out.println(false) ;
                     break;
                 case '}':
                     if(stack.empty())
                         System.out.println(false) ;
                     else if(stack.peek() == '{')
                         stack.pop();
                     else
                         System.out.println(false) ;
                     break;
                 case ']':
                     if(stack.empty())
                         System.out.println(false) ;
                     else if(stack.peek() == '[')
                         stack.pop();
                     else
                         System.out.println(false) ;
                     break;    
                 default:
                     break;
             }
        }
          System.out.println(stack.empty());
          stack.clear();
     }
    
      
   }}