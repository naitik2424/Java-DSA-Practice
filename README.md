📘 DSA Practice – Personal Notes & Pattern Guide

This repository contains my structured DSA preparation.
Problems are grouped by pattern to improve recognition and problem-solving skills.

📂 Folder Overview
🟡 array/

Basic + Sliding Window + Prefix Sum + HashMap patterns.

Covers:

Two Sum

Subarray Sum Equals K

Max Subarray Sum

Longest Substring Without Repeating

Exactly K Distinct

At Most K Distinct

Move Zeros

Rotate Array

Palindrome

Sorting basics

Goal:

Master iteration

Sliding window thinking

Prefix sum pattern

HashMap frequency logic

🔵 Stack/

Monotonic Stack mastery folder.

Problems solved:

Daily Temperatures → Next Greater (Right)

Stock Span → Previous Greater

Next Greater Element

Largest Rectangle in Histogram → Nearest Smaller

🔥 Stack Pattern Summary

Monotonic Decreasing Stack
→ Used for Next Greater / Previous Greater

Monotonic Increasing Stack
→ Used for Nearest Smaller / Histogram

Golden Rule:

Greater problems → Decreasing stack

Smaller problems → Increasing stack

🟢 DP/

1D Dynamic Programming start.

Problems solved:

Climbing Stairs → Counting DP

Min Cost Climbing Stairs → Optimization DP

🧠 DP Core Thinking (Important)

Step 1 → Define state
Step 2 → Write recurrence
Step 3 → Base cases
Step 4 → Build answer

Counting problem:

dp[i] = dp[i-1] + dp[i-2]

Optimization problem:

dp[i] = cost[i] + min(...)

Rule:
Alternative choices → ADD
Optimization choices → MIN / MAX

📊 What I Have Learned So Far
From Array Section

Sliding window (Fixed & Variable)

Prefix sum trick

HashMap frequency pattern

Two pointer logic

From Stack Section

Boundary concept

Next Greater vs Previous Greater

Width expansion logic

Left smaller / Right smaller thinking

From DP Section

Recurrence building

State definition

Counting vs Optimization difference

Space optimization

🎯 Pattern Recognition Cheatsheet

If question says:

“Next greater”
→ Monotonic Decreasing Stack

“Nearest smaller”
→ Monotonic Increasing Stack

“Count number of ways”
→ 1D DP (Addition recurrence)

“Minimum / Maximum cost”
→ 1D DP (Min/Max recurrence)

“Subarray sum equals K”
→ Prefix Sum + HashMap

“At most K distinct”
→ Variable Sliding Window

📌 Personal Rules While Solving

Identify pattern before coding

Dry run manually once

Write recurrence clearly (for DP)

Think boundary logic (for stack)

Optimize after correctness

🚀 Current Progress Level

✔ Arrays & Sliding Window – Comfortable
✔ Monotonic Stack – Comfortable
✔ 1D DP – Started & Clear

Next Targets:

House Robber (Choice DP)

2D DP (Grid Problems)

LIS Pattern

Binary Search on Answer

💭 Why This Repo Exists

This repository is not for showing off.
It is for:

Pattern mastery

Interview preparation

Long-term structured growth

Every problem here is understood, not memorized.