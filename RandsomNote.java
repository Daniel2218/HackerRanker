import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int m = in.nextInt();
       int n = in.nextInt();
       Boolean yes = true;
       String magazine[] = new String[m];
       HashMap<String,Integer> map = new HashMap<String, Integer>();
       Integer val;

       for(int magazine_i=0; magazine_i < m; magazine_i++){
           magazine[magazine_i] = in.next();
           val = 1;

           if(map.containsKey(magazine[magazine_i])) {
             val = map.get(magazine[magazine_i]) + 1;
           }

           map.put(magazine[magazine_i], val);
       }

       String ransom[] = new String[n];

       for(int ransom_i=0; ransom_i < n; ransom_i++){
           ransom[ransom_i] = in.next();

           Integer value = map.get(ransom[ransom_i]);

           if(value == null || value == 0) {
             System.out.print("No");
             yes = false;
             break;
           } else {
             map.put(ransom[ransom_i], value - 1);
           }
       }

       if(yes) {
           System.out.print("Yes");
       }
    }
}
