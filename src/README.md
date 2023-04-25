<h1>Task Smallest Number in Infinite Set</h1>

<p>You have a set which contains all positive integers [1, 2, 3, 4, 5, ...].</p>

<p>Implement the SmallestInfiniteSet class:</p>

<ul>
    <li>SmallestInfiniteSet() Initializes the SmallestInfiniteSet object to contain 
    all positive integers.</li>
    <li>int popSmallest() Removes and returns the smallest integer contained in 
    the infinite set.</li>
    <li>void addBack(int num) Adds a positive integer num back into the infinite 
    set, if it is not already in the infinite set.</li>
</ul>

<h3>Example 1:</h3>

<pre><code>
    <p>Input
    ["SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest", "popSmallest", 
    "addBack", "popSmallest", "popSmallest", "popSmallest"]
    [[], [2], [], [], [], [1], [], [], []]</p>
    <h4>Output
    [null, null, 1, 2, 3, null, 1, 4, 5]</h4>
    <p>Explanation
    SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
    smallestInfiniteSet.addBack(2);    // 2 is already in the set, so no change is made.
    smallestInfiniteSet.popSmallest(); // return 1, since 1 is the smallest number, 
    and remove it from the set.
    smallestInfiniteSet.popSmallest(); // return 2, and remove it from the set.
    smallestInfiniteSet.popSmallest(); // return 3, and remove it from the set.
    smallestInfiniteSet.addBack(1);    // 1 is added back to the set.
    smallestInfiniteSet.popSmallest(); // return 1, since 1 was added back to the set and
    // is the smallest number, and remove it from the set.
    smallestInfiniteSet.popSmallest(); // return 4, and remove it from the set.
    smallestInfiniteSet.popSmallest(); // return 5, and remove it from the set.</p>
</code></pre>
