Title: Unique Vowel Patient Filter

Dr. Kavya works at a busy hospital managing patient records. Every day, she receives a list of patient names who visited for checkups. Some patients come multiple times in the same day due to follow-ups.

Dr. Kavya wants to generate a list of unique patients she saw today, but only those whose names start with a vowel (a, e, i, o, u).

Your task is to help Dr. Kavya:
Read the list of patient names for the day.
Identify all unique patient names that start with a vowel.
Print the count of such unique patients followed by their names in the order they first appeared.

Input:
An integer n (1 ≤ n ≤ 100) — number of patient entries for the day.
Followed by n lines, each containing one patient name (lowercase English letters, no spaces).

Output Format:
First line: the count of unique patients whose names start with a vowel.
Next lines: the unique patient names starting with a vowel, printed in the order they first appeared.

Example Input:
8
arjun
rita
anita
arjun
omkar
priya
anita
uma

Example Output:
4
arjun
anita
omkar
uma
