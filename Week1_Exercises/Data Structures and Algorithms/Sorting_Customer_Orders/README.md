Exercise 3: Sorting Customer Orders
------------------------------------------------------------------------------------------------------------------------------

Scenario:

You are tasked with sorting customer orders by their total price on an e-commerce platform. This helps in prioritizing high-value orders.

------------------------------------------------------------------------------------------------------------------------------
1. Implementation
  Comparison-based Sorting Algorithms
    Merge Sort:
      Merge sort is a divide-and-conquer algorithm that splits the array into halves, recursively sorts each half, and then merges the sorted halves to produce the final sorted array.

  Quick Sort:
      Quick sort is also a divide-and-conquer algorithm that selects a pivot element and partitions the array into two sub-arrays, one with elements less than the pivot and one with elements greater than the pivot. It then recursively sorts the sub-arrays.

------------------------------------------------------------------------------------------------------------------------------
2. Analysis:

   --> Time Complexity Comparison

       o Merge Sort:

           ---> Best Case: O(n log n)
           ---> Average Case: O(n log n)
           ---> Worst Case: O(n log n)
   
        o Quick Sort:

           ---> Best Case: O(n log n)
           ---> Average Case: O(n log n)
           ---> Worst Case: O(n^2)
   
    --> Algorithm Suitability

        o Merge Sort: Suitable for large datasets and provides consistent O(n log n) performance regardless of the input. It is stable (preserves the order of equal elements) and works well for linked lists and external sorting (sorting data not in memory).
        
        o Quick Sort: Often faster in practice for large datasets due to low overhead and cache efficiency. However, its worst-case performance is O(n^2), which can be mitigated by using techniques like random pivot selection or the median-of-three rule. It is not stable but is in-place (uses a small, constant amount of extra space).

------------------------------------------------------------------------------------------------------------------------------
