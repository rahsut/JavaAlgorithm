package com.tvr.JavaAlgorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DupRemover {



	
	/**
	 * public void remDuplN2(int[] inputRandomIntegers)
	 * Advantages:
	 * 1.) Simpler Logic	 * 
	 * DisAdvantages:
	 * 1.) This method will always have time complexity of O(n^2). 
	 * 2.) Does not retain Insertion Order.
	 * 3.) This method is good for small set of array, but would hamper the performance on large set of data
	 * 
	 * Best Suited for small arrays where Insertion order is not necessary and for beginner learners of programming.
	 * 
	 * @param numbers an array of integers
	 */
	
	public int[] remDuplN2(int[] randArray)
	{
		try {
			if(randArray==null||randArray.length<1){
				return null;
			}
			
			int arrLen = randArray.length;
			for (int i = 0; i < arrLen; i++) 
			{
				for (int j = i+1; j < arrLen; j++) 
				{
					if(randArray[i]==randArray[j]){
						//replace the Duplicate element to last element
						randArray[j]=randArray[arrLen-1];
						arrLen--;
						j--;
					}					

				}				
			}   

			int[] uniArray = new int[arrLen];

			//Copy only till unique element
			System.arraycopy(randArray, 0, uniArray, 0, arrLen);
			
			return  uniArray;

		} catch (Exception e) {
			e.printStackTrace();
			
		}  
		return null;
	}

	/**
	 * public int[] remDuplHashSet(int[] randArray)
	 * Remove duplicates by looping through array and assigning unique value to new array.
	 * This method retains original order of the integer array. 
	 * Advantages:
	 * 1.)code is more simple.
	 * 2.) time complexity better than linked hashset
	 * 
	 * DisAdvantages:
	 * 
	 * 1.) Insertion order is not maintained
	 *  
	 *  Best Suited for large arrays where Insertion order is not necessary
	 * 
	 * @param numbers an array of integers
	 */
	 public int[] remDuplHashSet(int[]randArray) {
	    try {
	    	if(randArray==null||randArray.length<1){
				return null;
			}
			Set <Integer>  returnResults =  new HashSet<Integer>();
			
			
			for (int nextInt : randArray) 
			    returnResults.add(nextInt);
			
			
			Integer[] uniIArray = returnResults.toArray(new Integer[returnResults.size()]);
			
			int[] uniArray = new int[returnResults.size()];
			for (int i = 0; i < uniIArray.length; i++) {
				uniArray[i] = uniIArray[i];//Integer.valueOf(uniIArray[i]);
			}
			
			return uniArray;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return null;
	 }

		/**
		 * public int[] remDuplOrdered(int[] randArray)
		 * Remove duplicates by looping through array and assigning unique value to new array.
		 * This method retains original order of the integer array. 
		 * Advantages:
		 * 1.)code is more simple.
		 * 2.) Retains Insertion Order
		 * 
		 * DisAdvantages:
		 * 
		 * 1.) time complexity is o(n^2) for insertion 
		 *  
		 *  Best Suited for small arrays where Insertion order is necessary
		 * 
		 * @param numbers an array of integers
		 */
	public int[] remDuplOrdered(int[]randArray) {
		try {
			if(randArray==null||randArray.length<1){
				return null;
			}
			List<Integer> listUniqueInt=new ArrayList<Integer>();
			for (int ArrayIndexInt : randArray) {
				if (!listUniqueInt.contains(ArrayIndexInt)) 
				{  
					listUniqueInt.add(ArrayIndexInt);
				}
			}
			Integer[] uniIArray = listUniqueInt.toArray(new Integer[listUniqueInt.size()]);			
			
			int[] uniArray = new int[listUniqueInt.size()];
			for (int i = 0; i < uniIArray.length; i++) {
				uniArray[i] = uniIArray[i];//Integer.valueOf(uniIArray[i]);
			}
			
			return uniArray;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	/**
	 * public int[] remDupsLinkedHashSet(int[] randArray)
	 * Remove duplicates using collection framework API and retain original order
	 * This method retains original order of the integer array.
	 * LinkedHashSet can have Null value. 
	 * Advantages:
	 * 1.)code is more compact as it uses java collection(LinkedHashSet).
	 * 2.) Retains Insertion Order
	 * 
	 * DisAdvantages:
	 * 
	 * 1.)Don't use this method if you have memory constraint, as this method internally uses HashTable + LinkedList.
	 * LinkedHashSet has overhead of maintaining doubly linked list when an element is inserted or deleted.
	 * 2.) Worst case time complexity is O(n*m) complexity (O(n)*O(m)) where n is the number of elements in your ArrayList 
	 *  and m being the number of elements on average in each LinkedHashSet.
	 *  
	 *  Best Suited for large arrays or Production Code where Insertion order is necessary
	 * 
	 * @param numbers an array of integers
	 */	
	public int[] remDuplLHS(int[] randArray){

		try {
			if(randArray==null||randArray.length<1){
				return null;
			}
			int i = 0;
			int[] uniArray = null;
			Set<Integer> setNumbers = new LinkedHashSet<Integer>();

			//Add integer array to LinkedHashSet
			for(int num : randArray){
				setNumbers.add(num);
			}

			uniArray = new int[setNumbers.size()];

			//convert LinkedHashSet to integer array
			for (Iterator<Integer> iterator = setNumbers.iterator(); iterator.hasNext();) {
				uniArray[i++] = iterator.next();
			}
			return uniArray;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}



	public boolean displayUniqueNum(String sMethodName,int[] intUnique) {

		try {
			if(intUnique==null){
				System.out.println("\nNo Numbers to Display");
				return false;
			}

			System.out.println("\n"+sMethodName);
			for (int i : intUnique) {
				System.out.print(i+", ");
			}
			System.out.println("");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
