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
public class FrogJump {
    public static boolean checkJump(int curr, int prev){
        return (curr==prev || curr==prev-1 || curr==prev+1);
    }
    public static void main(String args[]){
        int stones[]=new int[]{0,1,3,5,6,8,11,14};
        for(int i=1;i<stones.length-1;i++){
            int curr=stones[i+1]-stones[i];
            int prev=stones[i]-stones[i-1];
            if(!checkJump(curr,prev)){
                System.out.println("not happening");
                break;
            }
        if(i==stones.length-2)System.out.println("just happened bruh");
        }
    }
}

