package demo.hmvc.base.core.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	public static String getCurrentTimeStamp(int horas) {
		
		Date Fecha = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(Fecha);
		calendar.add(Calendar.HOUR_OF_DAY, horas);
		
	    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
	}
	
	public static String getCurrentTimeStampDays(int dia) {
		
		Date Fecha = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(Fecha);
		calendar.add(Calendar.DAY_OF_WEEK, dia);
		
	    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
	}
	
	
	public static String getCurrentTimeStamp() {		
	    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

}
