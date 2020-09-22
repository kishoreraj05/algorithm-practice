Given a string s representing a roman numeral. Convert s into an integer.

#Problem Note

s is guaranteed to be within the range from 1 to 3999.
Roman numerals are represented by seven different symbols :
SYMBOL       VALUE
I             1            
V             5            
X             10
L             50
C             100
D             500
M             1000    

- For instance, three is written as III in Roman numeral, just three ones added together. Eleven is written as, XI, which is simply X + I. The number fifty-six is written as LVI, which is just L + V + I.
- Roman numerals are usually written greatest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. We see that the one is before the five, so we subtract one from five to make it four. The same principle applies to the number forty, which is written as XL. There are six instances where subtraction is used:
1. I is placed before V (5) and X (10) to form 4 and 9.
2. X is placed before L (50) and C (100) to form 40 and 90.
3. C is placed before D (500) and M (1000) to form 400 and 900.

#Example 1

Input: "VII" 
Output: 7
Explanation: V+I+I = 5+1+1 = 7

#Example 2

Input: "IV" 
Output: 4 
Explanation: The value of I is 1 which is smaller than the value of V i.e. 5. So, we subtract I from V. V-I = 5-1 = 4

#Example 3

Input: "XC" 
Output: 90
Explanation: The value of X is 10 which is smaller than the value of C i.e. 100. So, we subtract X from C. C-X = 100-10 = 90

#Example 4

Input: "XVII" 
Output: 17
Explanation: X = 10, V= 5, II = 2.
