Title: Checkerboard Seating Planner

Problem Statement:
Mehek is a student coordinator helping her college plan the seating arrangement for a university exam in a large hall.

The hall is represented as an n × n matrix (0-indexed), where each cell corresponds to a seat.

To maintain fairness and prevent cheating, the college follows this rule:
A seat is considered valid only if no immediate neighbor (top, bottom, left, or right) is occupied.

Students are to be seated in a checkerboard pattern starting from the top-left corner (0, 0).  
That is, a student is seated at cell (i, j) if:  
(i + j) % 2 == 0

Input:
A single integer n (1 ≤ n ≤ 50), representing the number of rows and columns in the hall.

Output Format:
-- Print the n × n matrix, row-wise:  
   Each value should be either 1 (student seated) or 0 (empty seat).  
-- Each row on a new line, with values separated by a single space (no trailing spaces).  
-- On the final line, print:  
   Total students seated: X  
   where X is the total number of students seated.

Sample Input 1:
5

Sample Output 1:
1 0 1 0 1  
0 1 0 1 0  
1 0 1 0 1  
0 1 0 1 0  
1 0 1 0 1  
Total students seated: 13

Sample Input 2:
2

Sample Output 2:
1 0  
0 1  
Total students seated: 2
