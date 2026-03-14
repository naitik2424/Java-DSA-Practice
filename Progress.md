# 📈 DSA Progress Log – Naitik Kumar

This file tracks my daily structured DSA practice.
Goal: Pattern mastery, not random problem solving.

---

## 🗓 Day 1 – Array Basics
**Topics:**
- Max / Second Max
- Basic Iteration

**Pattern:**
- Simple Array Traversal

**Key Learning:**
- Track variables while iterating
- Avoid unnecessary sorting for max problems

---

## 🗓 Day 2 – Reverse String
**Pattern:**
- Two Pointer Technique

**Key Learning:**
- Swap logic
- Start and end pointer movement

---

## 🗓 Day 3 – Valid Palindrome
**Pattern:**
- Two Pointer

**Key Learning:**
- Ignore non-alphanumeric characters
- Case normalization

---

## 🗓 Day 4 – Dominant Index / Max Logic
**Pattern:**
- Basic Array + Condition

**Key Learning:**
- Track max and second max in single pass

---

## 🗓 Day 5 – Maximum Average Subarray
**Pattern:**
- Fixed Sliding Window

**Key Learning:**
- Maintain running sum
- Slide window efficiently

---

## 🗓 Day 6 – Longest Substring Without Repeating
**Pattern:**
- Variable Sliding Window

**Key Learning:**
- HashMap for frequency
- Expand and shrink window dynamically

---

## 🗓 Day 7 – Fruit Into Baskets
**Pattern:**
- At Most K Distinct (Sliding Window)

**Key Learning:**
- Generalized sliding window pattern

---

## 🗓 Day 8 – Exactly K Distinct
**Pattern:**
- AtMost(K) - AtMost(K-1)

**Key Learning:**
- Break complex condition into simpler subproblems

---

## 🗓 Day 9 – Subarray Sum Equals K
**Pattern:**
- Prefix Sum + HashMap

**Key Learning:**
- Store cumulative sum frequencies
- Avoid nested loops

---

## 🗓 Day 10 – Nice Subarrays
**Pattern:**
- Prefix Sum Variant

---

## 🗓 Day 11 – Binary Subarrays With Sum
**Pattern:**
- Prefix Sum Variant

---

## 🗓 Day 12 – Pattern Consolidation
**Focus:**
- Revision
- Mixed pattern problems

---

## 🗓 Day 13 – Stack Theory
**Focus:**
- Stack fundamentals
- Push / Pop mechanics

---

## 🗓 Day 14 – Daily Temperatures
**LeetCode:** 739  
**Pattern:** Monotonic Decreasing Stack (Next Greater)

**Key Learning:**
- Store indices
- Pop when greater element appears
- Calculate distance

---

## 🗓 Day 15 – Stock Span
**LeetCode:** 901  
**Pattern:** Monotonic Decreasing Stack (Previous Greater)

**Key Learning:**
- Span calculation logic
- Boundary understanding

---

## 🗓 Day 16 – Largest Rectangle in Histogram
**LeetCode:** 84  
**Pattern:** Monotonic Increasing Stack

**Key Learning:**
- Left smaller / Right smaller boundary
- Width = R - L - 1
- Fake height = 0 trick

---

## 🗓 Day 17 – Dynamic Programming Start

### 🔹 Part 1 – Climbing Stairs
**LeetCode:** 70  
**Pattern:** 1D DP (Counting)

**Key Learning:**
- Recurrence: dp[i] = dp[i-1] + dp[i-2]
- Fibonacci pattern
- Space optimization

---

### 🔹 Part 2 – Min Cost Climbing Stairs
**LeetCode:** 746  
**Pattern:** 1D DP (Minimization)

**Key Learning:**
- Recurrence: dp[i] = cost[i] + min(...)
- Difference between counting and optimization DP

---

# 🚀 Next Targets

- LIS Pattern
- Binary Search on Answer
- Graph Basics


# 🗓 Day 18 – House Robber

LeetCode: 198

Pattern:

Choice Dynamic Programming

Key Learning:

At every house we have two choices:

Rob the house

Skip the house

Recurrence:

dp[i] = max(nums[i] + dp[i-2], dp[i-1])

Concepts learned:

Pick vs Skip DP

Optimal substructure

Linear DP traversal

# 🗓 Day 19 – House Robber II

LeetCode: 213

Pattern:

Circular Dynamic Programming

Key Learning:

Houses are arranged in a circle

First and last house cannot be robbed together

Solution strategy:

Break the problem into two cases:

1. Rob houses from index 0 → n-2
2. Rob houses from index 1 → n-1

Take the maximum of both results.

Concepts learned:

Circular DP reduction

Reusing previous DP logic

# 🗓 Day 20 – Delete and Earn

LeetCode: 740

Pattern:

DP Transformation (Value Compression)

Key Learning:

Taking number x removes x-1 and x+1

This behaves like the House Robber pattern

