<h1>Task Number of Enclaves</h1>

<p>You are given an m x n binary matrix grid, where 0 represents a sea cell and 1
represents a land cell.</p>

<p>A move consists of walking from one land cell to another adjacent (4-directionally)
land cell or walking off the boundary of the grid.</p>

<p>Return the number of land cells in grid for which we cannot walk off the boundary
of the grid in any number of moves.</p>

<h3>Example 1:</h3>

<pre><code>
<table>
  <tr>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  <tr>
    <td>1</td>
    <td>0</td>
    <td style="background-color: #FFC0CB;"><font color="black">1</font></td>
    <td>0</td>
  </tr>
  <tr>
    <td>0</td>
    <td style="background-color: #FFC0CB;"><font color="black">1</font></td>
    <td style="background-color: #FFC0CB;"><font color="black">1</font></td>
    <td>0</td>
  </tr>
  <tr>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
</table>
</code></pre>

<p>Input: grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]</p>
<h4>Output: 3</h4>
<p>Explanation: There are three 1s that are enclosed by 0s, and one 1 that is not
enclosed because its on the boundary.</p>

<h3>Example 2:</h3>

<pre><code>
<table>
  <tr>
    <td>0</td>
    <td>1</td>
    <td>1</td>
    <td>0</td>
  </tr>
  <tr>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>0</td>
  </tr>
  <tr>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>0</td>
  </tr>
  <tr>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
</table>
</code></pre>

<p>Input: grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]</p>
<h4>Output: 0</h4>
<p>Explanation: All 1s are either on the boundary or can reach the boundary.</p>