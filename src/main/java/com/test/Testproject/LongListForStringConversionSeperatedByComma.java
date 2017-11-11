package com.test.Testproject;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.util.ClassUtil;

public class LongListForStringConversionSeperatedByComma {
	public static void main (String args[]){
		System.out.println("  Long list to string Conversion seperated by comma.");
		List<Long> tempLongList=new ArrayList<Long>();
		tempLongList.add(1l);
		tempLongList.add(2l);
		tempLongList.add(3l);
		tempLongList.add(4l);
		tempLongList.add(5l);
		tempLongList.add(6l);
		tempLongList.add(7l);
		tempLongList.add(8l);
		tempLongList.add(9l);
	}
}
