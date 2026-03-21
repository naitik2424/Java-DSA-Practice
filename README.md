🚀 DSA Preparation – Naitik Kumar

📘 Structured Data Structures & Algorithms Practice

This repository contains my daily DSA practice focused on pattern recognition instead of random problem solving.

🎯 Goal

Understand patterns → Recognize patterns → Apply patterns

📊 DSA Progress Dashboard
Metric	Value
Total Problems Solved	41+
Topics Covered	Arrays, Stack, DP, LIS, LCS, Palindrome DP, Binary Search
Current Streak	41 Days
Primary Language	Java
📂 Folder Overview
🟡 Array

Basic array + Sliding Window + Prefix Sum + HashMap

Problems Covered
Two Sum
Subarray Sum Equals K
Maximum Subarray
Longest Substring Without Repeating
Exactly K Distinct
At Most K Distinct
Move Zeros
Rotate Array
Palindrome Check
Sorting Basics
Patterns Learned
Array Traversal
Two Pointer Technique
Fixed Sliding Window
Variable Sliding Window
Prefix Sum
HashMap Frequency
Key Concepts
Subarray Sum = Prefix Sum + HashMap
At Most K Distinct → Sliding Window
🔵 Stack

Focused on Monotonic Stack Pattern

Problems
Daily Temperatures
Stock Span
Next Greater Element
Largest Rectangle in Histogram
Pattern Summary
Monotonic Decreasing Stack → Next Greater / Previous Greater
Monotonic Increasing Stack → Nearest Smaller / Histogram

Rule:
Greater → Decreasing Stack
Smaller → Increasing Stack

🟢 Dynamic Programming (DP)
1️⃣ 1D DP – Counting
Climbing Stairs (LC 70)
dp[i] = dp[i-1] + dp[i-2]
2️⃣ 1D DP – Minimization
Min Cost Climbing Stairs (LC 746)
dp[i] = cost[i] + min(...)
3️⃣ Choice DP
House Robber (LC 198)
House Robber II (LC 213)

Concept:
Pick OR Skip

Formula:
dp[i] = max(nums[i] + dp[i-2], dp[i-1])

4️⃣ DP Transformation
Delete and Earn (LC 740)
→ Reduced to House Robber
5️⃣ 2D Grid DP
Unique Paths (LC 62)
Unique Paths II (LC 63)
Minimum Path Sum (LC 64)

dp[i][j] = top + left

6️⃣ LIS Pattern
Longest Increasing Subsequence (LC 300)
Number of LIS (LC 673)
Russian Doll Envelopes (LC 354)

Approaches:

O(n²) DP
O(n log n) (Binary Search using tails[])
7️⃣ String DP (LCS Family)
Longest Common Subsequence
Print LCS
Edit Distance

Rule:

Match → 1 + dp[i-1][j-1]
No match → max(...)
8️⃣ Palindrome DP
Longest Palindromic Subsequence
Minimum Insertions to Palindrome
Longest Palindromic Substring

Concept:

LPS = LCS(s, reverse(s))
Insertions = n - LPS
9️⃣ Knapsack / Subset DP
Partition Equal Subset Sum
Target Sum

Pattern:
Include / Exclude

🔟 Unbounded Knapsack
Coin Change (LC 322)
Coin Change II (LC 518)
Min → dp[i] = min(...)
Ways → dp[i] += ...
🔍 Binary Search on Answer
Koko Eating Bananas (LC 875)
Ship Packages Within D Days (LC 1011)
Split Array Largest Sum (LC 410)
Pattern
Search space = [min possible, max possible]
If mid works → try smaller
Else → increase
🧠 DP Thinking Framework
Define state
Write recurrence
Base case
Build solution
🎯 Pattern Recognition Cheatsheet
Problem Clue	Pattern
Next Greater	Monotonic Stack
Nearest Smaller	Monotonic Stack
Count ways	DP
Min / Max	DP Optimization
Subarray sum = K	Prefix Sum
At most K	Sliding Window
Increasing sequence	LIS
Two strings	LCS
Min/Max answer	Binary Search
📈 What I Have Learned
Arrays

✔ Sliding Window
✔ Prefix Sum
✔ Two Pointer

Stack

✔ Monotonic Stack
✔ Boundary Logic

Dynamic Programming

✔ 1D DP
✔ Choice DP
✔ Grid DP
✔ LIS
✔ LCS
✔ Palindrome DP
✔ Knapsack

Binary Search

✔ Binary Search on Answer

🎯 Current Focus

Advanced DP + Graphs (Next Phase)

💡 Why This Repository Exists

This repo is not for showing off.

It is for:

Pattern mastery
Interview preparation
Consistent structured learning

Every problem is:

👉 Understood, not memorized

## 🧠 LeetCode Stats
![LeetCode Stats](https://leetcard.jacoblin.cool/Naitikkumar7089?theme=dark&font=Baloo%202&ext=contest)
## 🏆 Achievements
![DSA](https://img.shields.io/badge/DSA-41%2B%20Problems-blue)
![Java](https://img.shields.io/badge/Language-Java-orange)
![Focus](https://img.shields.io/badge/Focus-Data%20Structures-green)
![Status](https://img.shields.io/badge/Daily%20Practice-Active-success)
