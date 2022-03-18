package com.training.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.model.BinarySearch;

public class BinarySearchTest {
	
	private BinarySearch binarysearch;
	@BeforeEach
	public void setUp() throws Exception {
		binarysearch = new BinarySearch();
	}
	@Test
	public void IfArray_IsEmpty_return_False() {
	assertEquals(false, binarysearch.find(new int[] {}, 1));
	}
	@Test
	public void IfArrayIs_NotOdd_return_False() {
	assertEquals(false,
			binarysearch.find(new int[] { 12, 45, 67, 89, 190, 234, 678 },100));
	}
	@Test
	public void IfArrayIs_NotEven_return_False() {
	assertEquals(false,
			binarysearch.find(new int[] { 12, 44, 66, 88, 190, 234, 678, 753 },99));
	}
	@Test
	public void IfArrayFound_AtStart_return_true() {
	assertEquals(true,
			binarysearch.find(new int[] {12, 44, 66, 88, 190, 234, 678 },12));
	}
	@Test
	public void IfArrayFound_AtEnd_return_true() {
	assertEquals(true,
			binarysearch.find(new int[] { 12, 44, 66, 88, 190, 234, 678 },678));
	}
	@Test
	public void If_ArrayFoundAt_Middel_return_true() {
	assertEquals(true,
			binarysearch.find(new int[] {12, 44, 66, 88, 190, 234, 678 },88));
	}
	
	@AfterEach
    public void tearDown() {
		binarysearch = null;
    }

}