Transformation idea:

value[i] = total points gained from number i

Then apply House Robber DP:

dp[i] = max(dp[i-1], value[i] + dp[i-2])

Concepts learned:

Transforming problems into known DP patterns

Value-based DP

# 🗓 Day 21 – Unique Paths

LeetCode: 62

Pattern:

2D Grid Dynamic Programming (Counting)

Key Learning:

Robot can move only right or down

Recurrence:

dp[i][j] = dp[i-1][j] + dp[i][j-1]

Initialization:

First row = 1
First column = 1

Concepts learned:

Grid traversal DP

Counting paths

# 🗓 Day 22 – Unique Paths II

LeetCode: 63

Pattern:

2D Grid DP with Obstacles

Key Learning:

Some cells contain obstacles

Rule:

if obstacle → dp[i][j] = 0

Otherwise:

dp[i][j] = dp[i-1][j] + dp[i][j-1]

Concepts learned:

Handling constraints inside DP transitions

Grid DP with conditions

# 🗓 Day 23 – Minimum Path Sum

**LeetCode:** 64
**Pattern:** 2D Grid DP (Minimization)

**Key Learning:**

* Similar to Unique Paths but with **minimum cost**
* Recurrence:

```
dp[i][j] = grid[i][j] + min(top, left)
```

* Boundary handling for first row and column

---

# 🗓 Day 24 – DP Pattern Consolidation

**Focus:**

* Review grid DP problems
* Strengthen recurrence thinking
* Understand difference between:

  * Counting DP
  * Minimization DP

---

# 🗓 Day 25 – Longest Increasing Subsequence

**LeetCode:** 300
**Pattern:** DP on Subsequences

**Key Learning:**

* `dp[i] = LIS ending at index i`
* Transition:

```
if nums[i] > nums[j]
dp[i] = max(dp[i], dp[j] + 1)
```

* Time Complexity: **O(n²)**

---

# 🗓 Day 26 – LIS Optimized

**LeetCode:** 300
**Pattern:** Greedy + Binary Search

**Key Learning:**

* Use **tails array**
* Maintain smallest possible tail values
* Replace using binary search
* Complexity improved to:

```
O(n log n)
```

---

# 🗓 Day 27 – Russian Doll Envelopes

**LeetCode:** 354
**Pattern:** Sorting + LIS

**Key Learning:**

* Convert **2D problem → 1D LIS**
* Sort rules:

```
Width ascending
Height descending
```

* Apply LIS on heights

---

# 🗓 Day 28 – Number of Longest Increasing Subsequences

**LeetCode:** 673
**Pattern:** DP + Counting

**Key Learning:**

* Track two arrays:

```
length[i] → LIS length ending at i
count[i]  → number of LIS ending at i
```

* Update counts when equal lengths appear

---

# 🗓 Day 29 – Longest Common Subsequence (LCS)

**LeetCode:** 1143
**Pattern:** 2D DP on Strings

**Key Learning:**

```
dp[i][j] = LCS length
```

Transition:

```
if chars match → 1 + dp[i-1][j-1]
else → max(dp[i-1][j], dp[i][j-1])
```

* Classic **string DP template**

---

# 🗓 Day 30 – Print LCS

**Pattern:** DP + Backtracking

**Key Learning:**

* Build LCS table first
* Then **backtrack from dp[n][m]**
* Move:

  * diagonal if characters match
  * toward larger neighbor otherwise

---

# 🗓 Day 31 – Edit Distance

**LeetCode:** 72
**Pattern:** 2D DP (String Transformation)

**Operations:**

```
Insert
Delete
Replace
```

Transition:

```
dp[i][j] = 1 + min(
    insert,
    delete,
    replace
)
```

---

# 🗓 Day 32 – Longest Palindromic Subsequence

**LeetCode:** 516
**Pattern:** LCS Trick

**Key Learning:**

```
LPS = LCS(s, reverse(s))
```

* Convert palindrome problem into LCS problem

---

# 🗓 Day 33 – Minimum Insertions to Make Palindrome

**LeetCode:** 1312
**Pattern:** LPS Reduction

**Key Insight:**

```
Minimum Insertions = n - LPS
```

* Reuse LPS solution

---

# 🗓 Day 34 – Longest Palindromic Substring

**LeetCode:** 5
**Pattern:** DP on Substrings

**Key Learning:**

```
dp[i][j] = true if s[i..j] palindrome
```

Rule:

```
s[i] == s[j] AND dp[i+1][j-1]
```

Also learned **Expand Around Center technique**.

---

# 🚀 Updated Next Targets

Now the next important patterns are:

```
Palindrome Counting
DP on Subsequences Advanced
Binary Search on Answer
Graph Algorithms
```

Next problems planned:

```
Day 35 – Count Palindromic Substrings
Day 36 – Partition Equal Subset Sum
Day 37 – Target Sum
Day 38 – Coin Change
```

---


