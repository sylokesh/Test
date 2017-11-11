package com.test.Testproject;

public class Split {
	public static void main(String args[]){
		String str="Mango 2 / 5 / 2kg";
		System.out.println("Split String"+ str.substring(0,str.lastIndexOf(" / ")));
		
		String stringArray[]=str.split("/");
		System.out.println("0  ::: "+stringArray[0]+"1  ::: "+stringArray[1]+"2  ::: "+stringArray[2]);
		
		
		System.out.println(str.compareTo("Mango 2 / 5 / 2kg"));	
	}
}
