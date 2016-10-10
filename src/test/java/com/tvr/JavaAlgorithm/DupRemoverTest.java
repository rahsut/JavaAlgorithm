/**
 * 
 */
package com.tvr.JavaAlgorithm;

import junit.framework.TestCase;


/**
 * @author Rahsut
 *
 */
public class DupRemoverTest extends TestCase {

	/**
	 * @param name
	 */
	
	public static int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
	
	DupRemover df;
	
	public DupRemoverTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		df = new DupRemover();
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.tvr.JavaAlgorithm.DupRemover#remDuplN2(int[])}.
	 */
	public final void testRemDuplN2() {
    	
    	
		int[] intUniqueN2 = df.remDuplN2(randomIntegers.clone());
		assertNotNull("testRemDuplN2 asserting that array is not null",intUniqueN2);
		testDisplayUniqueNum("testRemDuplN2",intUniqueN2);
		
	}

	/**
	 * Test method for {@link com.tvr.JavaAlgorithm.DupRemover#remDuplHashSet(int[])}.
	 */
	public final void testRemDuplHashSet() {
		int[] intUniqueHS = df.remDuplHashSet(randomIntegers.clone());
		assertNotNull("testRemDuplHashSet asserting that array is not null",intUniqueHS);
		testDisplayUniqueNum("testRemDuplHashSet",intUniqueHS);
	}

	/**
	 * Test method for {@link com.tvr.JavaAlgorithm.DupRemover#remDuplOrdered(int[])}.
	 */
	public final void testRemDuplOrdered() {
		int[] intUniqueOrdered = df.remDuplOrdered(randomIntegers.clone());
		assertNotNull("testRemDuplOrdered asserting that array is not null",intUniqueOrdered);
		
		testDisplayUniqueNum("testRemDuplOrdered",intUniqueOrdered);
	}

	/**
	 * Test method for {@link com.tvr.JavaAlgorithm.DupRemover#remDuplLHS(int[])}.
	 */
	public final void testRemDuplLHS() {
		int[] intUniqueLHS = df.remDuplLHS(randomIntegers.clone());
		assertNotNull("testRemDuplLHS asserting that array is not null",intUniqueLHS);
		testDisplayUniqueNum("testRemDuplLHS",intUniqueLHS);
	}

	/**
	 * Test method for {@link com.tvr.JavaAlgorithm.DupRemover#displayUniqueNum(java.lang.int[])}.
	 */
	public final void testDisplayUniqueNum(String sMethodName,int[] intUnique) {
		assertEquals(sMethodName,true,df.displayUniqueNum(sMethodName,intUnique));
	}

}
