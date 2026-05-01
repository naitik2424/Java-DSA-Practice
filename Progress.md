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

## 🗓 Day 18 – House Robber
**LeetCode:** 198
**Pattern:** Choice Dynamic Programming

**Key Learning:**
- At every house we have two choices: Rob or Skip
- Recurrence: dp[i] = max(nums[i] + dp[i-2], dp[i-1])

---

## 🗓 Day 19 – House Robber II
**LeetCode:** 213
**Pattern:** Circular Dynamic Programming

**Key Learning:**
- Houses arranged in a circle
- Break into two cases: index 0→n-2 and index 1→n-1
- Take max of both results

---

## 🗓 Day 20 – Delete and Earn
**LeetCode:** 740
**Pattern:** DP Transformation (Value Compression)

**Key Learning:**
- Taking x removes x-1 and x+1 → House Robber pattern
- value[i] = total points from number i
- dp[i] = max(dp[i-1], value[i] + dp[i-2])

---

## 🗓 Day 21 – Unique Paths
**LeetCode:** 62
**Pattern:** 2D Grid Dynamic Programming (Counting)

**Key Learning:**
- Robot moves only right or down
- dp[i][j] = dp[i-1][j] + dp[i][j-1]
- First row = 1, First column = 1

---

## 🗓 Day 22 – Unique Paths II
**LeetCode:** 63
**Pattern:** 2D Grid DP with Obstacles

**Key Learning:**
- If obstacle → dp[i][j] = 0
- Otherwise: dp[i][j] = dp[i-1][j] + dp[i][j-1]

---

## 🗓 Day 23 – Minimum Path Sum
**LeetCode:** 64
**Pattern:** 2D Grid DP (Minimization)

**Key Learning:**
- dp[i][j] = grid[i][j] + min(top, left)
- Boundary handling for first row and column

---

## 🗓 Day 24 – DP Pattern Consolidation
**Focus:**
- Review grid DP problems
- Difference between Counting DP and Minimization DP

---

## 🗓 Day 25 – Longest Increasing Subsequence
**LeetCode:** 300
**Pattern:** DP on Subsequences

**Key Learning:**
- dp[i] = LIS ending at index i
- if nums[i] > nums[j]: dp[i] = max(dp[i], dp[j] + 1)
- Time Complexity: O(n²)

---

## 🗓 Day 26 – LIS Optimized
**LeetCode:** 300
**Pattern:** Greedy + Binary Search

**Key Learning:**
- Use tails array
- Maintain smallest possible tail values
- Replace using binary search → O(n log n)

---

## 🗓 Day 27 – Russian Doll Envelopes
**LeetCode:** 354
**Pattern:** Sorting + LIS

**Key Learning:**
- Convert 2D problem → 1D LIS
- Sort: Width ascending, Height descending
- Apply LIS on heights

---

## 🗓 Day 28 – Number of Longest Increasing Subsequences
**LeetCode:** 673
**Pattern:** DP + Counting

**Key Learning:**
- length[i] → LIS length ending at i
- count[i] → number of LIS ending at i
- Update counts when equal lengths appear

---

## 🗓 Day 29 – Longest Common Subsequence (LCS)
**LeetCode:** 1143
**Pattern:** 2D DP on Strings

**Key Learning:**
- if chars match → 1 + dp[i-1][j-1]
- else → max(dp[i-1][j], dp[i][j-1])

---

## 🗓 Day 30 – Print LCS
**Pattern:** DP + Backtracking

**Key Learning:**
- Build LCS table first
- Backtrack from dp[n][m]

---

## 🗓 Day 31 – Edit Distance
**LeetCode:** 72
**Pattern:** 2D DP (String Transformation)

**Key Learning:**
- dp[i][j] = 1 + min(insert, delete, replace)

---

## 🗓 Day 32 – Longest Palindromic Subsequence
**LeetCode:** 516
**Pattern:** LCS Trick

**Key Learning:**
- LPS = LCS(s, reverse(s))

---

## 🗓 Day 33 – Minimum Insertions to Make Palindrome
**LeetCode:** 1312
**Pattern:** LPS Reduction

**Key Insight:**
- Minimum Insertions = n - LPS

---

## 🗓 Day 34 – Longest Palindromic Substring
**LeetCode:** 5
**Pattern:** DP on Substrings

**Key Learning:**
- dp[i][j] = true if s[i..j] palindrome
- s[i] == s[j] AND dp[i+1][j-1]
- Also learned Expand Around Center technique

---

## 🗓 Day 35 – Count Palindromic Substrings
**LeetCode:** 647
**Pattern:** Expand Around Center

**Key Learning:**
- Every palindrome expands from a center
- Total centers = 2*n - 1
- Expand left and right while characters match

---

## 🗓 Day 36 – Partition Equal Subset Sum
**LeetCode:** 416
**Pattern:** Subset DP (0/1 Knapsack)

