import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int numberNeeded(String first, String second) {
      int found[] = new int[256];
      int firstLen = first.length();
      int secondLen = first.length();
      int foundLen = firstLen;
      int total = 0;
      int asciVal;

      for(int i = 0; i < firstLen; i++) {
        asciVal = (int) first.charAt(i);
        found[asciVal]++;
      }

      for(int i = 0; i < secondLen; i++) {
        asciVal = (int) second.charAt(i);

        if(found[asciVal] > 0) {
          found[asciVal]--;
          foundLen--;
        } else {
          total++;
        }
      }

      return total + foundLen;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
