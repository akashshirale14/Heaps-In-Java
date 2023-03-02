# Heaps-In-Java

Important points when you build heaps:
1) Remember heap is a complete BT,n-ary Tree/ almost complete BT/n-ary structure(which can be represented by a list)
2) In that structure, calculate if you have n nodes in Complete BT/almost complete BT then how many nodes are leaf nodes. (Math.floor(N/2)+1 to N are leaf Nodes)
3) Now know that a node in a heap is greater than all elements in its own subtree,therefore, each leaf node is itself a heap.
4) Now start with the last non-leaf node and then run heapify algorithm on it and make it the greatest node in its own subtree..similarly do this for all non-leaf nodes
   upto the root node.
5) The step 4 will happen in a recursive manner,read the max_heapify method to understand more.


Implementing Max and Min Heap algorithms

1) Max_Heapify is the method which builds the max heap (other Implementation pending)
2) Extract_Max_Value is the method which polls the largest element from the heap.
