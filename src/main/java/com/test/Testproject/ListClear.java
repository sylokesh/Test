package com.test.Testproject;

import java.util.ArrayList;
import java.util.List;

public class ListClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Long> list=new ArrayList<Long>();
		list.add(123l);
		list.add(223l);
		list.add(323l);
		for(int i=0;i<12;i++)
			list.add(Long.parseLong(String.valueOf(i)));
		System.out.println("  list "+list);
		list.clear();
		
		System.out.println("new Array list "+list);
		
		list=new ArrayList<Long>();
		System.out.println("new Array list "+list);
	}

}
