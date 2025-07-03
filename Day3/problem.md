# Problem 03 - Magical Days Count

You are given an array representing scores recorded over `n` consecutive days. A day is considered **magical** if the score on that day is strictly greater than the scores on both the previous and the next days.

Your task is to count the number of magical days.

### Input Format:
- An integer `n` (number of days/scores)
- `n` space-separated integers representing the scores for each day

### Output Format:
- An integer representing the count of magical days

### Constraints:
- n ≥ 3
- Scores can be positive or negative integers

### Sample Input:
7  
1 5 2 6 3 2 4

### Sample Output:
2

### Explanation:
- Day 2 (score 5) is greater than day 1 (1) and day 3 (2) → magical  
- Day 4 (score 6) is greater than day 3 (2) and day 5 (3) → magical  
So, output is 2.
