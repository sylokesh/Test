package com.test.Testproject;

public abstract class TestProgram {

	public static void main(String[] args) {
		System.out.println("==========================Long==============");	
		Long var1=127l,var2=127l;
		if(var1==var2)
			System.out.println(" true For 127 var1 == var2");
		else
			System.out.println(" false For 127 var1 == var2");
         var1=-128l;var2=-128l;
		if(var1==var2)
			System.out.println(" true For -128  var1 == var2");
		else
			System.out.println(" false For -128  var1 == var2");
		var1=128l;var2=128l;
		if(var1==var2)
			System.out.println(" true For 128   var1 == var2");
		else
			System.out.println(" false For 128   var1 == var2");
         var1=-129l;var2=-129l;
		if(var1==var2)
			System.out.println(" true For -129   var1 == var2");
		else
			System.out.println(" false For -129   var1 == var2");
		
	System.out.println("==========================Integer==============");	
		
		Integer variable1=127,variable2=127;
		if(variable1==variable2)
			System.out.println(" true For 127 var1 == var2");
		else
			System.out.println(" false For 127 var1 == var2");
		variable1=-128;variable2=-128;
		if(variable1==variable2)
			System.out.println(" true For -128  var1 == var2");
		else
			System.out.println(" false For -128  var1 == var2");
		variable1=128;variable2=128;
		if(variable1==variable2)
			System.out.println(" true For 128   var1 == var2");
		else
			System.out.println(" false For 128   var1 == var2");
		variable1=-129;variable2=-129;
		if(variable1==variable2)
			System.out.println(" true For -129   var1 == var2");
		else
			System.out.println(" false For -129   var1 == var2");
		variable1=129;variable2=128;
			System.out.println("======= "+(variable1>variable2));
		variable1=-129;variable2=-128;
		System.out.println("======= "+(variable1<variable2));
		
	}

}
