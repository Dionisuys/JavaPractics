<h1>Task Last Stone Weight</h1>

<p>You are given an array of integers stones where stones[i] is the weight of 
the ith stone.</p>

<p>We are playing a game with the stones. On each turn, we choose the heaviest 
two stones and smash them together. Suppose the heaviest two stones have weights 
x and y with x <= y. The result of this smash is:</p>

<ul>
    <li>If x == y, both stones are destroyed, and</li>
    <li>If x != y, the stone of weight x is destroyed, and the stone of weight y 
    has new weight y - x.</li>
</ul>

<p>At the end of the game, there is at most one stone left.</p>

<p>Return the weight of the last remaining stone. If there are no stones left, return 0.</p>

<h3>Example 1:</h3>

<pre><code>
    <p>Input: stones = [2,7,4,1,8,1]</p>
    <h4>Output: 1</h4>
    <p>Explanation:
    We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
    we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
    we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
    we combine 1 and 1 to get 0 so the array converts to [1] then that's the 
    value of the last stone.</p>
</code></pre>

<h3>Example 2:</h3>

<pre><code>
    <p>Input: stones = [1]</p>
    <h4>Output: 1</h4>
</code></pre>
🙄