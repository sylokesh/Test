package com.test.Testproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUnsortList {

	public static void main(String[] args) {
		 List<Integer> testList=new ArrayList<Integer>();
		   testList.add(75);
		    testList.add(2);
		    testList.add(0);
		    testList.add(1);
		    testList.add(10);
		    testList.add(25);
		    testList.add(60);
		    testList.add(40);
		    testList.add(70);
		    testList.add(2);
		    testList.add(3);
		    testList.add(4);
		    testList.add(5);
		    testList.add(6);
		    testList.add(10);
		    testList.add(15);
		    Collections.sort(testList); // ascending order
		    System.out.println("ascending order "+testList); 
		    Collections.reverse(testList);  // descending order 
		    System.out.println("descending order "+testList);
	}

}
