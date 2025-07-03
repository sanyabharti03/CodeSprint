# Problem 01 - Ice Cream Budget Check

You are given a list of ice cream prices and a budget. Write a program that checks whether it is possible to buy any one ice cream with exactly the given budget.

### Input Format:
- An integer `budget` (≥ 0) representing the amount available to spend.
- An integer `n` indicating how many ice cream prices will be entered.
- `n` space-separated integers representing the price of each ice cream.

### Output Format:
- Print true if there exists any ice cream with price equal to the budget.
- Otherwise, print false.

### Constraints:
- budget ≥ 0
- Each ice cream price ≥ 0

### Sample Input:
Enter budget:
10
How many ice cream prices do you want?
3
Enter ice cream Prices
10
20
30

### Sample Output:
true

### Explanation:
Since one of the ice cream prices (10) matches the budget, the program returns true.

### Edge Case:
If budget < 0 or any price < 0 → Output: Invalid Input
