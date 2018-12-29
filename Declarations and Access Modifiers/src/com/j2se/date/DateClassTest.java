package com.j2se.date;

import java.util.Date;
//import java.sql.Date; 
/*Using the import statement above will through ambiguous error
 * CE: reference to Date is ambiguous
 * 
 * NOTE:
 * -----
 * Same error will be there for List as it is present in java.awt.*; and java.util.*; packages
 * */ 

public class DateClassTest {

	public static void main(String[] args) {
		Date d=new Date();
		
		System.out.println(d.getYear());

	}

}
