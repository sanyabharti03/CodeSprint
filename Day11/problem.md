Problem:Jewel Stone Counter
Rahil has a collection of stones he found during his hiking trip. Among them, some stones are actually precious jewels gifted to him by his grandmother.

Each type of jewel is represented by a unique character in a string called `jewels`.  
His entire stone collection is represented by another string called `stones`.  
Each character in the `stones` string represents one stone that Rahil has.

Your task is to help Rahil count how many of the stones in his collection are actually jewels.

🔹 Letters are case-sensitive. That means 'a' and 'A' are considered different types of stones.

Input:
A string `jewels` — the types of stones that are jewels.  
A string `stones` — the stones Rahil has.

Output:
A single integer — the number of stones that are jewels.

Constraints:
1 ≤ jewels.length, stones.length ≤ 50  
Both strings consist only of English letters (uppercase and lowercase).  
All characters in `jewels` are unique.

Sample Input 1:
aA  
aAAbbbb

Sample Output 1:
3

Sample Input 2:
z  
ZZ

Sample Output 2:
0
