Exercise 6: Library Management System
------------------------------------------------------------------------------------------------------------------------------

Scenario:

You are developing a library management system where users can search for books by title or author.

------------------------------------------------------------------------------------------------------------------------------
1. Implementation
  Linear Search and Hash Map
    Linear Search:
      The linear search algorithm scans each book in the collection until it finds a match for the title or author or reaches the end of the collection.

  Hash Map:
    A hash map (or dictionary) stores book titles and authors as keys with their corresponding book details as values. This allows for constant-time complexity O(1) lookups.

------------------------------------------------------------------------------------------------------------------------------
2. Analysis:

  --> Time Complexity Comparison
    o Linear Search:

       ---> Best Case: O(1)
       ---> Average Case: O(n)
       ---> Worst Case: O(n)
       
    o Hash Map:

       ---> Best Case: O(1)
       ---> Average Case: O(1)
       ---> Worst Case: O(n) (in case of hash collisions)
 
  --> Algorithm Suitability

      o Linear Search: Suitable for small libraries or when search operations are infrequent. Simple to implement but less efficient for large collections as it checks each book sequentially.

      o Hash Map: More efficient for large libraries due to its average constant-time complexity. Suitable for frequent search operations as it provides faster lookups. However, it requires more memory and handling of hash collisions.

------------------------------------------------------------------------------------------------------------------------------
