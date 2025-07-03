# Problem 04 - Critical Jam Hours

You are given traffic data for `n` hours, where each hour's vehicle count is recorded. An hour is considered a **critical jam hour** if:
- More than 50 vehicles passed during that hour, **and**
- It had more vehicles than the previous hour.

Your task is to count how many such critical jam hours occurred.

### Input Format:
- An integer `n` (number of hours)
- `n` space-separated integers representing vehicle counts for each hour

### Output Format:
- An integer representing the number of critical jam hours

### Constraints:
- n ≥ 2
- 0 ≤ vehicle count ≤ 1000

### Sample Input:
6  
30 55 40 60 52 70

### Sample Output:
3

### Explanation:
- Hour 2: 55 > 50 and greater than Hour 1 (30) → count  
- Hour 4: 60 > 50 and greater than Hour 3 (40) → count  
- Hour 6: 70 > 50 and greater than Hour 5 (52) → count  
So, output is 3.
