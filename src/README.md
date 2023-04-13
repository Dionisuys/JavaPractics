<h1>Task Minimize Maximum of Array</h1>

<p>You are given a 0-indexed array nums comprising of n non-negative integers.</p>

<p>In one operation, you must:</p>
<ul>
    <li>Choose an integer i such that 1 <= i < n and nums[i] > 0.</li>
    <li>Decrease nums[i] by 1.</li>
    <li>Increase nums[i - 1] by 1.</li>
</ul>

<p>Return the minimum possible value of the maximum integer of nums after 
performing any number of operations.</p>
    
<h3>Example 1:</h3>

<pre><code>
<p>Input: nums = [3,7,1,6]</p>
<h4>Output: 5</h4>
<p>Explanation:
One set of optimal operations is as follows:
1. Choose i = 1, and nums becomes [4,6,1,6].
2. Choose i = 3, and nums becomes [4,6,2,5].
3. Choose i = 1, and nums becomes [5,5,2,5].
   The maximum integer of nums is 5. It can be shown that the maximum number 
   cannot be less than 5.
   Therefore, we return 5.</p>
</code></pre>

<h3>Example 2:</h3>

<pre><code>
<p>Input: nums = [10,1]</p>
<h4>Output: 10</h4>
<p>Explanation:
It is optimal to leave nums as is, and since 10 is the maximum value, we 
return 10.</p>
</code></pre>
