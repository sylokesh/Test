package com.test.Testproject;

import java.util.Scanner;

public class Calculate {
	 int l, b;
	    public void getData()
	  {
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter value for l and b variable  :     ");
	    l = sc.nextInt();
	    b = sc.nextInt();
	  }
	  public void area()
	  {
	    System.out.println("Area of Rectangle is:" +(l*b));
	  }
	  public void perimeter()
	  {
	    System.out.println("Perimeter of Rectangle is:" + (2*l)+(2*b));
	  }
	  public void  diagonal()
	  {
	    System.out.println("Diagonal Area of Rectangle is:" +((l*l)+(b*b)));
	  }
	  public static void main(String args[])
	  {
	    Calculate c1 = new Calculate();
	    c1.getData();
	    c1.area();
	    c1.perimeter();
	    c1.diagonal();
	  }
	}


