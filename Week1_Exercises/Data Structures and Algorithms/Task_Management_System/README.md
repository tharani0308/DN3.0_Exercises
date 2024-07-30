Exercise 5: Task Management System
------------------------------------------------------------------------------------------------------------------------------

Scenario:

You are developing a task management system where tasks need to be added, deleted, and traversed efficiently.

------------------------------------------------------------------------------------------------------------------------------
1. Implementation
  Linked List and Array-Based Implementations
    Linked List:
      A linked list is a linear data structure where each element (node) contains a data part and a reference (or link) to the next node in the sequence. It allows efficient insertion and deletion operations.

   Array-Based List:
     An array-based list stores elements in contiguous memory locations. It allows efficient random access but can be inefficient for insertion and deletion operations, especially in the middle of the list.

------------------------------------------------------------------------------------------------------------------------------
2. Analysis:

  --> Time Complexity Comparison

      o Linked List:

         ---> Addition (at the beginning): O(1)
         ---> Deletion (given node): O(1)
         ---> Traversal: O(n)
         ---> Addition (at the end, with tail pointer): O(1)
         ---> Addition (at the end, without tail pointer): O(n)
         
      o Array-Based List:


         ---> Addition (at the end, if space available): O(1)
         ---> Addition (at the end, if space not available): O(n) (due to resizing)
         ---> Deletion (from any position): O(n)
         ---> Traversal: O(n)
         ---> Random Access: O(1)
 
  --> Algorithm Suitability

      o Linked List: Suitable for applications where frequent insertion and deletion operations are required, especially when these operations are not concentrated at the end of the list. It is also useful when the size of the list is not known in advance or is dynamically changing.
      
      o Array-Based List: Suitable for applications where fast random access is required and where insertions and deletions are infrequent or predominantly occur at the end of the list. It is also useful when the size of the list is relatively stable and known in advance, minimizing the need for resizing operations.
------------------------------------------------------------------------------------------------------------------------------