**Key Learning:**
- Target = totalSum / 2
- dp[i][j] = dp[i-1][j] OR dp[i-1][j - nums[i]]

---

## 🗓 Day 37 – Target Sum
**LeetCode:** 494
**Pattern:** Subset DP Transformation

**Key Learning:**
- P = (target + totalSum) / 2
- Count subsets with sum = P

---

## 🗓 Day 38 – Coin Change
**LeetCode:** 322
**Pattern:** Unbounded Knapsack (Minimization)

**Key Learning:**
- dp[i] = min(dp[i], 1 + dp[i - coin])
- Use coins unlimited times

---

## 🗓 Day 39 – Coin Change II
**LeetCode:** 518
**Pattern:** Unbounded Knapsack (Counting)

**Key Learning:**
- dp[i] += dp[i - coin]
- Count number of ways

---

## 🗓 Day 40 – Koko Eating Bananas
**LeetCode:** 875
**Pattern:** Binary Search on Answer

**Key Learning:**
- Search on speed range [1, max(piles)]
- canFinish(piles, k, h) → hours = ceil(pile/k) per pile
- Use long for overflow prevention

---

## 🗓 Day 41 – Ship Packages Within D Days
**LeetCode:** 1011
**Pattern:** Binary Search on Answer

**Key Learning:**
- Search on capacity range [max(weights), sum(weights)]
- Maintain order while splitting (greedy check)

---

## 🗓 Day 42 – Split Array Largest Sum
**LeetCode:** 410
**Pattern:** Binary Search on Answer

**Key Learning:**
- Minimize largest subarray sum
- Same pattern as shipping problem
- Range = [max(nums), sum(nums)]

---

## 🗓 Day 43 – Jump Game
**LeetCode:** 55
**Pattern:** DP / Greedy

**Key Learning:**
- dp[i] = can we reach index i?
- Track maxReach at every step
- If i > maxReach → return false

---

## 🗓 Day 44 – Jump Game II
**LeetCode:** 45
**Pattern:** Greedy DP

**Key Learning:**
- Minimum jumps to reach end
- Track current range and next range
- Increment jumps when current range exhausted

---

## 🗓 Day 45 – Decode Ways
**LeetCode:** 91
**Pattern:** 1D DP on Strings

**Key Learning:**
- dp[i] = number of ways to decode s[0..i]
- Single digit decode + Two digit decode check
- Edge cases: '0' cannot decode alone

---

## 🗓 Day 46 – Word Break
**LeetCode:** 139
**Pattern:** 1D DP + String Matching

**Key Learning:**
- dp[i] = can s[0..i] be segmented?
- For every j < i: if dp[j] && s[j..i] in dict → dp[i] = true
- Use HashSet for O(1) word lookup

---

## 🗓 Day 47 – Binary Search Basics
**LeetCode:** 704
**Pattern:** Classic Binary Search

**Key Learning:**
- left=0, right=n-1, while(left <= right)
- mid = left + (right - left) / 2
- Common mistakes: wrong variable names, missing pointer updates

---

## 🗓 Day 48 – Find Minimum in Rotated Sorted Array
**LeetCode:** 153
**Pattern:** Binary Search on Rotated Array

**Key Learning:**
- Compare nums[mid] with nums[right]
- nums[mid] > nums[right] → minimum in right half → left = mid + 1
- else → right = mid
- Use while(left < right), return nums[left]

---

## 🗓 Day 49 – Search in Rotated Sorted Array
**LeetCode:** 33
**Pattern:** Binary Search on Rotated Array

**Key Learning:**
- Identify which half is sorted: nums[left] <= nums[mid]
- Check if target lies in sorted half → move pointer accordingly
- 4 cases total (left sorted / right sorted) × (target in range / not in range)

---

## 🗓 Day 50 – Find First and Last Position
**LeetCode:** 34
**Pattern:** Binary Search (Two Pass)

**Key Learning:**
- Two separate binary searches: findLeft + findRight
- findLeft: target found → ans = mid, right = mid - 1 (keep searching left)
- findRight: target found → ans = mid, left = mid + 1 (keep searching right)
- Use while(left <= right) with proper pointer updates

---

## 🗓 Day 51 – Find Peak Element
**LeetCode:** 162
**Pattern:** Binary Search on Unsorted Array

**Key Learning:**
- nums[mid] < nums[mid+1] → peak in right half → left = mid + 1
- else → peak in left half or mid itself → right = mid
- Use while(left < right), return left
- No need to check both neighbours!

---

## 🗓 Day 52 – Search a 2D Matrix
**LeetCode:** 74
**Pattern:** Binary Search (2 Step)

**Key Learning:**
- Step 1: Binary search to find correct row
  - matrix[midRow][0] <= target <= matrix[midRow][cols-1]
- Step 2: Binary search within that row
- matrix[targetRow][mid] instead of nums[mid]

---

## 🗓 Day 53 – Revision Day
**Focus:** Array + Sliding Window pattern consolidation

