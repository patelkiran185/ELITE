//  The Kingdom of CodeLand has a long bridge made of square tiles, 
// where each tile is painted either red ('R') or blue ('B'). 
// A critical mission has been assigned to you: ensure that a section of the 
// bridge is sturdy enough to support heavy traffic. Blue tiles are reinforced,
// while red tiles are weak and need to be reinforced by painting them blue.

// You are given a 0-indexed string bridge of length n, where bridge[i] represents the color of the i-th tile. Each character in bridge is either 'R' (red) or 'B' (blue).

// Your goal is to ensure that there is at least one segment of k consecutive blue tiles on the bridge to support heavy traffic. You can repaint a red tile ('R') to a blue tile ('B') in one operation.

// Write a program to determine the minimum number of repaint operations needed to create a segment of k consecutive blue tiles.

// Input Format:
// ---------------
// Space separated string and integer, S and K

// Output Format:
// -----------------
// An integer value.


// Sample Input-1:
// ------------------
// RRBRBBRRBR 4

// Sample Output-1:
// --------------------
// 1

// Explanation:
// -------------
// One way to achieve 4 consecutive blue tiles is to repaint the 4th tile to get bridge = "RRBBBBRRBR".
// This requires 1 operations.

// Sample Input-2:
// ------------------
// BRBRRBB 3

// Sample Output-2:
// --------------------
// 1

// Explanation:
// --------------
// One way to achieve 3 consecutive blue tiles is to repaint the 2nd tile to get bridge = "BBBRRBB".
// This requires only 1 operation.

// Sample Input-3:
// ------------------
// BBBRRBRBRR 5

// Sample Output-3:
// --------------------
// 2

// Explanation:
// --------------
// One way to achieve 5 consecutive blue tiles is to repaint the 4th and 9th tiles to get bridge = "BBBBBBBRRR".
// This requires 2 operations.







 import java.util.*;
class tiles{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String bridge=sc.next();
        int k=sc.nextInt();
       long c=Long.MAX_VALUE;
       for(int i=0;i<=bridge.length()-k;i++){
           int blueCount=0;
           for(int j=i;j< i+k && j<bridge.length();j++){
               if(bridge.charAt(j)=='B'){
                   blueCount++;
               }
           }
           if(blueCount >=k){
               break;
           }
           int redCount=0;
           for(int j=i;j<i+k && j<bridge.length();j++){
               if(bridge.charAt(j)=='R'){
                   redCount++;
               }
           }
           c=Math.min(c,(long)redCount);
           
       }
       System.out.println(c==Long.MAX_VALUE ? -1: c);
       sc.close();
    }
}
