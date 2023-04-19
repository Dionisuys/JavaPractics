<h1>Task Longest ZigZag Path in a Binary Tree</h1>

<p>You are given the root of a binary tree.</p>
<p>A ZigZag path for a binary tree is defined as follow:</p>

<ul>
    <li>Choose any node in the binary tree and a direction (right or left).</li>
    <li>If the current direction is right, move to the right child of the current node; 
otherwise, move to the left child.</li>
    <li>Change the direction from right to left or from left to right.</li>
    <li>Repeat the second and third steps until you can't move in the tree.</li>
</ul>

<p>Zigzag length is defined as the number of nodes visited - 1. (A single node 
has a length of 0).</p>

<p>Return the longest ZigZag path contained in that tree.</p>

<h3>Example 1:</h3>

<pre><code>
    <p>Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1]</p>
    <h4>Output: 3</h4>
    <p>Explanation: Longest ZigZag path in blue nodes (right -> left -> right).</p>
</code></pre>

<h3>Example 2:</h3>

<pre><code>
    <p>Input: root = [1,1,1,null,1,null,null,1,1,null,1]</p>
    <h4>Output: 4</h4>
    <p>Explanation: Longest ZigZag path in blue nodes (left -> right -> left -> right).</p>
</code></pre>

<h3>Example 3:</h3>

<pre><code>
    <p>Input: root = [1]</p>
    <h4>Output: 0</h4>
</code></pre>
