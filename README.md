# 🚀 DSA Preparation – Naitik Kumar

📘 Structured Data Structures & Algorithms Practice

This repository contains my structured DSA preparation focused on pattern recognition rather than random problem solving.

Each problem is categorized by algorithmic pattern to strengthen problem-solving intuition for coding interviews.

---

## 📂 Folder Overview

---

### 🟡 Array

Basic array logic + Sliding Window + Prefix Sum + HashMap + LeetCode Top 150 patterns.

**Problems Covered**
- Two Sum (LC 1)
- Merge Sorted Array (LC 88)
- Remove Element (LC 27)
- Remove Duplicates from Sorted Array (LC 26)
- Remove Duplicates from Sorted Array II (LC 80)
- Majority Element (LC 169)
- Rotate Array (LC 189)
- Best Time to Buy and Sell Stock (LC 121)
- Best Time to Buy and Sell Stock II (LC 122)
- Subarray Sum Equals K (LC 560)
- Maximum Subarray (LC 53)
- Contains Duplicate (LC 217)
- Longest Substring Without Repeating Characters (LC 3)
- Exactly K Distinct / At Most K Distinct
- Move Zeros, Palindrome Check

**Patterns Learned**
- Array Traversal, Two Pointer
- Fixed + Variable Sliding Window
- Prefix Sum, HashMap Frequency Counting
- Boyer-Moore Voting Algorithm

**Key Concepts**
```
Subarray Sum = Prefix Sum + HashMap
At Most K Distinct → Sliding Window Shrinking
Max Subarray → Kadane's Algorithm
Rotate Array → Reverse parts of array in-place
```

---

### 🔵 Stack

LIFO operations and Monotonic Stack patterns for range-query and boundary problems.

**Problems Solved**
- Valid Parentheses (LC 20)
- Min Stack (LC 155)
- Daily Temperatures (LC 739) → Next Greater Element
- Stock Span (LC 901) → Previous Greater Element
- Largest Rectangle in Histogram (LC 84) → Boundary check

**🔥 Stack Pattern Summary**
```
Greater problems → Monotonic Decreasing Stack
Smaller problems → Monotonic Increasing Stack
```

---

### 🟣 Linked List

Node manipulation, reference adjustments, and cycle detection.

**Problems Solved**
- Reverse Linked List (LC 206) → Pointer updates
- Merge Two Sorted Lists (LC 21) → Dummy node approach
- Reorder List (LC 143) → Middle search + Reverse + Interleave
- Linked List Cycle (LC 141) → Floyd's Fast/Slow pointers
- Remove Nth Node From End (LC 19) → Pointer gap maintenance

---

### 🟢 Dynamic Programming (DP)

Memoization and bottom-up tabulation to optimize recursive structures.

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

Divide-and-conquer on sorted spaces and searching over answer ranges.

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

### 🟠 Heap / Priority Queue

Min-heaps and Max-heaps for top-K, scheduling, and stream processing.

**Problems Solved**
- LC 215: Kth Largest Element in an Array (Min-Heap approach)
- LC 347: Top K Frequent Elements
- LC 295: Find Median from Data Stream (Double Heap system)
- LC 973: K Closest Points to Origin
- LC 1046: Last Stone Weight (Max-Heap simulation)
- LC 378: Kth Smallest Element in a Sorted Matrix (Pointer Heap)

---

### 🟤 Greedy

Making locally optimal choices to achieve globally optimal solutions.

**Problems Solved**
- LC 55: Jump Game
- LC 45: Jump Game II
- LC 435: Non-overlapping Intervals
- LC 455: Assign Cookies

---

### 🧬 Trie

Prefix trees optimized for string search operations.

**Problems Solved**
- LC 208: Implement Trie (Insert, Search, StartsWith)

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

**Array Patterns** ✅ Sliding Window, Prefix Sum, Two Pointer, HashMap, Kadane's, Boyer-Moore

**Stack Patterns** ✅ Monotonic Stack, Next/Previous Greater, Histogram

**Linked List** ✅ Double pointer, cycle detection, reordering, reversal

**Dynamic Programming** ✅
- 1D DP, Choice DP, Circular DP, DP Transformation
- Grid DP, LIS, String DP (LCS), Palindrome DP
- Knapsack (0/1 + Unbounded), Sequence DP

**Binary Search** ✅
- Classic, Rotated Array, Two Pass, Peak, 2D Matrix
- Binary Search on Answer

**Heap & Greedy** ✅ Min/Max heap operations, interval scheduling, greedy jumps

---

## 🗓 Current Status
- **Current Phase:** Graphs, Trees, and advanced structures next.