Exercise 4: Employee Management System
------------------------------------------------------------------------------------------------------------------------------

Scenario:

You are developing an employee management system for a company. Efficiently managing employee records is crucial.

------------------------------------------------------------------------------------------------------------------------------
1. Implementation
  Arrays and Hash Tables
    Arrays:
      An array stores employee records in a sequential manner, allowing easy indexing and retrieval based on the position in the list. However, searching, adding, and deleting records can be time-consuming for large datasets.

    Hash Tables:
      A hash table stores employee records using key-value pairs, with the employee ID as the key. This allows for faster retrieval, insertion, and deletion of records, as these operations can be done in constant time on average.

------------------------------------------------------------------------------------------------------------------------------
2. Analysis:

  --> Time Complexity Comparison
      o Arrays:

         ---> Access: O(1)
         ---> Search: O(n)
         ---> Insertion: O(n) (if inserting at a specific position)
         ---> Deletion: O(n) (if deleting a specific element)
         
      o Hash Tables:

         ---> Access: O(1)
         ---> Search: O(1) (on average)
         ---> Insertion: O(1) (on average)
         ---> Deletion: O(1) (on average)
         
  --> Algorithm Suitability

      o Arrays: Suitable for smaller datasets or scenarios where frequent access by index is required. They are less efficient for operations involving searching, inserting, and deleting large datasets.

      o Hash Tables: More efficient for managing large datasets due to constant time complexity for insertion, deletion, and search operations. Ideal for scenarios where quick retrieval and updates are crucial. However, hash tables may use more memory and require handling of collisions.
------------------------------------------------------------------------------------------------------------------------------
