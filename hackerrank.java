import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int numberNeeded(String first, String second) {
        int found[] = new int[256];
        int valuesInFound = 0;
        int ascVal;
        int numOfRemoved = 0;

        for(char c : first) {
            ascVal = (int) c;
            found[ascVal]++;
            valueInFound++;
        }

        for(char c : second) {
            ascVal = (int) c;

            if(found[ascVal] > 0) {
                found[ascVal]--;
                valueInFound--;
            } else {
              numOfRemoved++;
            }
        }

        return valueInFound + numOfRemoved;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
