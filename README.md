
# JavaAlgorithm


The logic with 4 methods i present in below java Class,
src.main.java
com.tvr.JavaAlgorithm.DupRemover.java

The Main Method to call above code is present in below class,
src.main.java
com.tvr.JavaAlgorithm.DeDup.java

The Project can be tested through Junit class
src.test.java
com.tvr.JavaAlgorithm.DupRemoverTest.java

The Project Displays 4 Use Cases to Remove Duplicate from an Integer array,

1.)	remDuplN2: Remove Duplicates by nested FOR loop

	  Advantages:
1.)	Simpler Logic.
	  
	  Disadvantages:
	  1.) This method will always have time complexity of O(n^2). 
	  2.) Does not retain Insertion Order.
	  3.) This method is good for small set of array, but would hamper the performance on large set of data
	  
	  Best Suited for small arrays where Insertion order is not necessary.

	 


2.)	remDuplHashSet: Remove Duplicates from the array by using HashSet.

	  
Advantages:
	  1.) Code is more simple as uses collection framework API(HashSet) to do bulk of work.
	  2.) Performance better than linkedhashset	  
	  
Disadvantages:
	  
	  1.) Insertion order is not maintained
	   
	   Best Suited for large arrays where Insertion order is not necessary.
	 


3.)	 remDuplOrdered:  Remove duplicates by looping through array and assigning unique value to new array.
This method retains original order of the integer array. 
		 
 Advantages:
		  1.) Code is simple.
		  2.) Retains Insertion Order
		  
	Disadvantages:		  
		  1.) Time complexity is o(n^2) for insertion.
		   
Best Suited for small arrays where Insertion order is necessary
		 


4.)	remDupsLinkedHashSet:  Remove duplicates using collection framework API (LinkedHashSet) and retain original order
	  Advantages:
	  1.) Code is more compact as it uses java Collection API(LinkedHashSet).
	  2.) Retains Insertion Order.
	  3.) This method retains original order of the integer array.
	  4.) LinkedHashSet can have Null value. 

	  
	  Disadvantages:	  
1.)	Don't use this method if you have memory constraint, as this method internally uses HashTable + LinkedList.LinkedHashSet has overhead of maintaining doubly linked list when an element is inserted or deleted.
2.) Worst case time complexity is O(n*m) complexity (O(n)*O(m)) where n is the number of elements in your ArrayList and m being the number of elements on average in each LinkedHashSet.
	   
	   Best Suited for large arrays or Production Code where Insertion order is necessary.
	 	

