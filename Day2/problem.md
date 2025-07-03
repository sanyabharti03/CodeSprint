# Problem 02 - Archery Score Classification

Write a program that records the scores of a series of archery shots and classifies each as a good or missed shot.

A shot is considered:
- Good if the score is ≥ 7
- Missed if the score is < 7

### Input Format:
- An integer shots representing the total number of shots taken (1 ≤ shots ≤ 100)
- shots space-separated integers representing the scores (each between 0 and 10)

### Output Format:
- Two integers: number of good shots and number of missed shots (in that order)

### Constraints:
- 1 ≤ shots ≤ 100
- 0 ≤ score of each shot ≤ 10

### Sample Input:
Enter number of shots:
5
8
6
7
10
4

### Sample Output:
3 2

### Explanation:
Good shots: 8, 7, 10 → 3  
Missed shots: 6, 4 → 2

### Edge Case:
If shots ≤ 0 or > 100, or any score < 0 or > 10 → Output: Invalid Input
