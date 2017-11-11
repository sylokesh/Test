package com.test.Testproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snippet {
	public static void main(String args[]) 
	{
	    List<Integer> a = new ArrayList<Integer>();
	    a.add(0);
	    a.add(0);
	    a.add(4);

	    System.out.println(a);  // prints [0 , 0 , 4]
	    removeZeros(a);
	    System.out.println(a);  // prints [0 , 4] ??   why not just [4]?
	}

	// function to remove all zeros from an integer list
	public static void removeZeros(List<Integer> a) 
	{
         System.out.println("before :  size :  "+a.size());
         for(int i=0;i<a.size();i++){
          if(a.get(i) == 0){
           a.remove(i);
          }
         }
         System.out.println("after :  size :  "+a.size());
	    
	}
}

