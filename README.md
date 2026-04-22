# 🚀 DSA Preparation – Naitik Kumar

📘 Structured Data Structures & Algorithms Practice

This repository contains my daily DSA preparation focused on pattern recognition rather than random problem solving.

Each problem is categorized by algorithmic pattern to strengthen problem-solving intuition for coding interviews.

---

## 📂 Folder Overview

---

### 🟡 Array

Basic array logic + Sliding Window + Prefix Sum + HashMap patterns.

**Problems Covered**
- Two Sum (LC 1)
- Subarray Sum Equals K
- Maximum Subarray (LC 53)
- Best Time to Buy and Sell Stock (LC 121)
- Contains Duplicate (LC 217)
- Longest Substring Without Repeating Characters (LC 3)
- Exactly K Distinct
- At Most K Distinct
- Move Zeros, Rotate Array, Palindrome Check

**Patterns Learned**
- Array Traversal, Two Pointer
- Fixed + Variable Sliding Window
- Prefix Sum, HashMap Frequency Counting

**Key Concepts**
```
Subarray Sum = Prefix Sum + HashMap
At Most K Distinct → Sliding Window Shrinking
Max Subarray → Kadane's Algorithm
```

---

### 🔵 Stack

**Problems Solved**
- Valid Parentheses (LC 20), Min Stack (LC 155)
- Daily Temperatures (LC 739) → Next Greater
- Stock Span (LC 901) → Previous Greater
- Largest Rectangle in Histogram (LC 84)

**🔥 Stack Pattern Summary**
```
Greater problems → Monotonic Decreasing Stack
Smaller problems → Monotonic Increasing Stack
```

---

### 🟢 Dynamic Programming (DP)

**1️⃣ 1D DP – Counting**
- Climbing Stairs (LC 70): `dp[i] = dp[i-1] + dp[i-2]`

**2️⃣ 1D DP – Minimization**
- Min Cost Climbing Stairs (LC 746): `dp[i] = cost[i] + min(dp[i-1], dp[i-2])`

**3️⃣ Choice DP**
- House Robber (LC 198), House Robber II (LC 213)
```
dp[i] = max(nums[i] + dp[i-2], dp[i-1])
Circular → Split into two ranges, take max
```

**4️⃣ DP Transformation**
- Delete and Earn (LC 740): Transform → reuse House Robber

**5️⃣ 2D Grid DP**
- Unique Paths (LC 62, 63), Minimum Path Sum (LC 64)
```
dp[i][j] = top + left   or   grid[i][j] + min(top, left)
Obstacle → dp[i][j] = 0
```

**6️⃣ LIS Pattern**
- LC 300 → O(n²) DP + O(n log n) tails[] + Binary Search
- LC 673 (Number of LIS), LC 354 (Russian Doll Envelopes)

**7️⃣ String DP (LCS Family)**
- LC 1143, LC 72 (Edit Distance)
```
chars match → 1 + dp[i-1][j-1]
else → max(dp[i-1][j], dp[i][j-1])
```

**8️⃣ Palindrome DP**
- LC 516, LC 1312, LC 5, LC 647
```
LPS = LCS(s, reverse(s))
Minimum Insertions = n - LPS
Expand Around Center for substrings
```

**9️⃣ Subset / Knapsack DP**
- LC 416 (0/1 Knapsack), LC 494 (Count Subsets)
- LC 322 (Coin Change Min), LC 518 (Coin Change Count)
```
0/1 → dp[j] = dp[j] OR dp[j - nums[i]]
Unbounded Min → dp[i] = min(dp[i], 1 + dp[i-coin])
Unbounded Count → dp[i] += dp[i-coin]
```

**🔟 DP on Sequences**
- LC 55 (Jump Game), LC 45 (Jump Game II)
- LC 91 (Decode Ways), LC 139 (Word Break)
```
Jump Game → track maxReach, if i > maxReach → false
Decode Ways → single + double digit check
Word Break → dp[i] = any dp[j] && s[j..i] in dict
```

---

### 🔴 Binary Search

**1️⃣ Classic**
- LC 704: `left=0, right=n-1, while(left<=right)`

**2️⃣ Rotated Array**
- LC 153 (Find Min): `compare mid with right, while(left<right)`
- LC 33 (Search): Identify sorted half → 4 cases

**3️⃣ Variants**
- LC 34: Two pass findLeft + findRight
- LC 162 (Peak): `nums[mid] < nums[mid+1]` → go right
- LC 74 (2D Matrix): Binary search on rows then cols

**4️⃣ Binary Search on Answer**
- LC 875 (Koko), LC 1011 (Ship), LC 410 (Split Array)
```
Range = [min_answer, max_answer]
canFinish() check function
If valid → ans=mid, high=mid-1  else  low=mid+1
⚠️ Use long to avoid integer overflow!
```

---

## 🧠 DP Core Thinking Framework

```
Step 1 → Define DP State
Step 2 → Write Recurrence
Step 3 → Define Base Cases
Step 4 → Build bottom-up
```

---

## 🎯 Pattern Recognition Cheatsheet

```
Next Greater              → Monotonic Decreasing Stack
Nearest Smaller           → Monotonic Increasing Stack
Count ways                → 1D DP Counting
Min/Max cost              → Optimization DP
Subarray sum = K          → Prefix Sum + HashMap
At most K distinct        → Variable Sliding Window
Increasing subsequence    → LIS Pattern
Two string comparison     → LCS DP
Palindrome                → Expand Around Center / LPS
Include/Exclude           → Knapsack DP
Can reach end?            → Jump Game / Greedy
Search sorted array       → Binary Search
Search answer in range    → Binary Search on Answer
Rotated sorted array      → Modified Binary Search
2D matrix search          → Two-step Binary Search
```

---

## 📊 What I Have Learned So Far

**Array Patterns** ✅ Sliding Window, Prefix Sum, Two Pointer, HashMap, Kadane's

**Stack Patterns** ✅ Monotonic Stack, Next/Previous Greater, Histogram

**Dynamic Programming** ✅
- 1D DP, Choice DP, Circular DP, DP Transformation
- Grid DP, LIS, String DP (LCS), Palindrome DP
- Knapsack (0/1 + Unbounded), Sequence DP

**Binary Search** ✅
- Classic, Rotated Array, Two Pass, Peak, 2D Matrix
- Binary Search on Answer

---

## 🗓 Current Status
- **Day:** 73 / ongoing
- **Current Phase:** Week 3 — Binary Search ✅ → Graphs next