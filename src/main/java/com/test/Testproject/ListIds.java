package com.test.Testproject;

import java.util.ArrayList;
import java.util.List;

public class ListIds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ids = new ArrayList<String>();
		ids.add("1");
		ids.add("2");
		ids.add("3");
		ids.add("4");
		String idList = ids.toString();
		String csv = idList.substring(1, idList.length() - 1).replace(", ", ",");
		System.out.println("idList"+idList);
		System.out.println("csv   "+csv);

	}

}
