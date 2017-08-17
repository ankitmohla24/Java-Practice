/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.snap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Ankit Mohla
 */
public class wordLadder {
    public static int ladderLength(String start, String end, Set<String> dict) {
      // Use queue to help BFS
      Queue<String> queue = new LinkedList();
      queue.add(start);
      queue.add(null);

      // Mark visited word
      Set<String> visited = new HashSet();
      visited.add(start);

      int level = 1;

      while (!queue.isEmpty()) {
        String str = queue.poll();

        if (str != null) {
          // Modify str's each character (so word distance is 1)
          for (int i = 0; i < str.length(); i++) {
            char[] chars = str.toCharArray();

            for (char c = 'a'; c <= 'z'; c++) {
              chars[i] = c;

              String word = new String(chars);

              // Found the end word
              if (word.equals(end)) return level + 1;

              // Put it to the queue
              if (dict.contains(word) && !visited.contains(word)) {
                queue.add(word);
                visited.add(word);
              }
            }
          }
        } else {
          level++;

          if (!queue.isEmpty()) { 
            queue.add(null);
          }
        }
      }

      return 0;
    }
    public static void main(String args[]){
        String start="hit";
        String end="cog";
        Set<String> dict=new HashSet();
        String arr[]=new String[]{"hot","dot","dog","lot","log","cog"};
        dict.addAll(Arrays.asList(arr));
        System.out.println(ladderLength(start,end,dict));
    }
}
