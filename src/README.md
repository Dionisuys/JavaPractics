<h1>Task Restore The Array</h1>

<p>A program was supposed to print an array of integers. The program forgot to 
print whitespaces and the array is printed as a string of digits s and all we 
know is that all integers in the array were in the range [1, k] and there are no 
leading zeros in the array.</p>

<p>Given the string s and the integer k, return the number of the possible arrays 
that can be printed as s using the mentioned program. Since the answer may be 
very large, return it modulo 109 + 7.</p>

<h3>Example 1:</h3>

<pre><code>
    <p>Input: s = "1000", k = 10000</p>
    <h4>Output: 1</h4>
    <p>Explanation: The only possible array is [1000]</p>
</code></pre>

<h3>Example 2:</h3>

<pre><code>
    <p>Input: s = "1000", k = 10</p>
    <h4>Output: 0</h4>
    <p>Explanation: There cannot be an array that was printed this way and has 
    all integer >= 1 and <= 10.</p>
</code></pre>

<h3>Example 3:</h3>

<pre><code>
    <p>Input: s = "1317", k = 2000</p>
    <h4>Output: 8</h4>
    <p>Explanation: Possible arrays are [1317],[131,7],[13,17],[1,317],[13,1,7],
    [1,31,7],[1,3,17],[1,3,1,7]</p>
</code></pre>
