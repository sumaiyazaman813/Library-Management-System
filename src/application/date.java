package application;

import java.time.LocalDate;
import java.time.Period;

public class date {
	
	public static void display(String name ,int d1,int m1,int y1,int d,int m,int y) {
	
		
     	
		
		LocalDate today =LocalDate.of(y, m, d);                        //Today's date
		LocalDate give = LocalDate.of(y1, m1, d1);  //Birth date
		 
		Period p = Period.between(give, today);
		 
		
		//System.out.println(p.getDays());
	//	System.out.println(p.getMonths());
		System.out.println(p.getYears());
		
		int dayx=p.getYears()*354+p.getMonths()*30+p.getDays();
		System.out.println(dayx);
		
		if(dayx>10) {
			int money= (dayx-10)*10;
			String x = String.valueOf(money);
			String Message1="  HAVE TO PAY TAKA   ";
			String Message= name+Message1+x;
			alert.display("Due PAYMENT", Message);
		}
		else {
			alert.display("Due PAYMENT", "NO DUE");
		}
		
	}

}
