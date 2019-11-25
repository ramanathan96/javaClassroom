package test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) throws Exception {
		String dt2="18/09/1991";
		Date today =new SimpleDateFormat("dd/MM/yyyy").parse(dt2);
		
		System.out.println(today);

	}
	

}
