package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateConverter {
	public static String today() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일",Locale.KOREAN);
		return sdf.format(new Date());
	}
	public static String toClock() {
		SimpleDateFormat sdf = new SimpleDateFormat("a HH:mm");
		return sdf.format(new Date());
	}
	
	public static Date payDay() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm",Locale.KOREAN);
		String ss = sdf.format(new Date());
		Date dd = new Date();
		try {
			dd = sdf.parse(ss);
		}catch(Exception e) {
			
		}
		return dd;
	}
	

	
	public static String reservationDay(String request) {
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		Date date = new Date();
		try {
			date = sdf.parse(request);
		}catch(ParseException e) {
			
		}
		return sdf.format(date);
	}
	public static String reservationDay2(String request) {
		SimpleDateFormat sdf = new SimpleDateFormat("yy월 mm일 E");
		Date date = new Date();
		try {
			date = sdf.parse(request);
		}catch(ParseException e) {
			
		}
		return sdf.format(date);
	}
	public static String untilDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, 2);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(cal.getTime());
	}
}
