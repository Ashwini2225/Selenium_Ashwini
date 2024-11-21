package com.ShoppersStack.GU;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	
	public int generateRandomNum() {
	Random r = new Random();
	int num = r.nextInt(1000);
	return num;
	}
	 
	  public String localDate() {  
	   String date = LocalDate.now().toString().replace("-", "");
	   return date;
	  
	  }
	  
	  public String localDateTime() {
	   String datetime = LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(".", "");
	  return datetime;
	  }
	

}
