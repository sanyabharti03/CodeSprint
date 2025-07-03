# Problem 06 - Longest Increasing Temperature Streak

Akshat is monitoring the daily temperature readings for a city over `n` days, stored in an array `temps`. He wants to find the **length of the longest strictly increasing subarray** of temperature readings.

A strictly increasing subarray means:
- Each element is **greater than** the previous one
- The elements are **continuous** (no skipping of days)

Your task is to help Akshat find the **length of the longest strictly increasing continuous period**.

---

### Input Format:
- An integer `n` — representing the number of days
- An array of `n` integers — representing the temperature readings

### Output Format:
- A single integer — the length of the longest strictly increasing subarray

---

### Sample Input:
8  
15 16 17 13 14 15 16 12

### Sample Output:
4

---

### Explanation:
- The longest strictly increasing subarray is: `13 14 15 16`  
- It has length 4
