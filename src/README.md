<h1>Task Find the Difference of Two Arrays</h1>

<p>Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:</p>

<ul>
    <li>answer[0] is a list of all distinct integers in nums1 which are not present in nums2.</li>
    <li>answer[1] is a list of all distinct integers in nums2 which are not present in nums1.</li>
</ul>
    
<p>Note that the integers in the lists may be returned in any order.</p>    

<h3>Example 1:</h3>

<pre><code>
    <p>Input: nums1 = [1,2,3], nums2 = [2,4,6]</p>
    <h4>Output: [[1,3],[4,6]]</h4>
    <p>Explanation:
        For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and 
        nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
        For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and 
        nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].</p>
</code></pre>

<h3>Example 2:</h3>

<pre><code>
    <p>Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]</p>
    <h4>Output: [[3],[]]</h4>
    <p>Explanation:
        For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == 
        nums1[3], their value is only included once and answer[0] = [3].
        Every integer in nums2 is present in nums1. Therefore, answer[1] = [].</p>
</code></pre>
