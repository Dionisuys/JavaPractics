<h1>Task Number of Closed Islands</h1>

<p>Given a 2D grid consists of 0s (land) and 1s (water).  An island is a maximal 
4-directionally connected group of 0s and a closed island is an island totally 
(all left, top, right, bottom) surrounded by 1s.</p>

<p>Return the number of closed islands.</p>

<h3>Example 1:</h3>

<pre><code>
<p>Input: grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],
               [1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]</p>
<h4>Output: 2</h4>
<p>Explanation:
Islands in gray are closed because they are completely surrounded by water(group of 1s).</p>
</code></pre>

<h3>Example 2:</h3>

<pre><code>
<p>Input: grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]</p>
<h4>Output: 1</h4>
</code></pre>

<h3>Example 3:</h3>

<pre><code>
<p>Input: grid = [[1,1,1,1,1,1,1],
[1,0,0,0,0,0,1],
[1,0,1,1,1,0,1],
[1,0,1,0,1,0,1],
[1,0,1,1,1,0,1],
[1,0,0,0,0,0,1],
[1,1,1,1,1,1,1]]</p>
<h4>Output: 2</h4>
</code></pre>
