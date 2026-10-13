# Diagonal Difference

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a square matrix, calculate the absolute difference between the sums of its diagonals.  
  
For example, the square matrix $arr$ is shown below:  

	1 2 3
    4 5 6
    9 8 9  
    
- The left-to-right diagonal = $1 + 5 + 9 = 15$.    
- The right-to-left diagonal = $3 + 5 + 9 = 17$.    

Their absolute difference is $|15 - 17| = 2$.  

**Function description**

Complete the $\textit{diagonalDifference}$ function with the following parameter:  
  
-	$int\ arr[n][m]$: a 2-D array of integers 
    
**Return**  

-	$int$: the absolute difference in sums along the diagonals	

**Input Format**

The first line contains a single integer, $n$,  the number of rows and columns in the square matrix $arr$.  
Each of the next $n$ lines describes a row, $arr[i]$, and consists of $n$ space-separated integers $arr[i][j]$.

**Constraints**

+ $-100 \le arr[i][j] \le 100$

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T16:04:46.668Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    int n = arr.size();
    int left = 0;
    int right = 0;

    for (int i = 0; i < n; i++) {
        left += arr.get(i).get(i);
        right += arr.get(i).get(n - 1 - i);
    }

    return Math.abs(left - right);
}

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/diagonal-difference/problem)