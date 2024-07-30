Exercise 1: Inventory Management System
---------------------------------------------------------------------------------------------------------------------------

Scenario:

You are developing an inventory management system for a warehouse. Efficient data storage 
and retrieval are crucial.

---------------------------------------------------------------------------------------------------------------------------
1. Implementation
  Hash Tables and Binary Search Trees (BST)
    Hash Tables:
      A hash table uses a hash function to compute an index into an array of buckets or slots, 
from which the desired value can be found. This allows for fast data retrieval based on keys.

  Binary Search Trees (BST):
      A binary search tree is a data structure in which each node has at most two children, 
referred to as the left child and the right child. For each node, the left subtree contains only 
nodes with keys less than the node's key, and the right subtree only nodes with keys greater than 
the node's key.

---------------------------------------------------------------------------------------------------------------------------
2. Analysis:

  -->Time Complexity Comparison
      o Hash Tables:

         ---> Best Case: O(1)
         ---> Average Case: O(1)
         ---> Worst Case: O(n) (due to collisions)
      o Binary Search Trees (BST):

         ---> Best Case: O(log n) (for balanced trees)
         ---> Average Case: O(log n) (for balanced trees)
         ---> Worst Case: O(n) (for unbalanced trees)
Algorithm Suitability

    o Hash Tables: Suitable for fast lookups, insertions, and deletions when the dataset is large
and key-based access is needed. They perform efficiently under most conditions but can degrade to 
O(n) in the worst case due to hash collisions. Ideal for inventory systems where quick access to 
items based on unique identifiers (like SKU numbers) is required.

  o Binary Search Trees (BST): Suitable for maintaining sorted data and supporting range queries 
efficiently. Balanced BSTs (like AVL trees or Red-Black trees) ensure O(log n) time complexity 
for insertions, deletions, and lookups. They are a good choice when the dataset needs to be 
ordered and support various dynamic set operations efficiently.

---------------------------------------------------------------------------------------------------------------------------
