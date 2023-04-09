<h1>Task Largest Color Value in a Directed Graph</h1>

<p>There is a directed graph of n colored nodes and m edges. The nodes are 
numbered from 0 to n - 1.</p>

<p>You are given a string colors where colors[i] is a lowercase English letter 
representing the color of the ith node in this graph (0-indexed). You are also 
given a 2D array edges where edges[j] = [aj, bj] indicates that there is a 
directed edge from node aj to node bj.</p>

<p>A valid path in the graph is a sequence of nodes x1 -> x2 -> x3 -> ... -> xk 
such that there is a directed edge from xi to xi+1 for every 1 <= i < k. The 
color value of the path is the number of nodes that are colored the most 
frequently occurring color along that path.</p>

<p>Return the largest color value of any valid path in the given graph, or -1 
if the graph contains a cycle.</p>

<h3>Example 1:</h3>

<pre><code>
<p>Input: colors = "abaca", edges = [[0,1],[0,2],[2,3],[3,4]]</p>
<h4>Output: 3</h4>
<p>Explanation: The path 0 -> 2 -> 3 -> 4 contains 3 nodes that are colored "a" 
(red in the above image).</p>
</code></pre>

<h3>Example 2:</h3>

<pre><code>
<p>Input: colors = "a", edges = [[0,0]]</p>
<h4>Output: -1</h4>
<p>Explanation: There is a cycle from 0 to 0.</p>
</code></pre>