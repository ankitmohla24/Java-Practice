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
public class UniqueBSTs {
    public static long numtrees(int n){
        long [] G = new long[n+1];
        G[0] = G[1] = 1;
        for(int i=2; i<=n; ++i) {
            for(int j=1; j<=i; ++j) {
                    G[i] += G[j-1] * G[i-j];
            }
        }
    return G[n];
}
    public static void main(String args[]){
        int n=8;
        System.out.println(numtrees(n));
    }
}
