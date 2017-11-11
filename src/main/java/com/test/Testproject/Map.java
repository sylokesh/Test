package com.test.Testproject;

import java.util.HashMap;
import java.util.Map.Entry;


public class Map {
	public static void main(String args[]){
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(1111, "Lokesh");
		map.put(1112, "Manish");
		map.put(1113, "Santosh");
		map.put(1114, "Sandeep Kumar");
		map.put(1115, "Ravi Prkash");
		map.put(1116, "Pamod");
		map.put(1117, null);
		System.out.println("map:::::::::::"+map.replace(1111, "Saroj Kumar Singh"));
		for(Entry<Integer, String> it:map.entrySet()){
			System.out.println("Key "+it.getKey()+"Value   "+it.getValue()  +"Hash code"+it.hashCode() +" ToString"+it.toString());
		}
		for(Integer it:map.keySet()){
			System.out.println(" ToString"+it.toString());
		}
		
	}
}


