package BasicJava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LearnDateTime {

	public static void main(String[] args) {
		String S= System.getProperty("sirName");
		System.out.println(S);
	  LocalDate curdate=	LocalDate.now();
	  System.out.println(curdate);//2021-02-10
	  System.out.println(DateTimeFormatter.ofPattern("d-MMM-YYYY").format(curdate));//10-Feb-2021
	  System.out.println(DateTimeFormatter.ofPattern("d-MMMM-YYYY").format(curdate));//10-February-2021
	  System.out.println(DateTimeFormatter.ofPattern("d-MMM-YY").format(curdate));//10-Feb-21
	  System.out.println(DateTimeFormatter.ofPattern("d-MM-YYYY").format(curdate));//10-02-2021
	  System.out.println(DateTimeFormatter.ofPattern("dd-M-YY").format(curdate));//10-2-21
	  
	String s = String.format("", curdate);
	
	System.out.println("==/>"+s);//10-2-21
	}

}


