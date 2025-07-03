# Problem 05 - Overstocked Warehouses

Anubha is managing inventory across multiple warehouses in the city. Each warehouse stores various types of items, and the stock data is maintained in a 2D array.

- Each **row** represents a warehouse.
- Each **column** represents a product type.
- Each cell `stock[i][j]` represents the number of units of product type `j` stored in warehouse `i`.

A warehouse is considered **"overstocked"** if **3 or more product types** in that warehouse have stock **greater than or equal to 100 units**.

Your task is to help Anubha **count how many warehouses are overstocked** based on this rule.

---

### Input Format:
- Two integers `r` and `c` — the number of warehouses and number of product types.
- Followed by `r × c` integers representing the stock levels in the warehouses (row-wise).

### Output Format:
- A single integer: the number of overstocked warehouses.

---

### Sample Input:
3 5  
120 80 150 130 90  
95 60 40 50 70  
100 105 110 95 115

### Sample Output:
2

---

### Explanation:
- Warehouse 1: 120, 150, 130 → 3 items ≥ 100 → overstocked  
- Warehouse 2: All values < 100 → not overstocked  
- Warehouse 3: 100, 105, 110, 115 → 4 items ≥ 100 → overstocked  
Total: 2 warehouses
