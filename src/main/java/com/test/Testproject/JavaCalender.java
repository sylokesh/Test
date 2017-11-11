package com.test.Testproject;

import java.util.Calendar;

public class JavaCalender {
	 int hour, minute, second;

	    public void setCurrent() {
	        Calendar calendar = Calendar.getInstance();
	        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
	        this.minute = calendar.get(Calendar.MINUTE);
	        this.second = calendar.get(Calendar.SECOND);
	    }

	    public int getHour() {
	        return hour;
	    }

	    public int getMinute() {
	        return minute;
	    }

	    public int getSecond() {
	        return minute;
	    }
	}
class TestJavaCalender {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaCalender test = new JavaCalender();
        System.out.print(test.getHour() + "\n" + test.getMinute() + "\n" + test.getSecond());

	}

}
