<h1>Task Removing Stars From a String</h1>

<p>You are given a string s, which contains stars *.</p>

<p>In one operation, you can:</p>

<ul>
    <li>Choose a star in s.</li>
    <li>Remove the closest non-star character to its left, as well as remove 
    the star itself.</li>
</ul>

<p>Return the string after all stars have been removed.</p>

<p>Note:</p>

<ul>
    <li>The input will be generated such that the operation is always possible.</li>
    <li>It can be shown that the resulting string will always be unique.</li>
</ul>

<h3>Example 1:</h3>

<pre><code>
<p>Input: s = "leet**cod*e"</p>
<h4>Output: "lecoe"</h4>
<p>Explanation: Performing the removals from left to right:
- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
  There are no more stars, so we return "lecoe".</p>
</code></pre>

<h3>Example 2:</h3>

<pre><code>
<p>Input: s = "erase*****"</p>
<h4>Output: ""</h4>>
<p>Explanation: The entire string is removed, so we return an empty string.</p>
</code></pre>
