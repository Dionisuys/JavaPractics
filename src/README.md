<h1>Task Maximum Width of Binary Tree</h1>

<p>Given the root of a binary tree, return the maximum width of the given tree.</p>

<p>The maximum width of a tree is the maximum width among all levels.</p>

<p>The width of one level is defined as the length between the end-nodes 
(the leftmost and rightmost non-null nodes), where the null nodes between the 
end-nodes that would be present in a complete binary tree extending down to that 
level are also counted into the length calculation.</p>

<p>It is guaranteed that the answer will in the range of a 32-bit signed integer.</p>

<h3>Example 1:</h3>

<pre><code>
    <p>Input: root = [1,3,2,5,3,null,9]</p>
    <h4>Output: 4</h4>
    <p>Explanation: The maximum width exists in the third level with length 4 (5,3,null,9).</p>
</code></pre>

<h3>Example 2:</h3>

<pre><code>
    <p>Input: root = [1,3,2,5,null,null,9,6,null,7]</p>
    <h4>Output: 7</h4>
    <p>Explanation: The maximum width exists in the fourth level with length 7 (6,null,null,null,null,null,7).</p>
</code></pre>

<h3>Example 3:</h3>

<pre><code>
    <p>Input: root = [1,3,2,5]</p>
    <h4>Output: 2</h4>
    <p>Explanation: The maximum width exists in the second level with length 2 (3,2).</p>
</code></pre>
