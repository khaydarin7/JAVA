package pedlet;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex04_2 {

	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy�� MM��dd�� HH��mm��ss��");
		Calendar time = Calendar.getInstance();
		String format_time = format.format(time.getTime());
		System.out.println(format_time);
	}

}
