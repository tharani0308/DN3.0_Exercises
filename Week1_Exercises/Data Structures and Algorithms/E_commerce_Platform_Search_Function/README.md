Exercise 2: E-commerce Platform Search Function
------------------------------------------------------------------------------------------------------------------------------

Scenario: 

You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.

------------------------------------------------------------------------------------------------------------------------------
1. Implementation
  Linear and Binary Search Algorithms
    Linear Search:
      The linear search algorithm scans each element in the array until it finds the target element or reaches the end of the array.

   Binary Search:
      The binary search algorithm works on a sorted array by repeatedly dividing the search interval in half. If the target value is less than the value in the middle of the interval, it searches the lower half; otherwise, it searches the upper half.

------------------------------------------------------------------------------------------------------------------------------
2. Analysis:


1. Time Complexity Comparison
    o Linear Search:

        ---> Best Case: O(1)
        ---> Average Case: O(n)
        ---> Worst Case: O(n)

    o Binary Search:

        ---> Best Case: O(1)
        ---> Average Case: O(log n)
        ---> Worst Case: O(log n)

2.  Algorithm Suitability

    o Linear Search: Suitable for small or unsorted datasets. Simple to implement but less efficient for large datasets as it checks each element sequentially.

    o Binary Search: More efficient for large, sorted datasets due to its logarithmic complexity. Requires the array to be sorted, which adds an initial sorting step but significantly speeds up search operations.

------------------------------------------------------------------------------------------------------------------------------