---

## 🗓 Day 54 – Revision Day
**Focus:** Stack + Monotonic Stack revision

---

## 🗓 Day 55 – Revision Day
**Focus:** DP patterns recap (1D + 2D)

---

## 🗓 Day 56 – Arrays Revision
**LeetCode:** 121, 53, 217, 1
**Pattern:** Array Traversal + HashMap

**Key Learning:**
- LC121: Track min price, max profit in one pass
- LC53: Kadane's Algorithm for max subarray
- LC217: HashMap for duplicates
- LC1: Two Sum with HashMap

---

## 🗓 Day 57 – Strings Revision
**LeetCode:** 242, 14
**Pattern:** String Manipulation

**Key Learning:**
- LC242: Anagram check using frequency count
- LC14: Longest common prefix using vertical scan

---

## 🗓 Day 58 – Sliding Window Revision
**LeetCode:** 643, 3
**Pattern:** Fixed + Variable Sliding Window

**Key Learning:**
- LC643: Fixed window average
- LC3: Variable window with HashSet

---

## 🗓 Day 59 – Longest Substring Without Repeating Characters
**LeetCode:** 3
**Pattern:** Variable Sliding Window

**Key Learning:**
- HashMap to track last seen index
- Shrink window when duplicate found

---

## 🗓 Day 60 – Stack Revision
**LeetCode:** 20, 155
**Pattern:** Stack

**Key Learning:**
- LC20: Valid Parentheses — push open, pop and match close
- LC155: Min Stack — track min alongside every element

---

## 🗓 Day 61 – Revision + Daily Temperatures
**LeetCode:** 739
**Pattern:** Monotonic Decreasing Stack

**Key Learning:**
- Store indices, not values
- Pop when current element is greater

---

## 🗓 Day 62 – DP Week 1 Revision
**LeetCode:** 70, 198, 213
**Pattern:** 1D DP + Circular DP

**Key Learning:**
- LC70: Fibonacci DP
- LC198: Pick/Skip House Robber
- LC213: Circular → split into two linear problems

---

## 🗓 Day 63 – Jump Game
**LeetCode:** 55, 62, 91
**Pattern:** Greedy DP + Sequence DP

**Key Learning:**
- LC55: Track maxReach, if i > maxReach → false
- LC62: Grid DP paths count
- LC91: Decode Ways — single + double digit check

---

## 🗓 Day 64 – Word Break + Partition Equal Subset Sum
**LeetCode:** 139, 416
**Pattern:** 1D DP + Knapsack DP

**Key Learning:**
- LC139: dp[i] = any dp[j] && s[j..i] in dict
- LC416: Target = sum/2, include/exclude knapsack

---

## 🗓 Day 65 – Longest Increasing Subsequence
**LeetCode:** 300
**Pattern:** DP on Subsequences

**Key Learning:**
- dp[i] = LIS ending at i
- O(n²) DP approach
- O(n log n) using tails array + binary search

---

## 🗓 Day 66 – Rest Day
**Note:** Busy day, no practice

---

## 🗓 Day 67 – Rest Day
**Note:** Busy day, no practice

---

## 🗓 Day 68 – Binary Search Start
**LeetCode:** 704, 153
**Pattern:** Classic + Rotated Array Binary Search

**Key Learning:**
- LC704: Standard template — left=0, right=n-1, while(left<=right)
- LC153: while(left < right), compare mid with right, return nums[left]

---

## 🗓 Day 69 – Search in Rotated Sorted Array
**LeetCode:** 33
**Pattern:** Binary Search on Rotated Array

**Key Learning:**
- Identify sorted half using nums[left] <= nums[mid]
- Check if target lies in sorted half
- 4 cases: left/right sorted × target in/out of range

---

## 🗓 Day 70 – Find First and Last Position
**LeetCode:** 34
**Pattern:** Binary Search (Two Pass)

**Key Learning:**
- findLeft: on match → ans = mid, right = mid - 1
- findRight: on match → ans = mid, left = mid + 1
- Two separate helper functions

---

## 🗓 Day 71 – Find Peak Element
**LeetCode:** 74
**Pattern:** Binary Search (2 Step)

**Key Learning:**
- Step 1: Find correct row via binary search
- Step 2: Binary search within that row
- Use while(left < right) for row search

---

## 🗓 Day 72 – Search a 2D Matrix
**LeetCode:** 162
**Pattern:** Binary Search on Unsorted Array

**Key Learning:**
- nums[mid] < nums[mid+1] → go right
- else → go left or mid is peak
- while(left < right), return left

---

## 🗓 Day 73 – Koko Eating Bananas
**LeetCode:** 875
**Pattern:** Binary Search on Answer

**Key Learning:**
- Search range: [1, max(piles)]
- canFinish(piles, k, h): hours = ceil(pile/k) per pile
- Use long for total to avoid integer overflow
- If valid: ans = mid, high = mid - 1

---


