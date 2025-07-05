prob13-movement segment counter

Problem Statement:
Kavya, a software engineer, developed a smart home security system that logs movement as a binary string for each day:
'1' indicates someone entered or exited the house.
'0' means no movement was detected during that time interval.
She wants to analyze the log to count the number of distinct segments of movement recorded in a day.
A segment of movement is defined as a continuous sequence of '1's that is either:
- Surrounded by '0's on both sides, or
- At the start or end of the string.
Your task is to determine how many such segments are present in the binary log.

Input Format:
A single binary string log of length n (1 ≤ n ≤ 100), consisting only of '0' and '1' characters.

Output Format:
A single integer: the number of movement segments recorded.

Sample Input:
00110011101010

Sample Output:
4

Explanation:
In the binary log 00110011101010, the movement segments are:
11 (starts at index 2-3)  
111 (starts at index 6-8)  
1 (at index 10)  
1 (at index 12)  
Hence, 4 movement segments are detected.
