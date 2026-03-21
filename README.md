# 🚀 DSA Preparation – Naitik Kumar

📘 Structured Data Structures & Algorithms Practice  

This repository contains my daily DSA preparation focused on pattern recognition rather than random problem solving.

Each problem is categorized by algorithmic pattern to strengthen problem-solving intuition for coding interviews.

📂 Folder Overview
🟡 Array

Basic array logic + Sliding Window + Prefix Sum + HashMap patterns.

Problems Covered

Two Sum

Subarray Sum Equals K

Maximum Subarray

Longest Substring Without Repeating Characters

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

HashMap Frequency Counting

Key Concepts
Subarray Sum = Prefix Sum + HashMap
At Most K Distinct → Sliding Window Shrinking

Goal:

Master iteration logic
Understand sliding window patterns
Recognize prefix sum problems quickly
🔵 Stack

Focused on Monotonic Stack pattern, heavily used in interview questions.

Problems Solved

Daily Temperatures → Next Greater Element

Stock Span → Previous Greater Element

Next Greater Element

Largest Rectangle in Histogram

🔥 Stack Pattern Summary

Monotonic Decreasing Stack

Used for:

Next Greater Element
Previous Greater Element
Daily Temperatures
Stock Span

Monotonic Increasing Stack

Used for:

Nearest Smaller Element
Largest Rectangle in Histogram
Golden Rule
Greater problems → Decreasing stack
Smaller problems → Increasing stack
🟢 Dynamic Programming (DP)

The repository contains structured learning across multiple DP patterns.

1️⃣ 1D DP – Counting

Problems:

Climbing Stairs (LC 70)

Concept:

dp[i] = dp[i-1] + dp[i-2]

Example:

Fibonacci pattern.

2️⃣ 1D DP – Minimization

Problems:

Min Cost Climbing Stairs (LC 746)

Concept:

dp[i] = cost[i] + min(dp[i-1], dp[i-2])
3️⃣ Choice DP

Problems:

House Robber (LC 198)

House Robber II (LC 213)

Core Idea:

Pick OR Skip

Recurrence:

dp[i] = max(nums[i] + dp[i-2], dp[i-1])
4️⃣ DP Transformation

Problem:

Delete and Earn (LC 740)

Concept:

Transform value adjacency into index adjacency and reuse House Robber DP.

5️⃣ 2D Grid DP

Problems:

Unique Paths (LC 62)

Unique Paths II (LC 63)

Minimum Path Sum (LC 64)

Recurrence:

dp[i][j] = top + left

or

dp[i][j] = grid[i][j] + min(top, left)
6️⃣ Longest Increasing Subsequence Pattern

Problems:

Longest Increasing Subsequence (LC 300)

Number of LIS (LC 673)

Russian Doll Envelopes (LC 354)

Approaches learned:

O(n²) Dynamic Programming
O(n log n) Binary Search Optimization

Key concept:

tails[] array technique
7️⃣ String DP (LCS Family)

Problems:

Longest Common Subsequence (LC 1143)

Print LCS

Edit Distance (LC 72)

Core DP rule:

if chars match → 1 + dp[i-1][j-1]
else → max(dp[i-1][j], dp[i][j-1])
8️⃣ Palindrome DP

Problems:

Longest Palindromic Subsequence (LC 516)

Minimum Insertions to Make Palindrome (LC 1312)

Longest Palindromic Substring (LC 5)

Key insight:

LPS = LCS(s, reverse(s))

Minimum Insertions:

Insertions = n - LPS
🧠 DP Core Thinking Framework

Whenever solving a DP problem:

Step 1 → Define DP State
Step 2 → Write Recurrence
Step 3 → Define Base Cases
Step 4 → Build solution bottom-up
📊 What I Have Learned So Far
Array Patterns

✔ Sliding Window
✔ Prefix Sum
✔ Two Pointer Logic
✔ HashMap Frequency Counting

Stack Patterns

✔ Monotonic Stack
✔ Boundary Calculation
✔ Next Greater / Previous Greater
✔ Histogram area logic

Dynamic Programming

✔ 1D DP
✔ Choice DP
✔ Circular DP
✔ DP Transformation
✔ Grid DP
✔ LIS Pattern
✔ String DP (LCS family)
✔ Palindrome DP

🎯 Pattern Recognition Cheatsheet

If question says:

Next Greater

→ Monotonic Decreasing Stack

Nearest Smaller

→ Monotonic Increasing Stack

Count number of ways

→ 1D DP

Minimum / Maximum cost

→ Optimization DP

Subarray sum equals K

→ Prefix Sum + HashMap

At most K distinct

→ Variable Sliding Window

Increasing subsequence

→ LIS pattern

Two string comparison

→ LCS DP