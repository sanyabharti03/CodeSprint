Prob8:X-Pattern Puzzle Generator

Prateek, a curious puzzle designer, has created a mysterious X-pattern puzzle for a coding event. The puzzle involves printing a square matrix of size `n × n`, where:

- Main diagonal elements `(i == j)` are filled with numbers from `1 to n`, increasing row by row.  
- Anti-diagonal elements `(i + j == n - 1)` are filled with numbers from `n to 1`, decreasing row by row.  
- All other elements are replaced with a dash `"-"`.

If a cell lies on both the main and anti-diagonal (i.e., the center of the matrix), the same value will be printed from both rules.

Input Format:  
A single odd integer `n` (3 ≤ n ≤ 1000) — the size of the square matrix.

Output Format:  
Print `n` lines, each containing `n` elements separated by a single space.  
No trailing spaces at the end of any line.

Sample Input:  
5

Sample Output:  
1 - - - 5  
- 2 - 4 -  
- - 3 - -  
- 2 - 4 -  
1 - - - 5
